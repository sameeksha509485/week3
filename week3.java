import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Ask the user to input the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Multiply the two numbers
        double result = firstNumber * secondNumber;

        // Display the result
        System.out.println("The result of multiplication is: " + result);

        // Close the scanner
        scanner.close();
    }
}
