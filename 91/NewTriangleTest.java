import java.util.Scanner;

public class NewTriangleTest {
    public static void main ( String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Triangle #: ");
      int num = input.nextInt();
      if(num < 0) {
          System.out.println("Triangle Positive #: ");
          num = input.nextInt();
      }
      input.close();
      int result = Triangle( num );
      System.out.println("Triangle(4) is " + result );
    }

    public static int Triangle( int N )
    {
      if ( N == 1 )
        return 1;
      else
        return N + Triangle( N-1 );
    }
}
