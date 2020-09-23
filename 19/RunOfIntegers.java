import java.util.Scanner;

public class RunOfIntegers {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int min = input.nextInt();
        System.out.print("Enter End: ");
        int max = input.nextInt();

        int x = 0;
        while(min <= (max)){
            System.out.println(min++);
        }
    }
}
