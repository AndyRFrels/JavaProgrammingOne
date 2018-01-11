package Chapter4;

import java.util.Scanner;

/**
 * Determine if entered stringB is a substring of entered stringA.
 *
 * @author Andy Frels
 */
public class C4_22 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) 
    {
       String entryOne;
       String entryTwo;
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a string.");
       entryOne = input.nextLine();
       System.out.println("Please enter another string.");
       entryTwo = input.nextLine();
       if(entryOne.contains(entryTwo))
       {
           System.out.println("The second string is a substring of the first string");
       }
       else
       {
           System.out.println("The second string is not a substring of the first string");
       }
    }
    
}
