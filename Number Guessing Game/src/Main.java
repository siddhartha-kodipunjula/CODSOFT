import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            boolean playAgain = true;
            
            while (playAgain) {
                
                Game game = new Game();
                
                int target = game.getTargetNumber();
                int guess = 0;
                int attempts = 0;
                
                System.out.println("\n===== NUMBER GUESSING GAME =====");
                System.out.println("Guess a number between 1 and 100");
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100");
                    continue;
                }
                
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
        }
    }
}