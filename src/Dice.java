import java.util.*;

public class Dice {
    /**
     * Roll a 6 sided die.
     * @return return a value from 1 to 6
     */
    public int rollDice(){
        Random random = new Random();
        return random.nextInt(5) +1;
    }

    /**
     * Generate a ASCII art 6 sided die.
     * @param value the value to generate
     * @return ASCII art of a 6 sided die.
     */
    public static String toASCIIArt(int value)
    {
        switch (value){
            case 1:
                return   "+-------+\n"
                        +"|       |\n" 
                        +"|   *   |\n" 
                        +"|       |\n" 
                        +"+-------|\n"; 
            case 2:
                return   "+-------+\n"
                        +"| *     |\n" 
                        +"|       |\n" 
                        +"|     * |\n" 
                        +"+-------|\n"; 
            case 3:
                return   "+-------+\n"
                        +"| *     |\n" 
                        +"|   *   |\n" 
                        +"|     * |\n" 
                        +"+-------|\n"; 
            case 4:
                return   "+-------+\n"
                        +"| *   * |\n" 
                        +"|       |\n" 
                        +"| *   * |\n" 
                        +"+-------|\n"; 
            case 5:
                return   "+-------+\n"
                        +"| *   * |\n" 
                        +"|   *   |\n" 
                        +"| *   * |\n" 
                        +"+-------|\n"; 
            case 6:
                return   "+-------+\n"
                        +"| *   * |\n" 
                        +"| *   * |\n" 
                        +"| *   * |\n" 
                        +"+-------|\n"; 
        }
        return null;
    }
    
}
