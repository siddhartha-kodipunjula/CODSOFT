import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {

            Game game = new Game();

            int target = game.getTargetNumber();
            int guess;
            int attempts = 0;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess a number between 1 and 100");

            do {

                System.out.print("Enter Guess: ");
                guess = sc.nextInt();

                attempts++;

                if (guess > target) {

                    System.out.println("Too High!");
                }

                else if (guess < target) {

                    System.out.println("Too Low!");
                }

                else {

                    System.out.println(
                            "Correct! You guessed in "
                                    + attempts
                                    + " attempts.");
                }

            } while (guess != target);

            System.out.print(
                    "Play Again? (yes/no): ");

            playAgain =
                    sc.next().equalsIgnoreCase("yes");
        }

        System.out.println(
                "Thank You For Playing!");

        sc.close();
    }
}