package Chapter1;

/**
 * Display both the perimeter and area of a circle with a radius of 5.5 cm using
 * (d * pi) and (r * r * pi)
 *
 * @author Andy Frels
 */
public class C1_8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("The perimeter of a circle with a radius of 5.5 is: " + (2 * 5.5 * 3.141));
        System.out.println("The area of a circle with a radius of 5.5 is: " + (5.5 * 5.5 * 3.141));
    }
}
