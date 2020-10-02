import java.util.Scanner;

public class PowerNumber {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        boolean isPositive = true;
        double x = 0;
        int n = 0;
        while(isPositive) {
            System.out.println("Enter X: ");
            x = input.nextDouble();
            System.out.println("Enter N: ");
            n = input.nextInt();

            isPositive = n < 0 ? true : false;
            if(isPositive) System.out.println("N must be a positive integer.");
        }
        System.out.println(x + " raised to the power " + n + " is: " + Math.pow(x,n));
    }
}
