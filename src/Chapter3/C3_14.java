package Chapter3;
import java.util.Scanner;
/**
 * Play a game of heads or tails by generating a 1 or 0 and asking heads or tails (heads-0 tails-1).
 *
 * @author Andy Frels
 */
public class C3_14 
{
     /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double coinFlip = (Math.random()*2);
        System.out.println("Heads or tails?");
        String headsTails = input.nextLine();
        String answer = " ";
        if(coinFlip == 0)
        {
            answer = "heads";
        }
        else if (coinFlip == 1)
        {
            answer = "tails";
        }
        
        if(headsTails.equals(answer))
        {
            System.out.println("You were right");
        }
        else
        {
            System.out.println("You were wrong");
        }
    }
}
