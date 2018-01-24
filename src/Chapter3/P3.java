package Chapter3;

import java.util.Scanner;

/**
 * Take and grade entered integers between one and one-hundred.
 *
 * @author Andy Frels
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double varOne = 0;
        double varTwo = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        varOne = input.nextInt();
        System.out.println("Please enter another integer");
        varTwo = input.nextInt();
        if (varOne > varTwo) {
            System.out.println("Variable one is greater");
        }
        if (varOne < varTwo) {
            System.out.println("Variable two is greater");
        }
        if (varOne == varTwo) {
            System.out.println("Variable one is equal to variable two");
        }
        if (varOne <= varTwo) {
            System.out.println("Variable one is less than or equal to variable two");
        }
        if (varOne != varTwo) {
            System.out.println("Variable one is not equal to variable two");
        }
        if (varTwo == 0) {
            System.out.println("Cannot divide by zero");
        } else if ((varOne / varTwo) <= 1) {
            System.out.println("Proper fraction");
        } else if ((varOne / varTwo) > 1) {
            System.out.println("Improper fraction");
        }
        if (varOne >= 90) {
            System.out.println("A");
        } else if (varOne >= 80) {
            System.out.println("B");
        } else if (varOne >= 70) {
            System.out.println("C");
        } else if (varOne >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (varTwo >= 1 && varTwo <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }

}
