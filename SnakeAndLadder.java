package Day4SnakeAndLadder;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;     // CONDITION FOR NO PLAY
    public static final int LADDER = 1;     // CONDITION TO MOVE FORWARD
    public static final int SNAKE = 2;      // CONDITION TO MOVE BACKWARD

    static int check, dice;     // VARIABLES TO STORE THE RANDOM VALUES FOR PLAY CONDITIONS AND DICE ROLLS


    public static int checkMove() {         // FUNCTION TO CHECK FOR PLAYING CONDITION
        check = (int) Math.floor((Math.random()) * 10) % 3;
        return check;
    }

    public static void diceRoll() {         // FUNCTION TO ROLL THE DICE

        dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
    }

    public static void main(String[] args) {
        int playerPosition = 0;         // START POSITION
        System.out.println("Start position: " + playerPosition);

        switch (checkMove()) {          // CHECK FOR NO PLAY/ LADDER/ SNAKE CONDITIONS
            case NO_PLAY:
                System.out.println("uh-Oh No play, Try Again!!");
                playerPosition += 0;
                System.out.println("your position " + playerPosition);
                System.out.println(" ");
                break;

            case LADDER:
                diceRoll();         // DICE ROLL
                System.out.println("Dice is rolled and the number is: " + dice);
                System.out.println("Its a ladder, Move ahead with " + dice + " position");
                playerPosition += dice;         // INCREMENT THE POSITION
                System.out.println("your position " + playerPosition);
                System.out.println(" ");
                break;
            case SNAKE:
                diceRoll();
                System.out.println("Dice is rolled and the number is: " + dice);
                System.out.println("Oops! you got bitten by a snake Move back with " + dice + " position");
                playerPosition -= dice;
                System.out.println("Your position " + playerPosition);
        }
    }
}
