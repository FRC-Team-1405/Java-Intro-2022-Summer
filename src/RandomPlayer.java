import java.util.Random;

public class RandomPlayer implements Player {
   Random rand = new Random();
/* The Random player picks a number between 1 and 10. 
 *The number that he picked is how many times he rolls the dice. 
 *@return the string "Random Player"
 */
    @Override
    public String getName() {
       return "Random Player";
    }
    @Override
    public PlayerTurn executeTurn(PlayerTurn turn) {
        //Picks a number between 1 and 10
        int rolls = rand.nextInt(9) + 1;
            //Rolls that many times
            for (int i = 1; i <= rolls; i++) {
                turn.rollDice();
            }
        return turn;
    }
    
}
