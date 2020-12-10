import java.util.Scanner;
import java.io.*;

public class NumberFilter {
  public static void main (String[] args) throws IOException
  { 
    File    file = new File("ex3num.txt");   // create a File object
    Scanner scan = new Scanner( file );      // connect a Scanner to the file

    PrintWriter neg = new PrintWriter("neg.md");
    PrintWriter pos = new PrintWriter("pos.md");

    while( scan.hasNextInt() )   // is there more data to process? 
    {
      int num = scan.nextInt(); 
      if(num < 0){
        neg.println(num);
      } else {
        pos.println(num);
      }
    }
    scan.close();
    neg.close();
    pos.close();
  }
}
