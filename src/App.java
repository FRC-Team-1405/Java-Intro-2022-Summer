import java.io.FilterInputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Game pig = new Game( new Player[] { 
            new HumanPlayer(), 
            new ComputerPlayer(),
            new ReinerKnizia(),
            new ScoreSensitivePlayer()
        });

        do {
            pig.executeRound();
        } while (pig.DeclareWinner() == null) ;

        Player winner = pig.DeclareWinner();
        System.out.println("The winner is "+winner.getName() + "!");
        System.out.println();
    }

    public enum Answer { Yes, No };

    public static Answer askYesNo(){
        Scanner scan = new Scanner(new FilterInputStream(System.in){public void close(){}});

        Answer answer = null;
        while (answer == null) {
            System.out.print("Please type a (Y)es or (N)o: ");
            if (scan.hasNextLine()){
                String line = scan.nextLine();
                String lower = line.toLowerCase();

                if (lower.equals("yes") || lower.equals("y")){
                    answer = Answer.Yes;
                } else if (lower.equals("no") || lower.equals("n")) {
                    answer = Answer.No;
                }
            }
        }

        scan.close();

        return answer;
    }

}






