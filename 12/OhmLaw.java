import java.util.Scanner;

public class OhmLaw {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Volatge: ");
        int v = input.nextInt();
        System.out.print("Resistance: ");
        int r = input.nextInt();

        System.out.println("I = " + (v + 0.0)/r);
    }
}
