import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorVisitorImpl extends CalculatorBaseVisitor<BigDecimal> {
    @Override
    public BigDecimal visitNum(CalculatorParser.NumContext ctx) {
        return new BigDecimal(ctx.NUMBER().getText());
    }

    @Override
    public BigDecimal visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public BigDecimal visitMulDiv(CalculatorParser.MulDivContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("*")) {
            return left.multiply(right);
        } else {
            return left.divide(right, 9, RoundingMode.HALF_UP);
        }
    }

    @Override
    public BigDecimal visitAddSub(CalculatorParser.AddSubContext ctx) {
        final BigDecimal left = visit(ctx.expression(0));
        final BigDecimal right = visit(ctx.expression(1));
        if (ctx.op.getText().equals("+")) {
            return left.add(right);
        } else {
            return left.subtract(right);
        }
    }
}
