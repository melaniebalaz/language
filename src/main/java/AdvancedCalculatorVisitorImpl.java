import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class AdvancedCalculatorVisitorImpl extends AdvancedCalculatorBaseVisitor<Object> {

    private final OutputStream stream;
    private LinkedHashMap<String, Object> variables = new LinkedHashMap<>();
    private Stack<LinkedHashMap<String,Object>> stack = new Stack<>();

    private class Function {
        private List<TerminalNode> parameters;
        private List<AdvancedCalculatorParser.StatementContext> statements;

        private Function(List<TerminalNode> parameters, List<AdvancedCalculatorParser.StatementContext> statements) {
            this.parameters = parameters;
            this.statements = statements;
        }
    }

    public AdvancedCalculatorVisitorImpl(OutputStream stream, List<BuiltInFunction> functions) {
        if (functions != null){
            for (BuiltInFunction function : functions){
                variables.put(function.getName(),function);
            }
        }

        this.stream = stream;
    }


    @Override
    public BigDecimal visitNum(AdvancedCalculatorParser.NumContext ctx) {
        return new BigDecimal(ctx.NUMBER().getText());
    }

    @Override
    public String visitString(AdvancedCalculatorParser.StringContext ctx) {
        return (ctx.STRING().toString().replaceAll("\"",""));
    }

    @Override
    public ArrayList visitList(AdvancedCalculatorParser.ListContext ctx){
        ArrayList<Object> list = new ArrayList<>();
        for (AdvancedCalculatorParser.DatacontainerContext data : ctx.datacontainer()) {
            list.add(visit(data));
        }
        return list;
    }

    @Override
    /**
     * Returns the value of a variable being used as part of an expression
     * Variable needs to already have a value set as part of an expression
     * @throws: Runtime Exception
     */
    public Object visitVar(AdvancedCalculatorParser.VarContext ctx){
        String variableName = (ctx.VARIABLE().getText());
        if (!this.variables.containsKey(variableName)){
            throw new RuntimeException("Variable not set");
        }
        return this.variables.get(variableName);
    }

    @Override
    public Object visitParens(AdvancedCalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public BigDecimal visitMulDiv(AdvancedCalculatorParser.MulDivContext ctx) {
        final Object left = visit(ctx.expression(0));
        final Object right = visit(ctx.expression(1));
        if (left instanceof BigDecimal && right instanceof BigDecimal){
            if (ctx.op.getText().equals("*")) {
                return ((BigDecimal)left).multiply((BigDecimal)right);
            } else {
                return ((BigDecimal)left).divide((BigDecimal)right, 9, RoundingMode.HALF_UP);
            }
        }
        else throw new RuntimeException("Cannot perform this operation on these datatypes");


    }

    @Override
    public BigDecimal visitAddSub(AdvancedCalculatorParser.AddSubContext ctx) {
        final Object left = visit(ctx.expression(0));
        final Object right = visit(ctx.expression(1));
        if (left instanceof BigDecimal && right instanceof BigDecimal){
            if (ctx.op.getText().equals("+")) {
                return ((BigDecimal)left).add((BigDecimal)right);
            } else {
                return ((BigDecimal)left).subtract((BigDecimal)right);
            }
        }
        else throw new RuntimeException("Cannot perform this operation on these datatypes: " +  left.getClass().getName() );
    }


    @Override
    public Object visitAssignment(AdvancedCalculatorParser.AssignmentContext ctx) {
        final String variableName = (ctx.VARIABLE().getText());
        final Object right = visit(ctx.expression());
        this.variables.put(variableName,right);
        return right;
    }

    @Override
    public Object visitStart(AdvancedCalculatorParser.StartContext ctx) {
        List<AdvancedCalculatorParser.StatementContext> statements = ctx.statement();
        //returns the result of the last visit call
        return statements.stream().map(this::visit).reduce((first, second) -> second).get();
    }

    @Override
    public Object visitPrint(AdvancedCalculatorParser.PrintContext ctx) {
        String value = visit(ctx.expression()).toString();
        try {
            stream.write(value.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return value;
    }


    /**
     *
     * @param ctx
     * @return
     * 'foreach ' VARIABLE 'in ' expression ' do ' expressio
     */
    public Object visitForeach(AdvancedCalculatorParser.ForeachContext ctx){
        Object value = visit(ctx.expression(0));

        //if value is not a list, make a singleton list out of it
        if (!(value instanceof List)){
           throw new RuntimeException("Foreach can only be applied to a list");
        }


        stack.push(new LinkedHashMap<>(variables));

        List<Object> result = new ArrayList<>();
        for (Object item : ((List)value)){
            this.variables.put(ctx.VARIABLE().getText(), item);
            result.add(visit(ctx.expression(1)));
        }

        variables = stack.pop();

        return result;

    }


    public Object visitDeclaration(AdvancedCalculatorParser.DeclarationContext ctx){
        List<TerminalNode> parameters = ctx.VARIABLE();
        List<AdvancedCalculatorParser.StatementContext> statements = ctx.statement();

        return new Function(parameters,statements);
    }

    public Object visitFunctionCall(AdvancedCalculatorParser.FunctionCallContext ctx){
        Object function = variables.get(ctx.VARIABLE().getText());
        List<AdvancedCalculatorParser.ExpressionContext> param = ctx.expression();
        if (function == null){
            throw new RuntimeException(ctx.VARIABLE().getText() + " is not declared");
        }

       if (function instanceof  BuiltInFunction){
           BuiltInFunction castedFunction = (BuiltInFunction)function;
           if (castedFunction.getParameterCount() != param.size()){
               throw new RuntimeException("Missing parameters!");
           }
           List<Object> parameters = new ArrayList<>();

           for (int i = 0; i < param.size(); i++){
               parameters.add(visit(param.get(i)));
           }
           return castedFunction.execute(parameters);

       }else if (function instanceof Function) {
            Function castedFunction = (Function)function;
           //Expressions as parameters

           stack.push(new LinkedHashMap<>(variables));

           if (castedFunction.parameters.size() != param.size()){
               throw new RuntimeException("Missing parameters!");
           }

           for (int i = 0; i < param.size(); i++){
               variables.put(castedFunction.parameters.get(i).getText(),visit(param.get(i)));
           }


           Object result = castedFunction.statements.stream().map(this::visit).reduce((first, second) -> second).get();

           variables = stack.pop();
           return result;
       }
       else {
            throw new RuntimeException(ctx.VARIABLE().getText() + " is not a function");
       }


    }



}
