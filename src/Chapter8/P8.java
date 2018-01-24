package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the user enter which of four salesmen made a sale, what day they made it
 * on, and how much it was for.
 *
 * @author Andy Frels
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int finishedSales = 0;
        double[][] sales = new double[4][5];
        while (finishedSales == 0) {
            int properEnter = 0;
            Scanner input = new Scanner(System.in);
            String sSalesman = " ";
            String sDay = " ";
            int iSalesman = 0;
            int iDay = 0;
            double amount = 0;
            while (properEnter == 0) {
                System.out.print("\nEnter the ID of the Salesman(A, B, C, or D): ");
                sSalesman = input.nextLine();
                sSalesman = sSalesman.toUpperCase();
                switch (sSalesman) {
                    case "A":
                        iSalesman = 0;
                        ++properEnter;
                        break;
                    case "B":
                        iSalesman = 1;
                        ++properEnter;
                        break;
                    case "C":
                        iSalesman = 2;
                        ++properEnter;
                        break;
                    case "D":
                        iSalesman = 3;
                        ++properEnter;
                        break;
                    default:
                        iSalesman = 4;
                        System.out.print("You did not enter a valid salesman");
                        break;
                }
            }
            --properEnter;
            while (properEnter == 0) {
                System.out.print("\nWhat was the day of the sale(M, T, W, H, or F): ");
                sDay = input.nextLine();
                sDay = sDay.toUpperCase();
                switch (sDay) {
                    case "M":
                        iDay = 0;
                        ++properEnter;
                        break;
                    case "T":
                        iDay = 1;
                        ++properEnter;
                        break;
                    case "W":
                        iDay = 2;
                        ++properEnter;
                        break;
                    case "H":
                        iDay = 3;
                        ++properEnter;
                        break;
                    case "F":
                        iDay = 4;
                        ++properEnter;
                        break;
                    default:
                        iDay = 5;
                        System.out.print("You did not enter a valid day");
                        break;
                }
            }
            --properEnter;
            System.out.print("How much was the sale by " + sSalesman + " on " + sDay + " worth: ");
            amount = input.nextDouble();
            String yesNo;
            if (iSalesman < 4 && iDay < 5) {
                sales[iSalesman][iDay] += amount;
                while (properEnter == 0) {
                    System.out.print("Would you like to continue entering sales: ");
                    yesNo = input.next();
                    yesNo = yesNo.toUpperCase();
                    switch (yesNo) {
                        case "Y":
                            properEnter = 1;
                            finishedSales = 0;
                            break;
                        case "N":
                            properEnter = 1;
                            finishedSales = 1;
                            break;
                        default:
                            finishedSales = 0;
                            properEnter = 0;
                            System.out.println("Enter a proper response");
                            break;
                    }
                }
            }
        }
        System.out.println("\nSalesman  M       T       W       H       F");
        System.out.print("A:  ");
        for (int i = 0; i < 5; ++i) {
            System.out.print("\t$" + sales[0][i]);
        }
        System.out.print("\nB:  ");
        for (int i = 0; i < 5; ++i) {
            System.out.print("\t$" + sales[1][i]);
        }
        System.out.print("\nC:  ");
        for (int i = 0; i < 5; ++i) {
            System.out.print("\t$" + sales[2][i]);
        }
        System.out.print("\nD:  ");
        for (int i = 0; i < 5; ++i) {
            System.out.print("\t$" + sales[3][i]);
        }
    }
}
