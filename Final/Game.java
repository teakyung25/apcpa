import java.util.*;

public class Game {
    private ArrayList<Character> partyCharacters = new ArrayList<Character>();
    private String name;
    private Scanner input = new Scanner(System.in);
    private String[] character = {"Knight","Peasant","Cleric","Mage","Courtier"};

    public Game(String name){
        this.name = name;
    }

    public void createNewGame() {
        // boolean isGood = isValidParty();
        int i = 1;
        while(partyCharacters.size() < 4){
            //set up
            System.out.println("Character #" + (i));                
            boolean userLike = false;
            String userClass = validCharacterInput();
            if(isValidParty(userClass)) {
                Character newRandomCharacter = new Character(userClass);
                while(!userLike) {  
                    newRandomCharacter = new Character(userClass);
                    System.out.println(newRandomCharacter.displayRandCharacter());
                    System.out.print("Keep Character(yes/no): ");
                    String yesNo = input.next();  
                    input.nextLine();
                    if(yesNo.equals("yes")) {
                        userLike = true;
                    } else {
                        userLike = false;
                    }
                }
                
                System.out.print("Name of Character: ");
                String name = input.nextLine();
                newRandomCharacter.setName(name);
                partyCharacters.add(newRandomCharacter);
                i++;
            } else {
                System.out.println("You already have two " + userClass + " characters, enter different class.");
                continue;
            }
            System.out.println(partyCharacters);
        }
    }

    private boolean isValidParty(String userClass) {
        //Compiles the Character objects to a String list of classes 
        ArrayList<String> stringCharacters = new ArrayList<String>();
        for(Character c : partyCharacters) stringCharacters.add(c.getCharacterType());

        //Checks for frequency and returns true if all are under two
        if(Collections.frequency(stringCharacters,userClass) == 2) return false;
        return true;
    }

    private String validCharacterInput() {
        System.out.println("Character Classes: " + Arrays.toString(character));
        String characterClass = "";
        boolean isGood = false;
        while(!isGood) {
            System.out.print("Enter Class (Capitalize first letter): ");
            characterClass = input.next();
            input.nextLine();
            if(Arrays.asList(character).contains(characterClass)) isGood = true;
        }
        return characterClass;
    }



    // private void saveGame(){
        
    // }
}
