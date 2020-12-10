import java.io.*;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        File out1 = new File("emails.txt");
        File in1 = new File("random.txt");
        PrintWriter output = new PrintWriter(out1);

        Scanner inputFile = new Scanner(in1);

        while(inputFile.hasNext()){
            String maybe = inputFile.next();
            if(maybe.indexOf("@") != -1 && maybe.indexOf(".") != -1) output.println(maybe);
        }

        input.close();
        inputFile.close();
        output.close();
    }
}
