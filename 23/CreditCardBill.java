import java.util.Scanner;
import java.text.*;

public class CreditCardBill {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat();

        System.out.print("Beginning Balance: ");
        double start = input.nextDouble();
        System.out.print("Monthly Interest: ");
        double interest = input.nextDouble();
        System.out.print("Monthly Payments: ");
        double payment = input.nextDouble();
        int i = 0;
        double totalPay = 0;

        while(start > 0) {
            // start -= (start-payment) > 0 ? payment : start;
            start += (start) * interest;
            if((start-payment) > 0){
                start -= payment;
                totalPay += payment;
            } else {
                // System.out.println(start);
                totalPay += start;
                start -= start;
                // System.out.println(totalPay);

            }
            System.out.println("Month: " + (i+1) + "\tbalance: " + numform.format(start) + "\t\t\ttotal payments: " + totalPay );
            i++;
        }
    }
}
