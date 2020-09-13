import java.util.Scanner;

public class CentDollar {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input cents: ");
        int tCents = input.nextInt();
        int cents = tCents % 100;
        int dollars = (tCents - cents)/100;
        System.out.println("That is " + dollars + " dollars and " + cents + " cents");
    }
}
