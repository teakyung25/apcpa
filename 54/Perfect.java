import java.util.Scanner;

public class Perfect {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Upper Limit: ");
        int limit = input.nextInt();
        for(int i = 0; i < limit; i++){
            System.out.println("Is " + i + " perfect?: " + isPerfect(i));
        }
    }

    public static boolean isPerfect(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num%i == 0) sum += i;
        }
        if(sum == num) return true;
        return false;
    }
}