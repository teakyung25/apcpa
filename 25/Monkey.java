import java.util.Scanner;

public class Monkey {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        for(int i = 5; i >= 0; i--){
            String word = "";
            if(i == 5) {
                word = "Five";
            } else if (i == 4){
                word = "Four";
            } else if (i == 3){
                word = "Three";
            } else if (i == 2){
                word = "Two";
            } else if (i == 1){
                word = "One";
            } 

            String finalString = ((i == 0) ? "No little monkeys swinging in a tree\nNo little monkeys swinging in a tree": (word + " little monkeys swinging in a tree \nTeasing Mr Crocodile \"you can't catch me\" \nAlong came the crocodile as quiet as can be \nand SNAP!"));
            System.out.println(finalString + "\n");
        }
    }
}