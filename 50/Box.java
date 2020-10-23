public class Box {
    private double length;
    private double width;
    private double height;

    public Box ( double width, double height, double length )
    {
        this.width  = width;
        this.height = height;
        this.length = length;
    }

    public Box ( double side )
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
        return 2 * ( width * height + width * length + length * height); 
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
