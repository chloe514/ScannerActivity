import java.util.Scanner;

    public class HelloThere {
        public static void main(String[] args) {
            // Create the scanner for reading user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user with the first question
            System.out.println("Hello there! How are you doing today?");
            String firstResponse = scanner.nextLine();

            // Prompt the user with the second question
            System.out.println("Wow - Interesting! Tell me more!");
            String secondResponse = scanner.nextLine();

            // Print the conversation and end with a goodbye message
            System.out.println("You said you are doing: " + firstResponse);
            System.out.println("You also said: " + secondResponse);
            System.out.println("It was nice talking to you. Goodbye!");

            // Close the scanner to free up resources
            scanner.close();
        }
    }

