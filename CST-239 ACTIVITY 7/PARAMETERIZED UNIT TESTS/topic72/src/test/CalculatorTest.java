package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import junitt.Calculator;
/**
 * Test class for the Calculator, using parameterized tests.
 * 
 * @version 10/01/2023
 * @author toafik otiotio
 * @see junitt.Calculator
 */
@RunWith(Parameterized.class)
public class CalculatorTest {

    /**
     * Enumeration for operation types.
     */
    public enum Type {
        ADD, SUBTRACT, MULTYPLY, DIVIDE
    };

    @Parameter(0)
    public Type type;
    @Parameter(1)
    public int a1;
    @Parameter(2)
    public int a2;
    @Parameter(3)
    public int result;
    /**
     * Provides parameters for the tests.
     *
     * @return Collection of parameters to test with.
     */
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { 
            {Type.ADD, 2, 1, 3}, {Type.ADD, 5, 2, 7},
            {Type.SUBTRACT, 2, 1, 1},{Type.SUBTRACT, 5, 2, 3},
            {Type.MULTYPLY, 2, 1, 2},{Type.MULTYPLY, 5, 2, 10},
            {Type.DIVIDE, 2, 1, 2},{Type.DIVIDE, 5, 2, 2}
       };
        return Arrays.asList(data);
    }

    /**
     * Test method for addition operation in Calculator.
     */
    @Test
    public void testAdd() {
        Assume.assumeTrue(type == Type.ADD);
        Calculator calc = new Calculator();
        assertEquals(result, calc.add(a1, a2));
    }
    /**
     * Test method for subtraction operation in Calculator.
     */
    @Test
    public void testSubtract() {
        Assume.assumeTrue(type == Type.SUBTRACT);
        Calculator calc = new Calculator();
        assertEquals(result, calc.subtract(a1, a2));
    }
    /**
     * Test method for multiplication operation in Calculator.
     */
    @Test
    public void testMultiply() {
        Assume.assumeTrue(type == Type.MULTYPLY);
        Calculator calc = new Calculator();
        assertEquals(result, calc.multiply(a1, a2));
    }

    /**
     * Test method for division operation in Calculator.
     */
    @Test
    public void testDivide() {
        Assume.assumeTrue(type == Type.DIVIDE);
        Calculator calc = new Calculator();
        assertEquals(result, calc.divide(a1, a2));
    }
}