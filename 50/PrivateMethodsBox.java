public class PrivateMethodsBox {
    public static void main ( String[] args )
    {
       Box2 box = new  Box2( 2.5, 5.0, 6.0 ) ;
  
       System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
    //    System.out.println( "topArea: "  + box.topArea() );
  
    }
}
