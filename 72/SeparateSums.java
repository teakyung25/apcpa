import java.util.Scanner;
import java.io.*;

public class SeparateSums {
    public static void main(String[] args) throws IOException
    { 
      File file = new File("xy.txt");   // create a File object
      Scanner scan = new Scanner(file);      // connect a Scanner to the file
      int xSum = 0;
      int ySum = 0;
      while( scan.hasNext() )   // is there more data to process? 
      {
        String xy = scan.next();
        int num = scan.nextInt(); 
        if(xy.equals("x=")){
            xSum += num;
        } else {
            ySum += num;
        }
      }
      scan.close();
      System.out.println("X: " + xSum + " Y: " + ySum);
    }    
}
