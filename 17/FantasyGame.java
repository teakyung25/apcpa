import java.util.Scanner;

public class FantasyGame {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String name;
        int [] c = new int[3];
        boolean isLess = true;
        System.out.print("Enter the name of your character: ");
        name = input.nextLine();
        while(isLess){
            System.out.println("\nYour Character Characteristics: \n");
            System.out.print("Enter strength: ");
            c[0] = input.nextInt();
            System.out.print("Enter health: ");
            c[1] = input.nextInt();
            System.out.print("Enter lunk: ");
            c[2] = input.nextInt();
            if((c[0] + c[1] + c[2]) > 15){
                System.out.println("Try Again, your points exceed 15 points!");
            } else {
                isLess = false;
            }
        }
    }
}
