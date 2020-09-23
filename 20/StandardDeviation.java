import java.util.Scanner;

public class StandardDeviation {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers will be added: ");
        int num = input.nextDouble();
        int x = 0;
        double [] nums = new double[num];
        double sum = 0;
        double avgSquare = 0;
        while(x < num){
            System.out.print("Enter a integer: ");
            double value = input.nextInt();
            nums[x] = value;
            sum += value;
            avgSquare += Math.pow(value, 2);
            x++;
        }
        double average = sum/num;
        avgSquare = avgSquare/num;
        System.out.println("Average: " + average);
        
        System.out.println("Standard Deviation: " + Math.sqrt(avgSquare-Math.pow(average,2)));
        
    }
}
