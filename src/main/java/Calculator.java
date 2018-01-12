import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;

public class Calculator {
    public static void main(String[] args) {
        final CharStream input = CharStreams.fromString("21/3*10");
        final CalculatorLexer lexer = new CalculatorLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final CalculatorParser parser = new CalculatorParser(tokens);
        final ParseTree tree = parser.expression();

        final CalculatorVisitor<BigDecimal> visitor = new CalculatorVisitorImpl();
        final BigDecimal result = visitor.visit(tree);

        System.out.println(result);
    }
}
