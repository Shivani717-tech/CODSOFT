import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to Number Guessing Game!");

        while (playAgain) {
            int number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = 0;

                // input validation
                try {
                    guess = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Please enter a valid number!");
                    sc.next(); // clear wrong input
                    continue;
                }

                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + attempts + " tries.");
                    guessed = true;
                    score++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessed) {
                System.out.println("Sorry! The number was: " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String again = sc.next().toLowerCase();
            if (!again.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nGame over. You won " + score + " round(s).");
        sc.close();
    }
}
