import java.util.Scanner;

public class GameRun {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);        
        Game game = new Game("Game");

        String filename;
        while(true) {
            int menuNum = menu(input);  
            switch(menuNum) {
                case 1:
                    // CREATE A NEW GAME **********
                    System.out.print("Name of Game: ");
                    String title = input.nextLine();
                    game = new Game(title);
                    game.createNewGame();
                  break;
                case 2:
                    // VALIDATE FILE **************
                    System.out.print("Filename to check (add extension): ");
                    filename = input.next();
                    if(game.validateFile(filename)) System.out.println("No Errors! Your file is valide!");
                  break;
                case 3:
                    // REROLL AN EXISTING CHARACTER ******
                    System.out.print("Filename to reroll (add extension): ");
                    filename = input.next();
                    game.reRollCharacter(filename);
                    break;
                case 4:
                  input.close();
                  System.exit(0);
                  break;
              }
        }
    }

    public static int menu(Scanner input) {
        boolean more = true;
        int i = 0;
        while(more) {
            System.out.println("Menu options");
            System.out.println("    1:New Game");
            System.out.println("    2:Validate Game File");
            System.out.println("    3:Reroll Select Character");
            System.out.println("    4:Exit");
            System.out.print("Enter: ");
            i = input.nextInt();
            input.nextLine();
            if(i <= 5 && i > 0) {
                more = false;
            } else {
                System.out.println("Please Enter a number between 1-5.\n");
            }
            
        }
        return i;
    }
}
