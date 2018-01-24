package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Rank the test scores for an entered number of students and the highest grade
 * sets the bar (Highest is now an A+)
 *
 * @author Andy Frels
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of students: ");
        int[] scores = new int[input.nextInt()];

        System.out.print("Please enter " + scores.length + " test scores: ");
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = input.nextInt();
        }

        Arrays.sort(scores);

        for (int i = 0; i < scores.length; ++i) {
            if (scores[scores.length - 1] == scores[i]) {
                System.out.println("Student " + i + " has a score of " + scores[i] + " and has a grade of A.");
            } else if (scores[i] >= ((scores[scores.length - 1]) - 10) && scores[i] < scores[scores.length - 1]) {
                System.out.println("Student " + i + " has a score of " + scores[i] + " and has a grade of A");
            } else if (scores[i] >= ((scores[scores.length - 1]) - 20) && scores[i] < ((scores[scores.length - 1]) - 10)) {
                System.out.println("Student " + i + " has a score of " + scores[i] + " and has a grade of B");
            } else if (scores[i] >= ((scores[scores.length - 1]) - 30) && scores[i] < ((scores[scores.length - 1]) - 20)) {
                System.out.println("Student " + i + " has a score of " + scores[i] + " and has a grade of C");
            } else if (scores[i] >= ((scores[scores.length - 1]) - 40) && scores[i] < ((scores[scores.length - 1]) - 30)) {
                System.out.println("Student " + i + " has a score of " + scores[i] + " and has a grade of D");
            } else {
                System.out.println("Student " + i + " has a score of " + scores[i] + " and has a grade of F");
            }
        }
    }
}
