public class NestBox {
    public static void main ( String[] args )
    {
        Box5 box = new Box5( 2.5, 5.0, 6.0 );
    
        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
        
        Box5 biggerBox = box.biggerBox(box);

        System.out.println( "Area: "  + biggerBox.area() + " volume: " + biggerBox.volume() );

        Box5 smallerBox = box.smallerBox(box);

        System.out.println( "Area: "  + smallerBox.area() + " volume: " + smallerBox.volume() );

        System.out.println(biggerBox.nests(smallerBox));
        System.out.println(smallerBox.nests(biggerBox));

    }
}
