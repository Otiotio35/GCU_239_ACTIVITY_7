package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * The {@code TestRunner} class is responsible for executing the JUnit tests defined in the
 * {@code testAssertions} class and printing the results.
 * <p>
 * It leverages the JUnitCore to run the tests and report any failures.
 * </p>
 *
 * @author YourName (Replace with your actual name or handle)
 * @version 1.0
 */
public class TestRunner {
	 /**
     * The entry point for executing the JUnit tests in the {@code testAssertions} class.
     * <p>
     * This method runs the tests and prints any failures to the console.
     * At the end, it will also print a message indicating if all tests passed or if any tests failed.
     * </p>
     *
     * @param args Command line arguments (not used in this method).
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(testAssertions.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("A JUnit test failed: " + failure.toString());
        }

        System.out.println("The JUnit Tests " + (result.wasSuccessful() ? "Passed" : "Failed"));
    }
}
