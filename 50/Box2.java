public class Box2 {
    private double length;
    private double width;
    private double height;

    public Box2 ( double width, double height, double length )
    {
        this.width  = width;
        this.height = height;
        this.length = length;
    }

    public Box2 ( double side )
    {
        width  = side;
        height = side;
        length = side;
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
