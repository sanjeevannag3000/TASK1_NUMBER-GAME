import java.util.*;

public class Number_game{

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess any number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();

            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You have78 guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("The number is too low. Try again.");
            } else {
                System.out.println("The number is too high. Try again.");
            }
        }

        scanner.close();
    }
}