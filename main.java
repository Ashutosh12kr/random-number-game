import java.util.Random; // Importing the Random class for generating random numbers
import java.util.Scanner; // Importing the Scanner class for user input

// Class representing the guessing game
class GuessingGame {
    private int randomNumber; // Variable to store the random number
    private int attempts; // Variable to count the number of attempts
    private Scanner scanner; // Scanner object for user input

    // Constructor to initialize the game
    public GuessingGame() {
        Random random = new Random(); // Create a Random object
        this.randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        this.attempts = 0; // Initialize attempts to 0
        this.scanner = new Scanner(System.in); // Initialize the scanner
    }

    // Method to start the game
    public void play() {
        System.out.println("Welcome to the Number Guessing Game!"); // Welcome message
        System.out.println("I have selected a random number between 1 and 100."); // Instructions

        // Loop until the player guesses the correct number
        while (true) {
            System.out.print("Enter your guess: "); // Prompt for user input
            int playerGuess = scanner.nextInt(); // Read the player's guess
            attempts++; // Increment the attempt count

            // Check if the guess is too low, too high, or correct
            if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again."); // Hint for low guess
            } else if (playerGuess > randomNumber) {
                System.out.println("Too high! Try again."); // Hint for high guess
            } else {
                // Player guessed correctly
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break; // Exit the loop
            }
        }
        scanner.close(); // Close the scanner to free resources
    }
}

// Main class to run the game
public class main {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame(); // Create a new instance of GuessingGame
        game.play(); // Start the game
    }
}
