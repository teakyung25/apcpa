import java.util.Scanner;

public class InternetDelicatessen {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Item: ");
        String item = input.nextLine();
        System.out.print("Enter the price: ");
        double price = input.nextDouble();
        System.out.print("Overnight delivery (true or false): ");
        boolean isOvernight = input.nextBoolean();
        double deliveryC = 0;
        if(price > 10){
            if(isOvernight){
                deliveryC = 3;
            }
        } else {
            if(isOvernight){
                deliveryC = 5;
            } else {
                deliveryC = 2;
            }
        }

        System.out.println("Invoice:");
        System.out.println("\t" + item + "\t\t" + price);
        System.out.println("\tdelivery" + "\t" + deliveryC);
        System.out.println("\ttotal" + "\t\t" + (deliveryC+price));


    }
}
