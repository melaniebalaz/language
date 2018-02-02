import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;

public class AdvancedCalculator {
    public static void main(String[] args) throws IOException {
        runProgram("program1.txt",System.out);
    }

    public Object startProgram(CharStream input, OutputStream stream){

        final AdvancedCalculatorLexer lexer = new AdvancedCalculatorLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final AdvancedCalculatorParser parser = new AdvancedCalculatorParser(tokens);

        final ParseTree tree = parser.program();
        final AdvancedCalculatorVisitor<Object> visitor = new AdvancedCalculatorVisitorImpl(stream);
        return visitor.visit(tree);
    }

    private static Object runProgram(String filename, OutputStream stream) throws IOException {
        final CharStream input = CharStreams.fromFileName(filename);
        final AdvancedCalculatorLexer lexer = new AdvancedCalculatorLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final AdvancedCalculatorParser parser = new AdvancedCalculatorParser(tokens);

        final ParseTree tree = parser.program();
        final AdvancedCalculatorVisitor<Object> visitor = new AdvancedCalculatorVisitorImpl(stream);
        return visitor.visit(tree);
    }
}
