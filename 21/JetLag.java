import java.util.Scanner;

public class JetLag {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hours Traveled: ");
        double hours  = input.nextDouble();

        System.out.println("Time Zones Crossed: ");
        int zones  = input.nextInt();

        System.out.println("Depart: ");
        double depart  = input.nextDouble();

        System.out.println("Arrive: ");
        double arrive  = input.nextDouble();

        // depart = timeToPoints(depart);
        // arrive = timeToPoints(arrive);
        System.out.println(depart);
        System.out.println(arrive);
        
        double daysOfRecovery = (hours/2.0 + (zones - 3) + depart + arrive)/ 10.0;
        System.out.println("You need " + daysOfRecovery + " to recover");
    }
    // public static int timeToPoints (double value) {
    //     int num = 0;
    //     if (value < 1) {
    //         num = 4; 
    //     } else if (value < 8) {
    //         num = 3;
    //     } else if(value < 12) {
    //         num = 2;
    //     } else if (value < 18 ) {
    //         num = 1;
    //     } else if (value < 22) {
    //         num = 0;
    //     } 
    //     return num;
    // }
}
