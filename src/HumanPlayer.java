import java.io.FilterInputStream;
import java.util.Scanner;

public class HumanPlayer implements Player {

    /**
     * A human player is prompted to type their name.
     */
    public HumanPlayer(){
        Scanner scan = new Scanner(new FilterInputStream(System.in){public void close(){}});

        System.out.print("Please type your name: ");
        if (scan.hasNextLine()){
            name = scan.nextLine();
        }
        scan.close();
    }

    private String name;

    /**
     * Return the name of the player gave.
     * @return name of the player
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Ask the player if they want to continue rolling the dice and stop when they roll a 1.
     * @param turn  Used to roll the dice and get the current score for the round.
     * @return the PlayerTurn with all of the rolls of the dice.
     */
    @Override
    public PlayerTurn executeTurn(PlayerTurn turn) {
        boolean rollingDice = true;
        while (rollingDice){
            System.out.println(getName()+" do you want push your luck?");
            App.Answer response = App.askYesNo();
    
            if (response == App.Answer.Yes) {
                int dieRole = turn.rollDice() ;
                System.out.println(Dice.toASCIIArt(dieRole));
                if (turn.getScore() == 0){
                    System.out.println("Sorry "+getName()+" your score for this roound is 0.");
                    rollingDice = false;
                }
                System.out.println( "Turn sum: "+turn.getScore() );
            } else {
                rollingDice = false;
            } 
        }
        System.out.println("Turn total: "+turn.getScore());
        System.out.println();

        return turn;
    }


    
}
