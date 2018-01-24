package Chapter7;

import java.util.Scanner;

/**
 * Determine if two entered lists of numbers are strictly similar or not.
 *
 * @author Andy Frels
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list1;
        System.out.print("Please enter a list of numbers: ");
        list1 = input.nextLine();
        char[] newList1 = list1.toCharArray();
        int numberCount = 1;
        for (int i = 0; i < list1.length(); ++i) {
            if (newList1[i] == ' ') {
                ++numberCount;
            }
        }
        String list2;
        System.out.print("\nPlease enter a second list of numbers: ");
        list2 = input.nextLine();
        char[] newList2 = list2.toCharArray();
        int numberCount2 = 1;
        for (int i = 0; i < list2.length(); ++i) {
            if (newList2[i] == ' ') {
                ++numberCount2;
            }
        }
        String[] sList1Array = new String[numberCount];
        String[] sList2Array = new String[numberCount2];
        sList1Array = list1.split(" ");
        sList2Array = list2.split(" ");
        int isEqual = 0;
        if (numberCount == numberCount2) {
            for (int i = 0; i < numberCount; ++i) {
                if (sList1Array[i].equals(sList2Array[i])) {
                    isEqual += 1;
                }
            }
            if (isEqual == numberCount) {
                System.out.println("These lists are strictly similar");
            } else if (isEqual != numberCount) {
                System.out.println("These lists are not strictly similar");
            }
        } else if (isEqual != numberCount) {
            System.out.println("The lists are not strictly similar");
        }
    }
}
//the output for that should be that the 2 arrays are not identical
//its the same thing with the second sample ie 2 1 2 and  1 2
//i think this is the only number you need to fix
