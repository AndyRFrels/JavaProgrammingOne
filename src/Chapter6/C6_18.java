package Chapter6;
import java.util.Scanner;
/**
 * Check a password entered by the user for an eight character length, two of which are digits and no special characters.
 *
 * @author Andy Frels
 */
public class C6_18 
{
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Password: ");
        String password = input.nextLine();
        String passCheck = passCheck(password);
        System.out.println(passCheck);
    }
    /**
     * passCheck Method - check the content of the password and its length.
     *
     * @param pass The password entered by the user.
     */
    public static String passCheck(String pass)
    {
            int lengthCheck = 0;
            int letterDigitCheck = 0;
            int twoDigitCheck = 0;
            String valid = "The password: " + pass + " is valid.";
            String invalid = "The password: " + pass + " is invalid.";
            if(pass.length() >= 8)
            {
                lengthCheck = 1;
            }
            
            for(int charLocation = 0; charLocation < pass.length(); ++charLocation)
            {
                if(Character.isLetterOrDigit(pass.charAt(charLocation)))
                {
                    ++letterDigitCheck;
                }
            }
            
            for(int charLocation = 0; charLocation < pass.length(); ++charLocation)
            {
                if(Character.isDigit(pass.charAt(charLocation)))
                {
                    ++twoDigitCheck;
                }
            }
            
            if(lengthCheck == 1 && letterDigitCheck == pass.length() && twoDigitCheck >= 2)
            {
                return valid;
            }
            else
            {
                return invalid;
            }
    }
}
