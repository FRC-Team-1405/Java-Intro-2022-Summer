public class ScoreSensitivePlayer implements Player{
    private int rolls = 1;
    private boolean bust = false; 
    /* The Score Sensitive Player rolls the die one time each turn adding one die for each turn he doesnt roll a one.
     * If the Score Sensitive Player rolls a 1, then the dice count goes down to one.
     * @return the string "Score Sensitive Player"
     */
    
    @Override
    public String getName() {
        return "Score Sensitive Player";
    }

    @Override
    public PlayerTurn executeTurn(PlayerTurn turn) {
        //Checks if the player busted out his last roll
        if (bust == true){
            rolls = 1;
        }
            // Counts how many times the player must roll
            for (int i = 1; i <= rolls; i++){
                turn.rollDice();
            }
            rolls++;

                //Decides if the player got a bust on this round
                if (turn.getScore() == 0) {
                    bust = true;
                }
                    else {
                        bust = false;
                    }
                        return turn;
    }

   
    
}
