package junitt;

/*
 * A simple calculator class for basic arithmetic operations.
 * @version 10/01/2023
* @author toafik otiotio
*/
public class Calculator {

	// a. Public method to add two integers
	public int add(int a, int b) {
		return a + b;
	}

	// b. Public method to subtract two integers
	public int subtract(int a, int b) {
		return a - b;
	}

	// c. Public method to multiply two integers
	public int multiply(int a, int b) {
		return a * b;
	}

	// d. Public method to divide two integers
	public int divide(int a, int b) {
		return a / b;
	}

	// e. Main method to test the calculator
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("Adding 1 + 2: " + calc.add(1, 2)); // Should print3
		System.out.println("Subtraction 2 from 1 is: " + calc.subtract(2, 1)); // Should print 1
		System.out.println("Multiplication of 10 and 2: " + calc.multiply(10, 2)); // Should print 20
		System.out.println("Division of 10 by 2 is: " + calc.divide(10, 2)); // Should print 10

	}
}
