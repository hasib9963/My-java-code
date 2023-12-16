package my_java_project;
import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = input.nextInt();
        input.close();

        try {
            // Perform arithmetic operations
            int sum = a + b;
            int sub = a - b;
            int mul = a * b;
            float div;

            // Handle division by zero
            if (b != 0) {
                div = (float)a / b;
            } else {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            // Display results
            System.out.println("Addition: " + sum);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
            System.out.println("Division: " + div);

        } catch (ArithmeticException e) {
            // Display error message for division by zero
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Display generic error message for other exceptions
            System.out.println("An Exception Occurred: " + e.getMessage());
        }
    }
}
