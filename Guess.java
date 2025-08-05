import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a Number Between 1 to 100.");
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You Guessed it in " + attempts + " Attempts.");
            }
        }
        scanner.close();
    }
}