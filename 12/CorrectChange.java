import java.util.Scanner;

public class CorrectChange {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input cents: ");
        int tCents = input.nextInt();
        int dollars = 0; 
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int cents = 0;
        // System.out.println(tCents);
            if(tCents % 100 != 0 || tCents >= 100){
                dollars = (tCents - tCents%100)/100;
                tCents = tCents%100;
                System.out.println(tCents);
            }
             if((tCents % 25 != 0) || (tCents >= 25)) {
                quarters  = (tCents - tCents%25)/25;
                System.out.println(quarters);
                tCents = tCents%25;
                System.out.println(tCents);
            } 
            if (tCents % 10 != 0 || tCents >= 10) {
                dimes = (tCents - tCents%10)/10;
                tCents = tCents%10;
            } 
            if (tCents % 5 != 0 || tCents >= 5){
                nickels = (tCents - tCents%5)/5;
                tCents = tCents%5;
            } 
            if (tCents < 5){
                cents = tCents;
            }
        System.out.println(dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + cents + " cents");
        
    }
}
