package Chapter2;
import java.util.Scanner;

/**
 * Display an entered integer in degrees celsius as degrees farenheit
 *
 * @author Andy Frels
 */
public class C2_1
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) 
    {
        System.out.println("Enter degrees in Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsius = ((9 / 5) * input.nextDouble()) + 32;
        System.out.println("That is " + celsius + " degrees in farenheit");
    }
    
}