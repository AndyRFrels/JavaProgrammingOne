package Chapter4;

import java.util.Scanner;

/**
 * Intake and display an employee's name, hours worked, pay rate, witholding
 * rate(fed and state), gross pay, and net pay.
 *
 * @author Andy Frels
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the employee's name");
        String employeeName = input.nextLine();
        System.out.println("Please enter the hours worked this week");
        double hoursWorked = input.nextDouble();
        System.out.println("Please enter the hourly pay rate");
        double hourlyPay = input.nextDouble();
        System.out.println("Please enter the federal witholding rate");
        double federalRate = input.nextDouble();
        System.out.println("Please enter the state witholding rate");
        double stateRate = input.nextDouble();
        System.out.printf("Employee's Name: " + employeeName);
        System.out.printf("\nHours Worked: %.2f", hoursWorked);
        System.out.printf("\nHourly Pay: $%.2f", hourlyPay);
        System.out.printf("\nGross Pay: $%.2f", (hoursWorked * hourlyPay));
        System.out.printf("\nDeductions:\n\tFederal Withholding(%.2f)", (federalRate * 100));
        System.out.printf(": $%.2f", (federalRate * (hoursWorked * hourlyPay)));
        System.out.printf("\n\tState Withholding(%.2f)", (stateRate * 100));
        System.out.printf(": $%.2f", (stateRate * (hoursWorked * hourlyPay)));
        System.out.printf("\n\tTotal Withholding: $%.2f", (stateRate * (hoursWorked * hourlyPay)) + (federalRate * (hoursWorked * hourlyPay)));
        System.out.printf("\nNet Pay: $%.2f", ((hoursWorked * hourlyPay) - ((stateRate * (hoursWorked * hourlyPay)) + (federalRate * (hoursWorked * hourlyPay)))));
    }

}
