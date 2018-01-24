package Chapter2;

import java.util.Scanner;

/**
 * Display the total cost of an item based on the entered gratuity rate and
 * subtotal.
 *
 * @author Andy Frels
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("Please enter a gratuity rate: ");
        double rate = (input.nextDouble() / 100);
        System.out.println("The gratuity is: " + (rate * subtotal) + " The total is: " + (subtotal + (rate * subtotal)));
    }
}
