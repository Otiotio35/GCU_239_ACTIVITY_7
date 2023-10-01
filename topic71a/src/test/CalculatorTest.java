
package test;

import org.junit.Assert;
import org.junit.Test;
import junitt.Calculator;
/**
 * Test suite for the Calculator class.
 * 
  * @version 10/01/2023
 * @author toafik otiotio
 * @see junitt.Calculator
 */

public class CalculatorTest {

    /**
     * Tests the add() method of the Calculator class.
     * 
     * @see junitt.Calculator#add(int, int)
     */
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assert.assertEquals(3, calc.add(2, 1));
        Assert.assertEquals(7, calc.add(5, 2));
    }

    /**
     * Tests the subtract() method of the Calculator class.
     * 
     * @see junitt.Calculator#subtract(int, int)
     */
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assert.assertEquals(1, calc.subtract(2, 1));
        Assert.assertEquals(3, calc.subtract(5, 2));
    }

    /**
     * Tests the multiply() method of the Calculator class.
     * 
     * @see junitt.Calculator#multiply(int, int)
     */
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.multiply(2, 1));
        Assert.assertEquals(10, calc.multiply(5, 2));
    }

    /**
     * Tests the divide() method of the Calculator class. This test checks integer division.
     * 
     * @see junitt.Calculator#divide(int, int)
     */
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.divide(2, 1));
        Assert.assertEquals(2, calc.divide(5, 2)); // Note: This is an integer division, hence the result is 2.
    }
}
