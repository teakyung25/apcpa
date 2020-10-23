public class Box4 {
    private double length;
    private double width;
    private double height;

    public Box4 ( double width, double height, double length )
    {
        this.width  = width;
        this.height = height;
        this.length = length;
    }

    public Box4 (Box4 oldBox) {
        // system.out.println(oldBox);
        width = oldBox.getWidth();
        height = oldBox.getHeight();
        length = oldBox.getLength();
    }

    public Box4 ( double side )
    {
        width  = side;
        height = side;
        length = side;
    }

    public Box4 biggerBox ( Box4 oldBox) {
        return new Box4(1.25 * oldBox.getWidth(),1.25 * oldBox.getHeight(),1.25 * oldBox.getLength());
    }

    public Box4 smallerBox ( Box4 oldBox) {
        return new Box4(0.75 * oldBox.getWidth(), 0.75 * oldBox.getHeight(), 0.75 * oldBox.getLength());
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
