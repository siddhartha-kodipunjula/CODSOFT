import java.util.Random;

public class Game {

    private final int targetNumber;

    public Game() {

        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
    }

    public int getTargetNumber() {
        return targetNumber;
    }
}