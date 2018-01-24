package Chapter2;

import java.util.Scanner;

/**
 * Display the volume of a cylinder based upon the entered radius and length.
 *
 * @author Andy Frels
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the cylinder in cm: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14;
        System.out.println("Please enter the length of the cylinder in cm: ");
        double volume = area * input.nextDouble();
        System.out.println("The volume of the cylinder is " + volume);
    }
}
