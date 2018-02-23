import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Assert;
import org.junit.Test;
import primitives.DataTypeInterface;
import primitives.ListType;
import primitives.NumberType;
import primitives.StringType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertArrayEquals;

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
        NumberType output = (NumberType)calculator
                .startProgram(convertToCharStream(input), null, null);

        assertEquals(
            0,
            (
                output.getRawType()
            )
                    .compareTo(new BigDecimal(2))
        );

    }

    @Test
    public void testSimpleDivision(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "8 / 4"+"\n";
        NumberType output = (NumberType)calculator
                .startProgram(convertToCharStream(input), null, null);
        assertEquals(0, (output.getRawType()).compareTo(new BigDecimal(2)));

    }

    @Test
    public void testSimpleAssignment(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "test = 4"+"\n";
        NumberType output = (NumberType)calculator
                .startProgram(convertToCharStream(input), null, null);
        assertEquals(0, (output.getRawType()).compareTo(new BigDecimal(4)));

    }

    @Test
    public void testExpressionAssignment(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "test = 4 + 5"+"\n";
        NumberType output = (NumberType)calculator
                .startProgram(convertToCharStream(input), null, null);
        assertEquals(0, (output.getRawType()).compareTo(new BigDecimal(9)));

    }

    @Test
    public void testTwoLiner(){
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "test = 4 + 5"+"\n" +
                "test + 1" +"\n";
        NumberType output = (NumberType)calculator
                .startProgram(convertToCharStream(input), null, null);
        assertEquals(0, (output.getRawType()).compareTo(new BigDecimal(10)));

    }

    @Test
    public void testSeveralLiner() {
        AdvancedCalculator calculator = new AdvancedCalculator();

        String input = "t = 100" + "\n" +
                "s = 200" + "\n" +
                "u = 300" + "\n" +
                "v = 400" + "\n" +
                "t + s" + "\n";
        NumberType output = (NumberType)calculator
                .startProgram(convertToCharStream(input), null, null);

        assertEquals(0, (output.getRawType()).compareTo(new BigDecimal(300)));
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
                "out: var" + "\n";
        calculator.startProgram(convertToCharStream(input),stream, null);
        assertEquals("test variable",new String(stream.toByteArray()));
    }


    @Test
    public void testList() {
        AdvancedCalculator calculator = new AdvancedCalculator();


        String input = "var = list(1,2,3)" + "\n" +
                "var" + "\n";
        List<BigDecimal> expected = new ArrayList<>();
        expected.add(new BigDecimal(1));
        expected.add(new BigDecimal(2));
        expected.add(new BigDecimal(3));
        ListType output = (ListType)calculator
                .startProgram(convertToCharStream(input), null, null);
        List<BigDecimal> result = new ArrayList<>();
        for (DataTypeInterface value : output.getRawType()){
            result.add((BigDecimal)value.getRawType());
        }
        assertTrue(expected.equals(result));
    }


    @Test
    public void testForeachWithMultipleItemList() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        String input = "var = list(1,2,3)" + "\n" +
                "foreach x in var do x+1" + "\n";
        ArrayList<BigDecimal> expected = new ArrayList<>();
        expected.add(new BigDecimal(2));
        expected.add(new BigDecimal(3));
        expected.add(new BigDecimal(4));
        ListType output = (ListType)calculator
                .startProgram(convertToCharStream(input), null, null);
        List<BigDecimal> result = new ArrayList<>();
        for (DataTypeInterface value : output.getRawType()){
            result.add((BigDecimal)value.getRawType());
        }
        assertTrue(expected.equals(result));
    }

    @Test
    public void testFunctionCall() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        String input = "add = (a,b):" + "\n" +
                "a+b." + "\n" +
                "add(1,2)" + "\n";
        NumberType output = (NumberType)calculator
                .startProgram(convertToCharStream(input), null, null);
        assertEquals(new BigDecimal(3), output.getRawType());
    }

    @Test
    public void testFunctionCallWithoutDeclaration() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        String input = "add(1,2)" + "\n";
        try {
            calculator.startProgram(convertToCharStream(input),null, null);
            Assert.fail();
        } catch (Exception e) {}
    }

    @Test
    public void testStringReverse() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        List<BuiltInFunctionInterface> functions = new ArrayList<>();
        BuiltInFunctionInterface reverse = new ReverseFunction();
        functions.add(reverse);
        String input = "reverse(\"test variable\")" + "\n";
        StringType output = (StringType)calculator
                .startProgram(convertToCharStream(input), null, functions);
        assertEquals("elbairav tset",output.getRawType());
    }


    @Test
    public void testListReverse() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        List<BuiltInFunctionInterface> functions = new ArrayList<>();
        BuiltInFunctionInterface reverse = new ReverseFunction();
        functions.add(reverse);
        String input = "reverse(list(1,2,3))" + "\n";
        ArrayList<BigDecimal> expected = new ArrayList<>();
        expected.add(new BigDecimal(3));
        expected.add(new BigDecimal(2));
        expected.add(new BigDecimal(1));
        ListType output = (ListType)calculator
                .startProgram(convertToCharStream(input), null, functions);
        List<BigDecimal> result = new ArrayList<>();
        for (DataTypeInterface value : output.getRawType()){
            result.add((BigDecimal)value.getRawType());
        }
        assertTrue(expected.equals(result));
    }


}
