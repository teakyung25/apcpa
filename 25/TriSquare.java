import java.util.Scanner; 

public class TriSquare {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        long n = input.nextLong();
        int sum = 0;
        for(int i = 1; sum < n; i++){
            sum += i ;
            if(isSquare(i) && isTriangle(i) ) {
                System.out.println(i);
            }
        }
    }
    public static boolean isSquare (int num) {
        if(num%Math.sqrt(num) == 0) {
            return true;
        }
        return false;
    }
    public static boolean isTriangle (int num) {
        int sum = 0;
        for(int i = 1; sum <= num; i++) {
            sum = sum + i;
            if (sum == num)
                return true;
        }
        return false;
    }
}
