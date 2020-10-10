import java.util.Scanner;

public class Birthdox {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("N number of guest: ");
        int n = input.nextInt();
        double notShare = 1;
        int chance = 0;
        for(int i = 0; i <= (n-1); i++){
            notShare *= ((365 - (double)i)/365);
            if(notShare > 0.5) chance = i;
        }
        System.out.println("Probalilities of not same birthday: " + notShare);
        System.out.println("# for More than fifty percent: " + chance);
        
    }

}
