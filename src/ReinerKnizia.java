public class ReinerKnizia implements Player {

    /**
     * Named after the boad game designer Reiner Knizia and author of the book
     * _Dice Games Properly Explained_ where he describes this strategy. 
     * @return the string "Computer"
     */
    @Override
    public String getName() {
        return "Reiner Knizia";
    }

    /**
     * Roll the dice until your score is more than 10, then stop.
     * @param turn  Used to roll the dice and get the current score for the round.
     * @return the PlayerTurn with all of the rolls of the dice.
     */
    @Override
    public PlayerTurn executeTurn(PlayerTurn turn) {
        do {
            turn.rollDice();
        } while (turn.getScore() != 0 && turn.getScore() < 10) ;
        return turn;
    }
    
}
