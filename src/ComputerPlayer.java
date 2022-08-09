public class ComputerPlayer implements Player {

    /**
     * A simple computer player that always rolls the die twice.
     * @return the string "Computer"
     */
    @Override
    public String getName() {
        return "Computer";
    }


    /**
     * A simple player that always rolls the dice twice.
     * @param turn  Used to roll the dice and get the current score for the round.
     * @return the PlayerTurn with all of the rolls of the dice.
     */
    @Override
    public PlayerTurn executeTurn(PlayerTurn turn) {
        turn.rollDice() ;
        turn.rollDice() ;
        return turn;
    }
    
}
