import java.util.Scanner;

public class AnnualApplianceCost {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cost per kilowatt-hour in cents: ");
        double rate = input.nextDouble();
        System.out.print("Enter kilowatt-hours used per year: ");
        double hours = input.nextDouble();
        System.out.println("Annual Cost: " + (rate*hours));
    }
}
