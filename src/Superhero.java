import java.util.Scanner; // This import is not needed if you are not using Scanner

public class Superhero {

    private String name;
    private String superpower;

    // Constructor to initialize the Superhero object with Daredevil's details
    public Superhero() {
        // Hardcoded details for Daredevil
        name = "Daredevil";
        superpower = "superhuman senses and acrobatics";
    }

    // Method to print the story
    public void tellStory() {
        System.out.println("\nHere is the story:");
        System.out.println("There once was a superhero named " + name + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + name + " saw that the world needed them.");
        System.out.println(name + " used their ability to " + superpower + " to save the world.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        Superhero hero = new Superhero();
        hero.tellStory();
    }
}


