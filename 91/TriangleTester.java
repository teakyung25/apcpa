import java.util.Scanner;

public class TriangleTester
{
  public static void main ( String[] args)
  {
    Scanner input = new Scanner(System.in);
    TriangleCalc tri = new TriangleCalc();
    System.out.println("Triangle #: ");
    int num = input.nextInt();
    if(num < 0) {
        System.out.println("Triangle Positive #: ");
        num = input.nextInt();
    }
    input.close();
    int result = tri.Triangle( num );
    System.out.println("Triangle(4) is " + result );
  }

  
}

class TriangleCalc
{
  public int Triangle( int N )
  {
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
}
