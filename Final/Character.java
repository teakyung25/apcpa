import java.util.*;

public class Character {
    private String name;
    private String characterType;
    private String[] characters = {"Knight","Peasant","Cleric","Mage","Courtier"};
    private int[] ranks = new int[5];


    public Character(String name, String characterType, int[] ranks) {
        this.name = name;
        this.characterType = characterType;
        this.ranks = ranks;
    }

    public Character (String characterType) {
        this.characterType = characterType;
        this.ranks = randomRanks(Arrays.asList(characters).indexOf(characterType));
    }

    public int[] randomRanks(int high) {
        // int randH = (int)(1 + (Math.random()*(6-1)));
        // int randL = (int)(7 + (Math.random()*(10-7)));
        int[] rankTemp = new int[5];
        boolean isValid = true;
        while(isValid) {
            for(int i = 0; i < 5; i++) {
                if(high == i) {
                    rankTemp[i] = (7 + (int)(Math.random() * ((10-7)+1)) );
                } else {
                    rankTemp[i] = (1 + (int)(Math.random() * ((6-1)+1)) );
                }
            }
            isValid = isValidSocre(rankTemp);
            // System.out.println(Arrays.toString(rankTemp));
        }
        return rankTemp;
    }

    public boolean isValidSocre(int[] jacksArray) {
        int sum = 0;
        for(int i : jacksArray) sum += i;
        // System.out.println(sum);
        if(sum <=28 && sum >= 8) return true;
        return false;
    }
    //Getter Methods 

    public String getName(){
        return name;
    }

    public String getCharacterType(){
        return characterType;
    }

    public int[] getRanks(){
        return ranks;
    }

    //Setter Methods

    public void setName(String name){
        this.name = name;
    }

    //Formate Method

    public String toFileFormat(){
        return name + "," + characterType + "," + ranks[0] + "," + ranks[1] + "," + ranks[2] + "," + ranks[3] + "," + ranks[4];
    }

    //Display Method
    public String displayRandCharacter(){
        return "Character Type: " + characterType + " Ranks: " + Arrays.toString(ranks);
    }
    public String toString() {
        return "Name: " + name + "Character Type: " + characterType + " Ranks: " + Arrays.toString(ranks);
    }


}