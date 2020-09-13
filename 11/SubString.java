public class SubString {
    public static void main ( String[] args )
    {
      String str = new String( "Golf is a good walk spoiled." ); // create the original object
  
      String sub = str.substring(8); //create a new object from the original
  
      System.out.println( sub );

      sub = str.substring(0,0); //create a new object from the original
  
      System.out.println( sub );

      sub = str.substring(0,28); //create a new object from the original
  
      System.out.println( sub );

      sub = str.substring(0,str.length()); //create a new object from the original
  
      System.out.println( sub );

    //   sub = str.substring(0,29); //create a new object from the original
  
    //   System.out.println( sub );

    //   sub = str.substring(-1, 28); //create a new object from the original
  
    //   System.out.println( sub );

    //   sub = str.substring(28,0); //create a new object from the original
  
    //   System.out.println( sub );

    //   sub = str.substring(-1); //create a new object from the original
  
    //   System.out.println( sub );
  
    }
}
