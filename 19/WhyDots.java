import java.util.Scanner;

public class WhyDots {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First word: ");
        String word = input.nextLine();
        System.out.println("Enter Second word: ");
        String word2 = input.nextLine();
        int x = 0;
        int dotNum = 30 -(word.length() + word2.length()); 
        System.out.print(word);
        while(x < dotNum){
            System.out.print(".");
            x++;
        }
        System.out.print(word2);
    }
}
