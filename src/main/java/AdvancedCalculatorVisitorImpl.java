import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class AdvancedCalculatorVisitorImpl extends AdvancedCalculatorBaseVisitor<Object> {

    private final OutputStream stream;
    private LinkedHashMap<String, Object> variables = new LinkedHashMap<>();
    private Stack<LinkedHashMap<String,Object>> stack = new Stack<>();

    public AdvancedCalculatorVisitorImpl(OutputStream stream) {

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
        else throw new RuntimeException("Cannot perform this operation on these datatypes");
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
        boolean valueMoreThanOneItem = true;

        //if value is not a list, make a singleton list out of it
        if (!(value instanceof ArrayList)){
            value = Collections.singletonList(value);
            valueMoreThanOneItem = false;
        }


        stack.push(new LinkedHashMap<>(variables));

        List<Object> result = new ArrayList<>();
        for (Object item : ((List)value)){
            this.variables.put(ctx.VARIABLE().getText(), item);
            result.add(visit(ctx.expression(1)));
        }
        //'foreach ' VARIABLE 'in ' expression ' do ' expression

        variables = stack.pop();
        if (valueMoreThanOneItem){
            return result;
        }
        else {
            return result.get(0);
        }

    }



}
