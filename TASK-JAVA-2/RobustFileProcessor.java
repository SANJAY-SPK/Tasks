/*2) Robust File Processor (Exception Handling) 
Question: A file-processing tool must handle missing files and potential divisions by zero 
during statistical calculations. Create a Java program that: 
1. Has a method divide(int a, int b) using try-catch-finally to 
handle ArithmeticException. 
2. Has a method openFile(String path) throws IOException that throws an 
exception for a missing file. 
3. In main(), call both methods with valid and invalid inputs, illustrating how exceptions 
are caught or rethrown.  */

package programs;
import java.io.File;
import java.io.IOException;

public class RobustFileProcessor {

    // Method to handle division with try-catch-finally
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return a default value
        } finally {
            System.out.println("Division operation completed.");
        }
    }

    // Method to handle file opening with throws clause
    public static void openFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new IOException("File not found at path: " + path);
        } else {
            System.out.println("File opened successfully: " + path);
        }
    }

    public static void main(String[] args) {
        // Testing divide method with valid and invalid inputs
        System.out.println("Valid Division: " + divide(10, 2)); // Valid input
        System.out.println("Invalid Division: " + divide(10, 0)); // Division by zero

        // Testing openFile method with valid and invalid file paths
        try {
            openFile("validFilePath.txt"); // Replace with an actual existing file path
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            openFile("invalidFilePath.txt"); // Example of a non-existing file
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
