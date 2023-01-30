package Day4SnakeAndLadder;

public class SnakeAndLadder {
    static int dice;     // VARIABLES TO STORE THE RANDOM VALUES FOR PLAY CONDITIONS AND DICE ROLLS

    public static void diceRoll() {         // FUNCTION TO ROLL THE DICE

        dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
    }
    public static void main(String[] args) {
        int playerPosition = 0;         // START POSITION
        System.out.println("Start position: " + playerPosition);
        diceRoll();
    }
}
