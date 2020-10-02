import java.util.Scanner;

import java.util.Scanner;

public class InRangeAdder {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int outSum = 0;
        int inSum = 0;
        System.out.print("Low end of range: ");
        int low = input.nextInt();
        System.out.print("High end of range: ");
        int high = input.nextInt();
        for(int i = 0; i < 6; i++){
            System.out.print("Enter Data: ");
            int num = input.nextInt();
            if (num > low && num < high) {
                inSum += num;
            } else {
                outSum += num;
            }
        }
        System.out.println("Sum of in range values: " + inSum);
        System.out.println("Sum of out of range values: " + outSum);
    }
}
