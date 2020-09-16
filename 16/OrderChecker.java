import java.util.Scanner;

public class OrderChecker {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of bolts: ");
        int bolts = input.nextInt();
        System.out.print("Number of nuts: ");
        int nuts = input.nextInt();
        System.out.print("Number of washers: ");
        int washers = input.nextInt();
        if(checkOrder(bolts,nuts,washers)){
            System.out.println("Check the order: Order is ok");
        } else {
            System.out.println("Check the order: too few nuts");
        }
        int cost = (bolts * 5) + (nuts * 3) + washers;

        System.out.println("Total cost: " + cost);
        

    }
    public static boolean checkOrder(int b, int n, int w){
        if(n >= b && (w >= (b*2))){
            return true;
        } else {
            return false;
        }
    }
}
