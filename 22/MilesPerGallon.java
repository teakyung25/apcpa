import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        while(isContinue){
            System.out.print("Initial Miles: ");
            int start = input.nextInt();
            if (start < 0) break;
            System.out.print("Final Miles: ");
            int finish = input.nextInt();
            System.out.print("Gallons: ");
            int gallons = input.nextInt();

            System.out.println("Miles per Gallon: " + (finish - start) / gallons);

        }
        System.out.println("bye");
    }
}
