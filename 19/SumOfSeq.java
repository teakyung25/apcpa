import java.util.Scanner;

public class SumOfSeq {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = input.nextInt();
        int x = 1;
        int sum = 0;
        while(x <= n){
            sum += x++;
        }
        System.out.println(sum);
        sum = (n*(n+1))/2;
        System.out.print(sum);

    }
}
