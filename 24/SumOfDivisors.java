import java.util.Scanner;


public class SumOfDivisors {
   public static void main(String [] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Integer: ");
       int n = input.nextInt();
       int sum = 0;
       for(int i = 1; i < n; i++ ){
            sum += n%i == 0 ? i : 0;
            System.out.println(sum);
       }
       String isPerfect = sum == n ? "" : "not";
       System.out.println("The is " + isPerfect + " a perfect number.");
   } 
}
