package Day4SnakeAndLadder;

public class SnakeAndLadder {

    public static final int NO_PLAY = 0;     // CONDITION FOR NO PLAY
    public static final int LADDER = 1;     // CONDITION TO MOVE FORWARD
    public static final int SNAKE = 2;      // CONDITION TO MOVE BACKWARD
    public static final int win = 100;      // WINNING CONDITION

    static int check, dice;     // VARIABLES TO STORE THE RANDOM VALUES FOR PLAY CONDITIONS AND DICE ROLLS

    public static int checkMove() {         // FUNCTION TO CHECK FOR PLAYING CONDITION
        check = (int) Math.floor((Math.random()) * 10) % 3;
        return check;
    }

    public static void diceRoll() {         // FUNCTION TO ROLL THE DICE
        dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
    }


    public static void main(String[] args) {

        int count = 0;          // COUNTER TO GET TOTAL DICE ROLLS
        int playerPosition = 0;         // START POSITION
        System.out.println("Start position: " + playerPosition);

        while (playerPosition < win) {

            switch (checkMove()) {          // CHECK FOR NO PLAY/ LADDER/ SNAKE CONDITIONS
                case NO_PLAY:
                    System.out.println("uh-Oh No play, Try Again!!");
                    playerPosition += 0;
                    System.out.println("your position " + playerPosition);
                    System.out.println(" ");
                    count++;
                    break;

                case LADDER:
                    diceRoll();         // DICE ROLL
                    if (0 < (playerPosition + dice) && (playerPosition + dice) <= 100) {        // PLAYER POSITION SHOULD BE POSITIVE AND <= 100
                        System.out.println("Dice is rolled and the number is: " + dice);
                        System.out.println("Its a ladder, Move ahead with " + dice + " position");
                        playerPosition += dice;         // INCREMENT THE POSITION
                        System.out.println("your position " + playerPosition);
                        System.out.println(" ");
                        count++;            // DICE ROLL COUNTER
                    }
                    break;
                case SNAKE:
                    diceRoll();
                    if (playerPosition - dice > 0) {            // WILL WORK ONLY IF POSITION IS POSITIVE
                        System.out.println("Dice is rolled and the number is: " + dice);
                        System.out.println("Oops! you got bitten by a snake Move back with " + dice + " position");
                        playerPosition -= dice;
                        System.out.println("Your position " + playerPosition);
                    } else {            // IF POSITION IS NEGATIVE IT WILL RESTART FROM ZERO
                        playerPosition = 0;
                        System.out.println("Dice is rolled and the number is: " + dice);
                        System.out.println("TOO BAD!!! you got bitten BAD!! Start from the BEGINNING!!!");
                    }
                    System.out.println(" ");
                    count++;
                    break;
            }
            if (playerPosition == 100) {        // WINNING CONDITION IS ACHIEVED
                System.out.println("Congratulations!!!! YOU HAVE WON AFTER " + count + " MOVES");
                break;
            }
        }
    }
}
