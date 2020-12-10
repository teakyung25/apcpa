import java.util.Scanner;
import java.io.*;


public class StopWord {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        System.out.print("Output Name: ");
        String out = input.nextLine();
        System.out.print("Input Name: ");
        String in = input.nextLine();

        File out1 = new File(out);
        File in1 = new File(in);
        PrintWriter output = new PrintWriter(out1);
        int n = 0;

        Scanner inputFile = new Scanner(in1);
        
        while(inputFile.hasNext()) {
            String letter = inputFile.next();
            if(test(letter)){
                if(n+1 <=  50) {
                    output.print(letter + " ");
                } else {
                    output.println( "\n" + letter + " ");
                    n = 0;
                }
            }
            n++;
        }
        inputFile.close();
        output.close();

    }

    public static boolean test(String word) {
        boolean isGood = true;
        String[] lameWords = {"the","a","an","bad","good"};

        for(String letter : lameWords) {
            if(word.toLowerCase().equals(letter)){
                isGood = false;
            } 
        }
        return isGood;
    }
}
