import java.util.Scanner;

public class Area {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = input.nextInt();
        System.out.println("The radius is: " + (Math.PI*Math.pow(r,2)));
    }
}
