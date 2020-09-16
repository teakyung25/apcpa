import java.util.Scanner;

public class DiscountPrice {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of purchases: ");
        double price = input.nextDouble();
        double finalP;
        if(price > 10){
            finalP = price * 0.9;
        } else{
            finalP = price;
        }
        System.out.println("Discounted Price: " + finalP);
    }
}
