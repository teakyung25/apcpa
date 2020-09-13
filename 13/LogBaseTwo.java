import java.util.Scanner;

public class LogBaseTwo {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Double: ");
        Double num = input.nextDouble();
        System.out.println( "Base 2 log of " + num + " is " + (Math.log(num)/Math.log(2)));
    }
}
