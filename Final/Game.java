import java.util.*;
import java.io.*;

public class Game {
    private ArrayList<Character> partyCharacters = new ArrayList<Character>();
    private String name;
    private Scanner input = new Scanner(System.in);
    private String[] character = {"Knight","Peasant","Cleric","Mage","Courtier"};

    public Game(String name){
        this.name = name;
    }


    //**Central Functions called on GameRun file**

    //Creating a New Game!
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
            System.out.println(partyCharacters + "\n\n");
        }
        saveGame();
    }

    //Validating a Saved File
    public void validateFile(){
        System.out.print("Filename to check (add extension): ");
        String filename = input.next();
        File newFile = new File(filename);
        int i = 0;
        try{
            Scanner input = new Scanner(newFile);
            while(input.hasNextLine()){
                if(i == 0) {
                    this.name = input.nextLine();
                } else {
                    try{
                        this.partyCharacters.add(parseCharacter(input.nextLine()));
                    } catch(Exception e) {
                        System.out.println("Your characters are formated incorrectly!");
                    }
                }
                i++;
            }
            input.close();
        } catch(IOException e){}
        i--;
        if(i > 4 || i < 4){
            System.out.println("You have " + (i) + " # of characters, which is " + (i-4) + " over or under the required amount four!" );
        } 
        for(Character c : partyCharacters) {
            if(c.isValidSocre(c.getRanks())) {
                System.out.println("Sorry the scores of your characters are not inbound.");
            }
            if(isValidParty(c.getCharacterType())){
                System.out.println("Sorry the scores of your characters are not inbound.");
                break;
            }
        }
    }

    private Character parseCharacter(String stringCharacter){
        String[] data = stringCharacter.split(",");
        int[] score = new int[5];
        for(int i = 2; i < 7; i++){
            score[i-2] = Integer.parseInt(data[i]);
        }
        return new Character(data[0],data[1],score);
    }


    //**Support functions to the central functions**
    
    //Check to see if the frequency of the given class
    private boolean isValidParty(String userClass) {
        //Compiles the Character objects to a String list of classes 
        ArrayList<String> stringCharacters = new ArrayList<String>();
        for(Character c : partyCharacters) stringCharacters.add(c.getCharacterType());

        //Checks for frequency and returns true if all are under two
        if(Collections.frequency(stringCharacters,userClass) == 2) return false;
        return true;
    }

    //Check to see if the user entered class matches the correct format 
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

    //Save the Game 
    private void saveGame(){
        System.out.print("Filename to save to (add extension): ");
        String filename = input.next();
        File newFile = new File(filename);
        try{
            PrintWriter fileReader = new PrintWriter(newFile);
            for(int i = 0; i < partyCharacters.size()+1; i++) {
                if(i == 0) {
                    fileReader.println(name);
                } else {
                    fileReader.println(partyCharacters.get(i-1).toFileFormat());
                }
            }
            fileReader.close();
        } catch (IOException e) {}
    }
}
