import java.util.Scanner;

public class MicrowaveOven {
   public static void main (String [] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Number of Items: ");
       int num = input.nextInt(); 
       System.out.print("Heating Time: ");
       int time = input.nextInt();
       int sec =  (time % 100) + (time/100)*60;
       double recSec = 0;
       if(num == 2) {
           recSec = (sec * 0.5) + sec;
       } else if (num == 3){
           recSec = sec * 2; 
       } else {
           recSec = sec; 
       }

       System.out.println("Heat for " + (recSec - (recSec % 60))/60 + " minutes " + (recSec % 60) + " seconds" );

   } 
}
