import java.util.Scanner;

public class HarmonicMean {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = input.nextInt();
        System.out.print("Enter Y: ");
        int y = input.nextInt();

        System.out.println("Arithmetic mean: " + (x+y)/2);
        System.out.println("Harmonic mean: " + 2/((1.0/x)+(1.0/y)));
    }
}
