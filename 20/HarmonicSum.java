import java.util.Scanner;

public class HarmonicSum {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = input.nextInt();
        int x = 0;
        double sum = 0;
        while(x < n){
            sum += (1.0/(x+1));
            x++;
        }
        System.out.println(sum);
    }
}  
