import java.util.Scanner;
import java.io.*;

public class ManySuares
{
  public static void main (String[] args) throws IOException
  { 
    File    file = new File("num.txt");   // create a File object
    Scanner scan = new Scanner( file );      // connect a Scanner to the file
    int num = 0;      

    while( scan.hasNextInt() )   // is there more data to process? 
    {
      num += scan.nextInt();   
    }
    scan.close();
    System.out.println("Sum is: " + num);

  }
}