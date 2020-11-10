import java.util.*;

public class Exercise1
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );

    Boolean isContinue = true;
    while(isContinue){
        System.out.println( hubbard );
        System.out.println("Enter your selection (1, 2, or 3)");
        int selection = input.nextInt();
        if (selection == -1) {
            isContinue = false;
            break;
        } 
        System.out.println("Enter amount to spread: ");
        int spreadAtm = input.nextInt();
        hubbard.select(selection);
        hubbard.spread(spreadAtm);
    }

  }
}