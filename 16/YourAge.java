import java.util.Scanner;

public class YourAge {
    public static void main (String []args ){
        Scanner input = new Scanner(System.in);

        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Months: ");
        int months = input.nextInt();
        System.out.print("Days: ");
        int days = input.nextInt();
        int total = 0;

        total += year*365*24*60*60; 
        for(int i = 0; i < months; i++){
            if((i+1)%2 == 0 && (i+1) != 2){
                total += 31;
            } else if ((i+1) == 2) {
                total += 29;
            } else {
                total += 30;
            }
        }

        total += days*24*60*60;


        System.out.print("Your age in second: " + total);

    }
}
