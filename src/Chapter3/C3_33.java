package Chapter3;

import java.util.Scanner;

/**
 * Determine which of two bags is a better deal based upon weight and price per
 * weight.
 *
 * @author Andy Frels
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight(in kg) then price (per kg) of rice bag one");
        double riceBagOneWt = input.nextDouble();
        double riceBagOnePrc = input.nextDouble();
        System.out.println("Please enter the weight(in kg) then price (per kg) of rice bag two");
        double riceBagTwoWt = input.nextDouble();
        double riceBagTwoPrc = input.nextDouble();
        double wtPrcRatioOne = riceBagOnePrc / riceBagOneWt;
        double wtPrcRatioTwo = riceBagTwoPrc / riceBagTwoWt;
        if (wtPrcRatioOne > wtPrcRatioTwo) {
            System.out.println("Bag two is a better deal");
        } else if (wtPrcRatioOne < wtPrcRatioTwo) {
            System.out.println("Bag one is a better deal");
        } else {
            System.out.println("Both bags are the same deal");
        }
    }
}
