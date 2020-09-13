public class StringLength
{
  public static void main ( String[] args )
  {
    String str;
    int    len;

    str = new String( "Elementary, my dear Watson!\t333   ;;;///   \t" );

    len = str.length();

    System.out.println("The length is: " + len );

  }
}