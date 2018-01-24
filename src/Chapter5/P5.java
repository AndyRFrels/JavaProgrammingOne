package Chapter5;

import java.util.Scanner;

/**
 * Count the yes or no votes entered by a user until they stop voting, and then
 * display the results.
 *
 * @author Andy Frels
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stillVoting = 1;
        int yesVotes = 0;
        int noVotes = 0;
        System.out.print("Enter 'Y' to vote Yes\n'N' to vote No\n'Q' to quit voting");
        while (stillVoting == 1) {
            System.out.print("\nVote Here:");
            String vote = input.next().toLowerCase();
            if (vote == null) {
                System.out.println("Invalid Entry");
            } else {
                switch (vote) {
                    case "y":
                        ++yesVotes;
                        break;
                    case "n":
                        ++noVotes;
                        break;
                    case "q":
                        stillVoting = 0;
                        break;
                    default:
                        System.out.println("Invalid Entry");
                }
            }
        }
        System.out.println("Yes Votes: " + yesVotes);
        System.out.println("No Votes: " + noVotes);
    }
}
