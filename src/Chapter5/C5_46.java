package Chapter5;
import java.util.Scanner;

/**
 * Reverse the string entered by the user.
 *
 * @author Andy Frels
 */
public class C5_46 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string of characters: ");
        String reversi = input.nextLine();
        System.out.print("The entered string in reverse is: ");
        System.out.println(new StringBuffer(reversi).reverse().toString());
    }
}
