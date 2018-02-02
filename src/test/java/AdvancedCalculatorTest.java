import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
        assertEquals(
            0,
            (
                (BigDecimal)calculator
                    .startProgram(convertToCharStream(input), null)
            )
                    .compareTo(new BigDecimal(2))
        );

    }

    @Test
    public void testSimpleDivision(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "8 / 4"+"\n";
        assertEquals(0, ((BigDecimal)calculator.startProgram(convertToCharStream(input),null)).compareTo(new BigDecimal(2)));

    }

    @Test
    public void testSimpleAssignment(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "test = 4"+"\n";
        assertEquals(0, ((BigDecimal)calculator.startProgram(convertToCharStream(input),null)).compareTo(new BigDecimal(4)));

    }

    @Test
    public void testExpressionAssignment(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "test = 4 + 5"+"\n";
        assertEquals(0, ((BigDecimal)calculator.startProgram(convertToCharStream(input),null)).compareTo(new BigDecimal(9)));

    }

    @Test
    public void testTwoLiner(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "test = 4 + 5"+"\n" +
                "test + 1" +"\n";
        assertEquals(0, ((BigDecimal)calculator.startProgram(convertToCharStream(input),null)).compareTo(new BigDecimal(10)));

    }

    @Test
    public void testSeveralLiner() {
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "t = 100" + "\n" +
                "s = 200" + "\n" +
                "u = 300" + "\n" +
                "v = 400" + "\n" +
                "t + s" + "\n";

        assertEquals(0, ((BigDecimal)calculator.startProgram(convertToCharStream(input),null)).compareTo(new BigDecimal(300)));
    }

    /**
    @Test
    public void testSeveralLiner2() {
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "t = 100" + "\n" +
                "s = 200" + "\n" +
                "u = 300" + "\n" +
                "v = 400" + "\n" +
                "t + s / u * v" + "\n";
        BigDecimal programOutput = ((BigDecimal)calculator.startProgram(convertToCharStream(input)));

        assertEquals(programOutput, new BigDecimal(366.666666799));
    }
    **/



    @Test
    public void testPrint() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();


        String input = "var = \"test variable\" " + "\n" +
                "out : var" + "\n";
        calculator.startProgram(convertToCharStream(input),stream);
        assertEquals("test variable",new String(stream.toByteArray()));
    }



}
