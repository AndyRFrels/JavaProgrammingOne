package Chapter4;
import java.util.Scanner;
/**
 * Take requests from bidders based upon total cost and hours working as well as displaying who made a better bid.
 * 
 * @author Andy Frels
 */
public class P4 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the first bidder");
        String firstName = input.next();
        System.out.println("What is the first bidder's amount of time for work(In hours)");
        int hoursRequiredFirst = input.nextInt();
        System.out.println("What is the hourly charge for the first bidder");
        double hourlyChargeFirst = input.nextDouble();
        System.out.println("What is the name of the second bidder");
        String secondName = input.next();
        System.out.println("What is the second bidder's amount of time for work(In hours)");
        int hoursRequiredSecond = input.nextInt();
        System.out.println("What is the hourly charge for the second bidder");
        double hourlyChargeSecond = input.nextDouble();
        double moneyTotalFirst = hoursRequiredFirst * hourlyChargeFirst;
        double moneyTotalSecond = hoursRequiredSecond * hourlyChargeSecond;
        if(moneyTotalFirst < moneyTotalSecond)
        {
            System.out.print("The winner is: " + firstName);
            System.out.print("\n" + firstName);
            System.out.printf("'s Total cost was $%.2f", moneyTotalFirst);
        }
        else if(moneyTotalFirst > moneyTotalSecond)
        {
            System.out.print("The winner is: " + secondName);
            System.out.print("\n" + secondName);
            System.out.printf("'s Total cost was $%.2f", moneyTotalSecond);
        }
        else if(hoursRequiredFirst < hoursRequiredSecond)
        {
            System.out.print("The winner is: " + firstName);
            System.out.println(firstName + " Won because his lower time requirement of " + hoursRequiredFirst + " hours");
        }
        else if(hoursRequiredFirst > hoursRequiredSecond)
        {
            System.out.print("The winner is: " + secondName);
            System.out.println(secondName + " Won because his lower time requirement of " + hoursRequiredSecond + " hours");
        }
        else
        {
            System.out.print("There was a tie between both bidders");
            System.out.print("\n" + firstName);
            System.out.print(" Had a time requirement of " + hoursRequiredFirst + " hours");
            System.out.print("\n" + firstName);
            System.out.printf(" Had a cost requirement of $%.2f", hourlyChargeFirst);
            System.out.print("\n" + firstName);
            System.out.printf("'s Total cost was $%.2f", moneyTotalFirst);
            System.out.print("\n" + secondName);
            System.out.print(" Had a time requirement of " + hoursRequiredSecond + " hours");
            System.out.print("\n" + secondName);
            System.out.printf(" Had a cost requirement of $%.2f", hourlyChargeSecond);
            System.out.print("\n" + secondName);
            System.out.printf("'s Total cost was $%.2f", moneyTotalSecond);
        }
    }
}
