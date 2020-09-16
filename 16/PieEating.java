import java.util.Scanner; 

public class PieEating {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Weight: ");
        double weight = input.nextDouble();
        // if(weight > 30 && weight < 250){
        //     System.out.print("Allowed");
        // } else {
        //     System.out.print("Denied");
        // }
        boolean enter = (weight > 30 && weight < 250) ? true : false;
        System.out.println(enter);    
    }
}
