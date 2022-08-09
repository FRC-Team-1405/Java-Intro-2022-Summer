import java.util.LinkedList;
import java.util.List;

public class Game {
    /**
     * A game of Pig needs a list of players. Each round every player is 
     * able to roll the dice until they decide to stop or roll a 1. Players
     * that stop before they roll a 1 keep their sum of the rolls. Players that
     * roll a 1 score 0 for that round. The game ends when a player has at least
     * 100 points and every player has had a turn. The highest score wins.
     * @param players list of players
     */
    public Game(Player[] players){
        for(Player player: players){
            scoreCards.add( new ScoreCard(player) );
        }
    }

    /**
     * For each of the players execute a turn and print out each player's score.
     */
    public void executeRound(){
        for(ScoreCard scoreCard: scoreCards){
            scoreCard.turns.add(scoreCard.player.executeTurn( new PlayerTurn() ));
        }

        for(ScoreCard scoreCard: scoreCards){
            System.out.println(scoreCard.player.getName()+" "+scoreCard.getScore());
        }
        System.out.println("");
    }

    private static final int WINNING_SCORE = 99;

    /**
     * If a player has at lease 100 points, declare the player with
     * the highest score the winner.
     * @return the winning player or null if there isn't a winner
     */
    public Player DeclareWinner(){
        ScoreCard winningPlayer = null;

        for(ScoreCard scoreCard: scoreCards){
            if (winningPlayer == null){
                winningPlayer = scoreCard;
            } else if (scoreCard.getScore() > winningPlayer.getScore()){
                winningPlayer = scoreCard;
            }
        }

        if (winningPlayer.getScore() >= WINNING_SCORE){
            return winningPlayer.player;
        }

        return null;
    }

    private List<ScoreCard> scoreCards = new LinkedList<ScoreCard>();

    private class ScoreCard {
        /**
         * This is an inner class to contain the player and their turns.
         * @param player keep track of this player's turns
         */
        public ScoreCard(Player player){
            this.player = player;
            turns = new LinkedList<PlayerTurn>();
        }
        public Player player;
        public List<PlayerTurn> turns;

        /**
         * Calculate the player's score by adding up all of their turns.
         * @return the player's total score
         */
        public int getScore(){
            int sum = 0;
            for(PlayerTurn turn: turns){
                sum += turn.getScore();
            }
            return sum;
        }
    }
}
