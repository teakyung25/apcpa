import java.util.Scanner;

public class WindChillIndex {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Wind Speed: ");
        double speed = input.nextDouble();
        System.out.print("Enter Temperature: ");
        double chill = input.nextDouble();
        double WCI;
        if(speed < 3) {
            WCI = chill;
        } else if (chill > 50) {
            WCI = chill;
        } else {
            WCI = (35.74) + (0.6215*chill) - (35.75*Math.pow(speed,0.16)) + (0.4275*Math.pow(speed,0.16)*chill);
        }
        System.out.println("Wind Chill: " + WCI);
    }
}
