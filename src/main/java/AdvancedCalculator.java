import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.math.BigDecimal;

public class AdvancedCalculator {
    public static void main(String[] args) throws IOException {
        System.out.println(runProgram("program1.txt"));
        System.out.println(runProgram("program2.txt"));
    }

    private static BigDecimal runProgram(String filename) throws IOException {
        final CharStream input = CharStreams.fromFileName(filename);
        final AdvancedCalculatorLexer lexer = new AdvancedCalculatorLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final AdvancedCalculatorParser parser = new AdvancedCalculatorParser(tokens);

        final ParseTree tree = parser.program();
        final AdvancedCalculatorVisitor<BigDecimal> visitor = new AdvancedCalculatorVisitorImpl();
        return visitor.visit(tree);
    }
}
