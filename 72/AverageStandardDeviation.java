import java.util.Scanner;
import java.io.*;

public class AverageStandardDeviation {
    public static void main (String[] args) throws IOException
    { 
      File    file = new File("ex2num.txt");   // create a File object
      Scanner scan = new Scanner( file );      // connect a Scanner to the file
      double sum = 0;    
      double sumSquare = 0;  
      int n = 0;
  
      while( scan.hasNextDouble() )   // is there more data to process? 
      {
        double num = scan.nextDouble();
        sum += num;   
        sumSquare += num*num;
        n++;
      }
      scan.close();

      double avg = sum/n;
      double avgSQ = sumSquare/n;
      double var = avgSQ - (avg*avg);
      double sd = Math.pow(var,0.5);
      System.out.println("SD: " + sd + " Avg: " + avg);
  
    }
}
