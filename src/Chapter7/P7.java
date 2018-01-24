package Chapter7;

import java.util.Scanner;

/**
 * Have a user Fill an array with numbers determine the average and then print
 * the array
 *
 * @author Andy Frels
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersRead;
        double average = 0;
        System.out.print("Please enter how many numbers will be read: ");
        double[] numbers = new double[input.nextInt()];
        fillArray(numbers);
        System.out.println("\nThe average is " + average(numbers));
        System.out.print("\nThe content of the array is");
        printArray(numbers);
    }

    /**
     * FillArray Method
     *
     * @param numbers the array who's length was determined by the user and will
     * be filled in this method
     */
    public static void fillArray(double[] numbers) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter " + numbers.length + " elements: ");
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = input.nextDouble();
        }
    }

    /**
     * Average Method
     *
     * @param numbers the array who's length was determined by the user and will
     * be averaged in this method
     * @return average return the average value of the numbers
     */
    public static double average(double[] numbers) {
        double average = 0;
        for (int i = 0; i < numbers.length; ++i) {
            average = average + numbers[i];
        }
        average = (average) / (numbers.length);
        return average;
    }

    /**
     * printArray Method
     *
     * @param numbers the array who's length was determined by the user and will
     * be printed in this method
     */
    public static void printArray(double[] numbers) {
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
