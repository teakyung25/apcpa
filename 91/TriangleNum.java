public class TriangleNum {
    public static void main(String[] args) {
        System.out.println(Triangle(4));
    }
    public static int Triangle( int N )
    {
      if ( N == 1 || N == 0 )
        return N;
      else
        return N + Triangle( N-1 );
    }
}
