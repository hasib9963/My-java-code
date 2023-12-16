package my_java_project;

import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (enter a negative number to exit):");

        while (true) {
            try {
                double num = input.nextDouble();
                if (num < 0) {
                    throw new NegativeNumberException();
                }

                // Continue processing the number
                System.out.println("Processing: " + num);
            } catch (NegativeNumberException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                // Check if the entered number is negative, if yes, break the loop
                if (input.hasNextDouble() && input.nextDouble() < 0) {
                    break;
                }
            }
        }
        input.close();
    }

    static class NegativeNumberException extends Exception {
        public NegativeNumberException() {
            super("Negative number encountered.");
        }
    }
}

