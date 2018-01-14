import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AdvancedCalculatorVisitorImpl extends AdvancedCalculatorBaseVisitor<BigDecimal> {

    private LinkedHashMap<String, BigDecimal> variables = new LinkedHashMap<>();


    @Override
    public BigDecimal visitNum(AdvancedCalculatorParser.NumContext ctx) {
        return new BigDecimal(ctx.NUMBER().getText());
    }


    @Override
    /**
     * Returns the value of a variable being used as part of an expression
     * Variable needs to already have a value set as part of an expression
     * @throws: Runtime Exception
     */
    public BigDecimal visitVar(AdvancedCalculatorParser.VarContext ctx){
        String variableName = (ctx.VARIABLE().getText());
        if (!this.variables.containsKey(variableName)){
            return new BigDecimal(0);
        }
        return this.variables.get(variableName);
    }

    @Override
    public BigDecimal visitParens(AdvancedCalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public BigDecimal visitMulDiv(AdvancedCalculatorParser.MulDivContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            return left.multiply(right);
        } else {
            return left.divide(right, 9, RoundingMode.HALF_UP);
        }
    }

    @Override
    public BigDecimal visitAddSub(AdvancedCalculatorParser.AddSubContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("+")) {
            return left.add(right);
        } else {
            return left.subtract(right);
        }
    }


    @Override
    public BigDecimal visitAssignment(AdvancedCalculatorParser.AssignmentContext ctx) {
        final String variableName = (ctx.VARIABLE().getText());
        final BigDecimal right = visit(ctx.expression());
        this.variables.put(variableName,right);
        return right;
    }

    @Override
    public BigDecimal visitStart(AdvancedCalculatorParser.StartContext ctx) {
        List<AdvancedCalculatorParser.StatementContext> statements = ctx.statement();
        //returns the result of the last visit call
        return statements.stream().map(this::visit).reduce((first, second) -> second).get();
    }

    // TODO Implementieren sie die fehlenden Methoden (Sie brauchen einen Speicher um den aktuellen Wert der Variablen
    // TODO ablegen zu können - wählen Sie dazu eine entsprechende Datenstruktur).


}
