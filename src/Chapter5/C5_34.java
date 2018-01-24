package Chapter5;

import java.util.Scanner;

/**
 * Have a user play rock paper scissors against a random number generator, keep
 * score and the first to three wins.
 *
 * @author Andy Frels
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;
        while (playerScore <= 2 && computerScore <= 2) {
            int guessValue = 0;
            int getChoice = 1;
            while (getChoice == 1) {
                System.out.println("Rock, Paper, or Scissors? ");
                String choiceChosen = input.next().toLowerCase();
                if (null == choiceChosen) {
                    System.out.println("Invalid Entry");
                } else {
                    switch (choiceChosen) {
                        case "rock":
                            guessValue = 0;
                            getChoice = 0;
                            break;
                        case "paper":
                            guessValue = 1;
                            getChoice = 0;
                            break;
                        case "scissors":
                            guessValue = 2;
                            getChoice = 0;
                            break;
                        default:
                            System.out.println("Invalid Entry");
                            break;
                    }
                }
            }
            int computerGuess = (int) (Math.random() * 3);
            switch (guessValue) {
                case 0:
                    if (computerGuess == 0) {
                        System.out.println("Result: Tie");
                    }
                    if (computerGuess == 1) {
                        System.out.println("Result: Computer");
                        ++computerScore;
                    }
                    if (computerGuess == 2) {
                        System.out.println("Result: Player");
                        ++playerScore;
                    }
                    break;
                case 1:
                    if (computerGuess == 0) {
                        System.out.println("Result: Player");
                        ++playerScore;
                    }
                    if (computerGuess == 1) {
                        System.out.println("Result: Tie");
                    }
                    if (computerGuess == 2) {
                        System.out.println("Result: Computer");
                        ++computerScore;
                    }
                    break;
                case 2:
                    if (computerGuess == 0) {
                        System.out.println("Result: Computer");
                        ++computerScore;
                    }
                    if (computerGuess == 1) {
                        System.out.println("Result: Player");
                        ++playerScore;
                    }
                    if (computerGuess == 2) {
                        System.out.println("Result: Tie");
                    }
                    break;
            }
        }
        if (computerScore > playerScore) {
            System.out.println("The computer has won outright");
        }
        if (computerScore < playerScore) {
            System.out.println("The player has won outright");
        }
    }
}
