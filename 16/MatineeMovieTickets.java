import java.util.Scanner;

public class MatineeMovieTickets {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Time (1200, 0900, 1300): ");
        int time = input.nextInt();
        int price;
        if(age > 13) {
            if(time > 1200){
                price = 8;
            } else {
                price = 5;
            }
        } else {
            if(time > 1200){
                price = 4;
            } else {
                price = 2;
            }
        }
        System.out.print("Price: " + price);
    }
}
