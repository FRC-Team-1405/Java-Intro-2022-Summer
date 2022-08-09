import java.util.ArrayList;
import java.util.List;

public class PlayerTurn {
    private List<Integer> diceRolls = new ArrayList<Integer>();

    /**
     * Get the current score for this round.
     * @return
     */
    public int getScore(){
        int score = 0;

        if (diceRolls.contains(1))
            return 0;

        for(int index = 0; index < diceRolls.size() ; index++){
            score += diceRolls.get(index);
        }

        return score;
    }

    /**
     * Role a 6 sided die and add the roll to the turn.
     * @return
     */
    public int rollDice(){
        Dice dice = new Dice();

        int value = dice.rollDice();
        diceRolls.add( value );

        return value;
    }
}
