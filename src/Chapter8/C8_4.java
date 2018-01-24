package Chapter8;

import java.util.Arrays;

/**
 * Display the work schedule for employees at a seven eleven or something idk.
 *
 * @author Andy Frels
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    static public void main(String[] args) {
        int[][] schedule = {{2, 4, 3, 4, 5, 8, 8, 34},
        {7, 3, 4, 3, 3, 4, 4, 28},
        {3, 3, 4, 3, 3, 2, 2, 20},
        {9, 3, 4, 7, 3, 4, 1, 31},
        {3, 5, 4, 3, 6, 3, 8, 32},
        {3, 4, 4, 6, 3, 4, 4, 28},
        {3, 7, 4, 8, 3, 8, 4, 37},
        {6, 3, 5, 9, 2, 7, 9, 41}};
        int[] employeeHours = new int[8];
        for (int k = 0; k < 8; ++k) {
            int hours = 0;
            for (int l = 0; l < 7; ++l) {
                hours += schedule[k][l];
            }
            employeeHours[k] = hours;
        }
        Arrays.sort(employeeHours);
        for (int m = 0; m < 4; ++m) {
            int n;
            n = employeeHours[m];
            employeeHours[m] = employeeHours[7 - m];
            employeeHours[7 - m] = n;
        }
        System.out.print("             Su  M  T  W  Th F  Sa Total");
        for (int i = 0; i < 8; ++i) {
            System.out.print("\nEmployee " + (i + 1) + "  ");
            for (int j = 0; j < 8; ++j) {
                System.out.print("  " + schedule[i][j]);
            }
        }
    }
}
