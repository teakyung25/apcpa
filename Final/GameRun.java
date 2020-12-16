import java.util.Scanner;

public class GameRun {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        // Character d = new Character("Knight");
        // System.out.println(d.displayRandCharacter());
        System.out.print("Name of Game: ");
        String title = input.nextLine();
        Game g1 = new Game(title);
        // g1.createNewGame();
        g1.validateFile();
        input.close();
    }
}
