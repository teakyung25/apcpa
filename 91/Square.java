public class Square {
    public static void main(String[] args ){
        System.out.println(SquareD(9));
    }

    public static int SquareD( int N )
    {
      if ( N == 1 )
        return 1;
      else
        return SquareD( N-1 ) + 2*N - 1;
    }
}
