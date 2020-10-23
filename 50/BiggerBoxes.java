public class BiggerBoxes {
    public static void main ( String[] args )
    {
        Box4 box = new Box4( 2.5, 5.0, 6.0 );
    
        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
        
        Box4 biggerBox = box.biggerBox(box);

        System.out.println( "Area: "  + biggerBox.area() + " volume: " + biggerBox.volume() );

        Box4 smallerBox = box.smallerBox(box);

        System.out.println( "Area: "  + smallerBox.area() + " volume: " + smallerBox.volume() );

    }
}
