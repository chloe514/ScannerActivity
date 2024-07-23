import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create the scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("What is your name?");

        // The string provided by the user will be assigned to the name variable
        String name = scanner.nextLine();

        // Print a greeting message that includes the user's name
        System.out.println("Hello, " + name + "! How are you?");

        // Close the scanner to free up resources
        scanner.close();
    }
}




