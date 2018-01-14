import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

import static junit.framework.TestCase.assertEquals;

public class AdvancedCalculatorTest {

    private CharStream convertToCharStream(String input){
        InputStream inputstream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        CharStream stream = null;
        try {
            stream = CharStreams.fromStream(inputstream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }

    @Test
    public void testSimpleAddition(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "1 + 1"+"\n";
        assertEquals(calculator.startProgram(convertToCharStream(input)), new BigDecimal(2));

    }

    @Test
    public void testSimpleDivision(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "8 / 4"+"\n";
        assertEquals(calculator.startProgram(convertToCharStream(input)), new BigDecimal(2));

    }
}
