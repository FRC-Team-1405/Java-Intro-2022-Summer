public interface Player {
    /**
     * Return the name of the player.
     * @return name of the player
     */
    String getName();

    /**
     * The player can roll the dice until they roll a 1.
     * @param turn  Used to roll the dice and get the current score for the round.
     * @return the PlayerTurn with all of the rolls of the dice.
     */
    public PlayerTurn executeTurn(PlayerTurn turn);
}
