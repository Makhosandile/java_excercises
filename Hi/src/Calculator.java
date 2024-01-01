import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        // Input second number
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");

        // Input user choice
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Perform the selected operation using switch
        switch (choice) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                // Ensure non-zero divisor for division
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                // Ensure non-zero divisor for remainder
                if (num2 != 0) {
                    System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("Cannot calculate remainder when divisor is zero.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

        // Close the scanner
        scanner.close();
    }
}
