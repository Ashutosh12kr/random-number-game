import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * A modular and interactive Number Guessing Game.
 */
class GuessingGame {
    private int randomNumber;
    private int maxNumber;
    private int attempts;
    private final Scanner scanner;

    public GuessingGame() {
        scanner = new Scanner(System.in);
    }

    /**
     * Starts the game loop with menu and replay option.
     */
    public void start() {
        System.out.println("🎲 Welcome to the Number Guessing Game!");
        do {
            chooseDifficulty();
            playGame();
        } while (askToPlayAgain());

        System.out.println("Thank you for playing! Goodbye 👋");
        scanner.close();
    }

    /**
     * Lets the user choose the difficulty level.
     */
    private void chooseDifficulty() {
        System.out.println("\nChoose a difficulty level:");
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-200)");

        int choice = getValidInt("Enter your choice (1-3): ", 1, 3);

        switch (choice) {
            case 1 -> maxNumber = 50;
            case 2 -> maxNumber = 100;
            case 3 -> maxNumber = 200;
        }

        Random random = new Random();
        randomNumber = random.nextInt(maxNumber) + 1;
        attempts = 0;
        System.out.println("🔢 I've picked a number between 1 and " + maxNumber + ". Try to guess it!");
    }

    /**
     * Main game logic loop.
     */
    private void playGame() {
        while (true) {
            int guess = getValidInt("Enter your guess: ", 1, maxNumber);
            attempts++;

            if (guess < randomNumber) {
                System.out.println("📉 Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("📈 Too high! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
    }

    /**
     * Asks the user if they want to play again.
     */
    private boolean askToPlayAgain() {
        System.out.print("🔁 Do you want to play again? (y/n): ");
        String response = scanner.next().trim().toLowerCase();
        return response.equals("y");
    }

    /**
     * Ensures input is an integer within the expected range.
     */
    private int getValidInt(String prompt, int min, int max) {
        int input;
        while (true) {
            try {
                System.out.print(prompt);
                input = scanner.nextInt();
                if (input < min || input > max) {
                    System.out.println("⚠️ Please enter a number between " + min + " and " + max + ".");
                } else {
                    return input;
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}

/**
 * Main class to launch the game.
 */
public class Main {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.start();
    }
}
