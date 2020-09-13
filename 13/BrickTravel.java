import java.util.Scanner;
public class BrickTravel {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        Double seconds = input.nextDouble();
        System.out.println("Distance: " + (0.5)*32.174*Math.pow(seconds,2));
    }
}
