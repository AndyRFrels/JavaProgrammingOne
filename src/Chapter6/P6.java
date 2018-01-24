package Chapter6;

import java.util.Scanner;

/**
 * Enter the values, in US dollars, of euros, pounds, and yen. Following this,
 * convert an entered amount of US dollars into this currency.
 *
 * @author Andy Frels
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double euroValue;
        double poundValue;
        double yenValue;
        int stillAsking = 0;
        System.out.print("How many euros will one dollar buy: ");
        euroValue = input.nextDouble();
        System.out.print("\nHow many Pounds will one dollar buy: ");
        poundValue = input.nextDouble();
        System.out.print("\nHow many Yen will one dollar buy: ");
        yenValue = input.nextDouble();
        while (stillAsking != 1) {
            double currencyEntered;
            double finalCurrency = 0;
            System.out.print("\nPlease enter an amount of currency in US dollars: ");
            currencyEntered = input.nextDouble();
            System.out.println("\nPlease enter the currency you would like to buy: (E)uros  (P)ounds  (Y)en");
            String response = input.next().toLowerCase();
            switch (response) {
                case "e":
                    finalCurrency = calculateCurrency(currencyEntered, euroValue);
                    break;
                case "p":
                    finalCurrency = calculateCurrency(currencyEntered, poundValue);
                    break;
                case "y":
                    finalCurrency = calculateCurrency(currencyEntered, yenValue);
                    break;
            }
            System.out.printf("The curreny you will recieve is %.2f", finalCurrency);
            int validContinue = 0;
            while (validContinue == 0) {
                System.out.print("\nWould you like to continue converting money?  (yes/no)  ");
                String continuing = input.next().toLowerCase();
                switch (continuing) {
                    case "yes":
                        stillAsking = 0;
                        validContinue = 1;
                        break;
                    case "no":
                        stillAsking = 1;
                        validContinue = 1;
                        break;
                    default:
                        validContinue = 0;
                        break;
                }
            }
        }
    }

    /**
     * calculateCurrency Method - Calculate the value in foreign money that will
     * be received and how much is taxed off.
     *
     * @param dollarsEntered The amount of US dollars to be converted.
     * @param foreignCurrencyChosen The type of foreign currency the user wanted
     * to convert.
     * @return return the amount of foreign currency received.
     */
    public static double calculateCurrency(double dollarsEntered, double foreignCurrencyChosen) {
        double newCurrency;
        if (dollarsEntered > 100) {
            newCurrency = (dollarsEntered * foreignCurrencyChosen) * .95;
        } else {
            newCurrency = (dollarsEntered * foreignCurrencyChosen) * .90;
        }
        return newCurrency;
    }
}
