import java.util.*;

public class MultiplicationQuiz {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        for(int i = 0; i < 10; i++ ){
            int r1 = rand.nextInt(10);
            int r2 = rand.nextInt(10);
            System.out.print("What is " + r1 + " * "  + r2 + "?");
            int answer = input.nextInt();
            if(answer == r1*r2){
                System.out.println("Right!");
                score++;
            } else {
                System.out.println("Wrong.");
            }
        }
        System.out.println("You got " + score + " out of 10 questions correct!");
    }
}
