import java.util.Scanner;

public class OneLetter {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        int x = 0;
        while(x < word.length()){
            System.out.println(word.charAt(x));
            x++;
        }
    }
}
