package Chapter2;

import java.util.Scanner;

/**
 * Calculate the price of a meal based upon the entered price of each item.
 *
 * @author Andy Frels
 */
public class P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was the price of the meal?");
        double mealPrice = input.nextDouble();
        System.out.println("What was the price of the drink?");
        double drinkPrice = input.nextDouble();
        System.out.println("What was the price of the dessert?");
        double dessertPrice = input.nextDouble();
        double totalPrice = (mealPrice + drinkPrice + dessertPrice);
        double tax = totalPrice * 0.10;
        double tip = (totalPrice + tax) * 0.15;
        System.out.println("The price of the meal is: " + totalPrice + " The tax is: " + tax + " The tip will be: " + tip + " and the price of everything will be: $" + (totalPrice + tax + tip));
    }
}
