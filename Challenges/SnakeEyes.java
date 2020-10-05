import java.util.Scanner;
import java.util.Random;

public class SnakeEyes {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many rounds: ");
        int n = input.nextInt();
        double sumRolls = 0;
        double sumScore = 0;
        double theFour = 0;
        for(int i = 0; i < n; i++){
            boolean isSnakeEye = false;
            int sum = 0;
            int rolls = 0;
            while(!isSnakeEye) {
                int r1 = rand.nextInt(6)+1, r2 = rand.nextInt(6)+1;
                rolls++;
                if(r1 == 1 && r2 == 1){
                    isSnakeEye = true;
                    sumRolls += rolls;
                    sumScore += sum;
                    if(rolls > 4) theFour++;
                } else {
                    sum += r1 + r2;
                }
            }
        }

        sumRolls /= (double) n;
        sumScore /= (double) n;
        theFour /= (double) n;
        System.out.println("Average Rolls: " + sumRolls + " Average Score: " + sumScore + " Percent Above Four: " + theFour*100);
    }
  
}