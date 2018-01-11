package Chapter4;

import java.util.Scanner;

/**
 * Determine a persons major and grade level based upon entered integers only allowing (M C and I)(1 2 3 and 4).
 * 
 * @author Andy Frels
 */
public class C4_18 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two characters");
        String charactersEntered = input.nextLine();
        char partOne = charactersEntered.charAt(0);
        char partTwo = charactersEntered.charAt(1);
        String classTaken;
        String studentLevel;
        switch (partOne) {
            case 'M':
                classTaken = "Mathematics";
                break;
            case 'C':
                classTaken = "Computer Science";
                break;
            case 'I':
                classTaken = "Information Technology";
                break;
            default:
                System.out.println("Invalid Course");
                classTaken = "no";
                break;
        }
        switch (partTwo) {
            case '1':
                studentLevel = "Freshman";
                break;
            case '2':
                studentLevel = "Sophmore";
                break;
            case '3':
                studentLevel = "Junior";
                break;
            case '4':
                studentLevel = "Senior";
                break;
            default:
                System.out.println("Invalid Student Level");
                studentLevel = "no";
                break;
        }
        if(!"no".equals(studentLevel) && !"no".equals(classTaken))
        {
            System.out.println(classTaken + " " + studentLevel);
        }
    }
}
