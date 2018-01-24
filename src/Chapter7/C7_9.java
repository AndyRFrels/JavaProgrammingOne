package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Have a user enter a variable amount of numbers and determine which number
 * entered is the smallest
 *
 * @author Andy Frels
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String enteredValues;
        System.out.print("Please enter a variable amount of values: ");
        enteredValues = input.nextLine();
        char[] entered = enteredValues.toCharArray();
        int numberCount = 1;
        for (int i = 0; i < enteredValues.length(); ++i) {
            if (entered[i] == ' ') {
                ++numberCount;
            }
        }
        String[] allValues = new String[numberCount];
        allValues = enteredValues.split(" ");
        double[] values = new double[numberCount];
        for (int i = 0; i < numberCount; ++i) {
            values[i] = Double.parseDouble(allValues[i]);
        }
        Arrays.sort(values);
        System.out.println("The smallest number is " + values[0]);
    }
}
