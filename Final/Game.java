import java.util.*;
import java.io.*;

public class Game {
    private ArrayList<CharacterPlayer> partyCharacters = new ArrayList<CharacterPlayer>();
    private String name;
    private Scanner input = new Scanner(System.in);
    private String[] characterTypes = {"Knight","Peasant","Cleric","Mage","Courtier"};

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
                CharacterPlayer newRandomCharacter = new CharacterPlayer(userClass);
                while(!userLike) {  
                    newRandomCharacter = new CharacterPlayer(userClass);
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
        System.out.print("Filename to save to (add extension): ");
        String filename = input.next();
        saveGame(filename);
    }

    //Validating a Saved File
    public boolean validateFile(String filename){
        File newFile = new File(filename);
        partyCharacters.clear();
        int i = 0;
        boolean isGood = true;
        try{
            Scanner inputF = new Scanner(newFile);
            while(inputF.hasNextLine()){
                if(i == 0) {
                    String line = inputF.nextLine();
                    if(line.indexOf(",") == -1) {
                        this.name = line;
                    } else { i++; }
                } else {
                    try{
                        this.partyCharacters.add(parseCharacter(inputF.nextLine()));
                    } catch(Exception e) {
                        System.out.println("Your characters are formated incorrectly!");
                        isGood = false;
                    }
                }
                i++;
            }
            inputF.close();
        } catch(IOException e){}
        i--;
        if(i > 4 || i < 4){
            System.out.println("You have " + (i) + " # of characters, which is " + (i-4) + " over or under the required amount four!" );
            isGood = false;
        } 
        for(CharacterPlayer c : partyCharacters) {
            if(!c.isValidSocre(c.getRanks())) {
                System.out.println("Sorry the scores of your characters are not inbound.");
                isGood = false;
            }
            if(!isValidPartyValidateFunct(c.getCharacterType())){
                System.out.println("Sorry there are more than two instences of a class in your party.");
                isGood = false;
                break;
            }
        }
        return isGood;
    }

    //Reroll Existing Character
    public void reRollCharacter(String filename){
        validateFile(filename);
        System.out.println("Enter Character Name to Reroll: ");
        String charName = input.next();
        int i = 0;
        for(CharacterPlayer c : partyCharacters) {
            if(c.getName().equals(charName)) {
                CharacterPlayer reRoll = new CharacterPlayer(c.getCharacterType());
                reRoll.setName(charName);
                partyCharacters.set(i,reRoll);
            }
            i++;
        }
        saveGame(filename); 
    }

    
    //**Support functions to the central functions**
    
    //Check to see if the frequency of the given class
    private boolean isValidParty(String userClass) {
        //Compiles the CharacterPlayer objects to a String list of classes 
        ArrayList<String> stringCharacters = new ArrayList<String>();
        for(CharacterPlayer c : partyCharacters) stringCharacters.add(c.getCharacterType());
        //Checks for frequency and returns true if all are under two
        if(Collections.frequency(stringCharacters,userClass) == 2) return false;
        return true;
    }

    private boolean isValidPartyValidateFunct(String userClass) {
        //Compiles the CharacterPlayer objects to a String list of classes 
        ArrayList<String> stringCharacters = new ArrayList<String>();
        for(CharacterPlayer c : partyCharacters) stringCharacters.add(c.getCharacterType());
        //Checks for frequency and returns true if all are under two
        if(Collections.frequency(stringCharacters,userClass) > 2) return false;
        return true;
    }

    //Check to see if the user entered class matches the correct format 
    private String validCharacterInput() {
        System.out.println("Character Classes: " + Arrays.toString(characterTypes));
        String characterClass = "";
        boolean isGood = false;
        while(!isGood) {
            System.out.print("Enter Class (Capitalize first letter): ");
            characterClass = input.next();
            input.nextLine();
            if(Arrays.asList(characterTypes).contains(characterClass)) isGood = true;
        }
        return characterClass;
    }

    //Save the Game 
    private void saveGame(String filename){
        File newFile = new File(filename);
        try{
            PrintWriter fileReader = new PrintWriter(new FileWriter(newFile, false));
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

    //try to parse CharacterPlayer 
    private CharacterPlayer parseCharacter(String stringCharacter){
        String[] data = stringCharacter.split(",");
        int[] score = new int[5];
        for(int i = 2; i < 7; i++){
            score[i-2] = Integer.parseInt(data[i]);
        }
        return new CharacterPlayer(data[0],data[1],score);
    }


}
