package Chapter3;

import java.util.Scanner;

/**
 * State if an integer is divisible by five, six, both, or neither.
 *
 * @author Andy Frels
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int enteredInt = input.nextInt();
        String ansOne = " ";
        String ansTwo = " ";
        String ansThree = " ";
        int x = 0;
        int y = 0;
        if ((enteredInt % 5 == 0) && (enteredInt % 6 == 0)) {
            ansOne = "True";
            x = 1;
        } else {
            ansOne = "False";
        }

        if ((enteredInt % 5 == 0) || (enteredInt % 6 == 0)) {
            ansTwo = "True";
            y = 1;
        } else {
            ansTwo = "False";
        }

        if (x + y == 1) {
            ansThree = "True";
        } else {
            ansThree = "False";
        }
        System.out.println("Is the integer divisible by 5 and 6? " + ansOne);
        System.out.println("Is the integer divisible by 5 or 6? " + ansTwo);
        System.out.println("Is the integer divisible by 5 or 6, but not both? " + ansThree);
    }
}
