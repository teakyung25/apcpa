import javax.swing.Box;

public class Box5 {
    private double length;
    private double width;
    private double height;

    public Box5 ( double width, double height, double length )
    {
        this.width  = width;
        this.height = height;
        this.length = length;
    }

    public Box5 (Box5 oldBox) {
        // system.out.println(oldBox);
        width = oldBox.getWidth();
        height = oldBox.getHeight();
        length = oldBox.getLength();
    }

    public Box5 ( double side )
    {
        width  = side;
        height = side;
        length = side;
    }

    public Box5 biggerBox ( Box5 oldBox) {
        return new Box5(1.25 * oldBox.getWidth(),1.25 * oldBox.getHeight(),1.25 * oldBox.getLength());
    }

    public Box5 smallerBox ( Box5 oldBox) {
        return new Box5(0.75 * oldBox.getWidth(), 0.75 * oldBox.getHeight(), 0.75 * oldBox.getLength());
    }

    public boolean nests (Box5 outsideBox) {
        if(outsideBox.getHeight() < height && outsideBox.getWidth() < width && outsideBox.getLength() < length) {
            return true;
        }
        return false;
    }


    public double volume()
    {
        return width * height * length;
    }

    public double area()
    {
        return (2 * faceArea() + 2 * topArea() + 2 * sideArea()); 
    }

    private double faceArea () {
        return width * height;
    }

    private double topArea () {
        return width * length;
    }

    private double sideArea () {
        return height * length;
    }


    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
