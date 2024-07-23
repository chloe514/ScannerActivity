import java.util.Scanner;

public class VariableInputs {

    // Method to collect user inputs and print them
    public void collectAndPrintInputs() {
        Scanner scanner = new Scanner(System.in);

        // Prompt and collect a string input
        System.out.print("Enter a string of text: ");
        String userString = scanner.nextLine();

        // Prompt and collect an integer input
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        // Prompt and collect a double input
        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();

        // Prompt and collect a boolean input
        System.out.print("Enter a boolean value: ");
        boolean userBoolean = scanner.nextBoolean();

        // Print the collected inputs
        System.out.println("\nYour string is " + userString);
        System.out.println("Your integer is " + userInt);
        System.out.println("Your double is " + userDouble);
        System.out.println("Your boolean is " + userBoolean);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Main method to run the program
    public static void main(String[] args) {
        VariableInputs inputs = new VariableInputs();
        inputs.collectAndPrintInputs();
    }
}

