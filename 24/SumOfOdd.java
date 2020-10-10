import java.util.Scanner;

public class SumOfOdd {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Integer: " );
        int n = input.nextInt();

        int sumOdd = 0;
        double nSquared = Math.pow(n,2);

        for(int i = 1; i <= n; i += 2){
            sumOdd += i;
        }

        System.out.println("Odd Sum: " + sumOdd);
        System.out.println("N squared: " + nSquared);
    }
}
