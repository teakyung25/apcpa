public class BoxConstructorAccess {
    public static void main ( String[] args )
    {
        Box3 box = new Box3( 2.5, 5.0, 6.0 );
    
        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
        
        Box3 sameBox = new Box3(box);

        System.out.println( "Area: "  + sameBox.area() + " volume: " + sameBox.volume() );

    }
}
