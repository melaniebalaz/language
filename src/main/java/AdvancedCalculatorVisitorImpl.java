import operations.AdditionInterface;
import operations.DivisionInterface;
import operations.MultiplicationInterface;
import operations.SubtractionInterface;
import org.antlr.v4.runtime.tree.TerminalNode;
import primitives.DataTypeInterface;
import primitives.ListType;
import primitives.NumberType;
import primitives.StringType;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class AdvancedCalculatorVisitorImpl extends AdvancedCalculatorBaseVisitor<DataTypeInterface> {

    private final OutputStream stream;
    private LinkedHashMap<String, DataTypeInterface> variables = new LinkedHashMap<>();
    private Stack<LinkedHashMap<String,DataTypeInterface>> stack = new Stack<>();

    public AdvancedCalculatorVisitorImpl(OutputStream stream, List<BuiltInFunctionInterface> functions) {
        if (functions != null){
            for (BuiltInFunctionInterface function : functions){
                variables.put(function.getName(),function);
            }
        }

        this.stream = stream;
    }


    @Override
    public NumberType visitNum(AdvancedCalculatorParser.NumContext ctx) {
        return new NumberType(new BigDecimal(ctx.NUMBER().getText()));
    }

    @Override
    public StringType visitString(AdvancedCalculatorParser.StringContext ctx) {
        return new StringType(ctx.STRING().toString().replaceAll("\"",""));
    }

    @Override
    public ListType visitList(AdvancedCalculatorParser.ListContext ctx){
        List<DataTypeInterface<?>> list = new ArrayList<>();
        for (AdvancedCalculatorParser.DatacontainerContext data : ctx.datacontainer()) {
            list.add(visit(data));
        }
        return new ListType(list);
    }

    @Override
    public DataTypeInterface visitAssignment(AdvancedCalculatorParser.AssignmentContext ctx) {
        final String variableName = (ctx.VARIABLE().getText());
        final DataTypeInterface right = visit(ctx.expression());
        this.variables.put(variableName,right);
        return right;
    }

    @Override
    /**
     * Returns the value of a variable being used as part of an expression
     * Variable needs to already have a value set as part of an expression
     * @throws: Runtime Exception
     */
    public DataTypeInterface visitVar(AdvancedCalculatorParser.VarContext ctx){
        String variableName = (ctx.VARIABLE().getText());
        if (!this.variables.containsKey(variableName)){
            throw new RuntimeException("Variable not set");
        }
        return this.variables.get(variableName);
    }

    @Override
    public DataTypeInterface visitParens(AdvancedCalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    public DataTypeInterface visitAdd(AdvancedCalculatorParser.AddContext ctx) {
        DataTypeInterface left = visit(ctx.expression(0));
        DataTypeInterface right = visit(ctx.expression(1));
        if (left instanceof AdditionInterface && right instanceof AdditionInterface){
            return ((AdditionInterface) left).add(right);
        }
        else throw new RuntimeException("Cannot add " + left.getClass().getName() + " and " + right.getClass().getName());
    }

    public DataTypeInterface visitSub(AdvancedCalculatorParser.SubContext ctx) {
        DataTypeInterface left = visit(ctx.expression(0));
        DataTypeInterface right = visit(ctx.expression(1));
        if (left instanceof SubtractionInterface && right instanceof SubtractionInterface){
            return ((SubtractionInterface) left).subtract(right);
        }
        else throw new RuntimeException("Cannot add " + left.getClass().getName() + " and " + right.getClass().getName());
    }

    public DataTypeInterface visitMul(AdvancedCalculatorParser.MulContext ctx) {
        DataTypeInterface left = visit(ctx.expression(0));
        DataTypeInterface right = visit(ctx.expression(1));
        if (left instanceof MultiplicationInterface && right instanceof MultiplicationInterface){
            return ((MultiplicationInterface) left).multiply(right);
        }
        else throw new RuntimeException("Cannot add " + left.getClass().getName() + " and " + right.getClass().getName());
    }

    public DataTypeInterface visitDiv(AdvancedCalculatorParser.DivContext ctx) {
        DataTypeInterface left = visit(ctx.expression(0));
        DataTypeInterface right = visit(ctx.expression(1));
        if (left instanceof DivisionInterface && right instanceof DivisionInterface){
            return ((DivisionInterface) left).divide(right);
        }
        else throw new RuntimeException("Cannot add " + left.getClass().getName() + " and " + right.getClass().getName());
    }

    /**
    @Override
    public DataTypeInterface visitMulDiv(AdvancedCalculatorParser.MulDivContext ctx) {
        final DataTypeInterface left = visit(ctx.expression(0));
        final DataTypeInterface right = visit(ctx.expression(1));
        if (left instanceof BigDecimal && right instanceof BigDecimal){
            if (ctx.op.getText().equals("*")) {
                return ((BigDecimal)left).multiply((BigDecimal)right);
            } else {
                return ((BigDecimal)left).divide((BigDecimal)right, 9, RoundingMode.HALF_UP);
            }
        }
        else throw new RuntimeException("Cannot perform this operation on these datatypes");


    }
    **/

    /**
    @Override
    public DataTypeInterface visitAddSub(AdvancedCalculatorParser.AddSubContext ctx) {
        final DataTypeInterface left = visit(ctx.expression(0));
        final DataTypeInterface right = visit(ctx.expression(1));
        if (left instanceof BigDecimal && right instanceof BigDecimal){
            if (ctx.op.getText().equals("+")) {
                return ((BigDecimal)left).add((BigDecimal)right);
            } else {
                return ((BigDecimal)left).subtract((BigDecimal)right);
            }
        }
        else throw new RuntimeException("Cannot perform this operation on these datatypes: " +  left.getClass().getName() );
    }
     **/

    @Override
    public DataTypeInterface visitStart(AdvancedCalculatorParser.StartContext ctx) {
        List<AdvancedCalculatorParser.StatementContext> statements = ctx.statement();
        //returns the result of the last visit call
        return statements.stream().map(this::visit).reduce((first, second) -> second).get();
    }

    @Override
    public DataTypeInterface visitPrint(AdvancedCalculatorParser.PrintContext ctx) {
        DataTypeInterface value = visit(ctx.expression());
        String string = value.getRawType().toString();
        try {
            stream.write(string.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new StringType(string);
    }


    /**
     *
     * @param ctx
     * @return
     * 'foreach ' VARIABLE 'in ' expression ' do ' expressio
     */
    public ListType visitForeach(AdvancedCalculatorParser.ForeachContext ctx){
        DataTypeInterface value = visit(ctx.expression(0));

        //if value is not a list, make a singleton list out of it
        if (!(value instanceof ListType)){
           throw new RuntimeException("Foreach can only be applied to a list");
        }


        stack.push(new LinkedHashMap<>(variables));

        List<DataTypeInterface<?>> result = new ArrayList<>();
        for (DataTypeInterface item : (List<DataTypeInterface>)value.getRawType()){
            this.variables.put(ctx.VARIABLE().getText(), item);
            result.add(visit(ctx.expression(1)));
        }

        variables = stack.pop();

        return new ListType(result);

    }


    public DataTypeInterface visitDeclaration(AdvancedCalculatorParser.DeclarationContext ctx){
        List<TerminalNode> parameters = ctx.VARIABLE();
        List<AdvancedCalculatorParser.StatementContext> statements = ctx.statement();

        return new FunctionType(parameters,statements);
    }

    public DataTypeInterface visitFunctionCall(AdvancedCalculatorParser.FunctionCallContext ctx){
        Object function = variables.get(ctx.VARIABLE().getText());
        List<AdvancedCalculatorParser.ExpressionContext> param = ctx.expression();
        if (function == null){
            throw new RuntimeException(ctx.VARIABLE().getText() + " is not declared");
        }

       if (function instanceof BuiltInFunctionInterface){
           BuiltInFunctionInterface castedFunction = (BuiltInFunctionInterface)function;
           if (castedFunction.getParameterCount() != param.size()){
               throw new RuntimeException("Missing parameters!");
           }
           List<DataTypeInterface> parameters = new ArrayList<>();

           for (int i = 0; i < param.size(); i++){
               parameters.add(visit(param.get(i)));
           }
           return castedFunction.execute(parameters);

       }else if (function instanceof FunctionType) {
            FunctionType castedFunction = (FunctionType)function;
           //Expressions as parameters

           stack.push(new LinkedHashMap<>(variables));

           if (castedFunction.getParameters().size() != param.size()){
               throw new RuntimeException("Missing parameters!");
           }

           for (int i = 0; i < param.size(); i++){
               variables.put(castedFunction.getParameters().get(i).getText(),visit(param.get(i)));
           }


           DataTypeInterface result = castedFunction.getStatements().stream().map(this::visit).reduce((first, second) -> second).get();

           variables = stack.pop();
           return result;
       }
       else {
            throw new RuntimeException(ctx.VARIABLE().getText() + " is not a function");
       }


    }



}
