import java.util.Scanner;

public class AddingInt {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers will be added: ");
        int num = input.nextInt();
        int x = 0;
        int sum = 0;
        while(x < num){
            System.out.print("Enter a integer: ");
            sum += input.nextInt();
            x++;
        }
        System.out.print(sum);
    }
}
