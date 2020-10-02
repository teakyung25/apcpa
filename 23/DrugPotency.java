import java.util.Scanner;
import java.text.*;

public class DrugPotency {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat numform = new DecimalFormat();

        int i = 0;
        double effectiveness = 100.0;
        while(effectiveness >= 50 ) {
            System.out.println("Month: " + (i) + "\teffectiveness: " + numform.format(effectiveness)  );
            effectiveness -= effectiveness * 0.04;
            i++;
            if(effectiveness < 50) System.out.println("Month: " + (i) + "\teffectiveness: " + numform.format(effectiveness) + " DISCARDED"  );
        }


    }
}
