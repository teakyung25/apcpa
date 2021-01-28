public class Point {
    private int x;
    private int y;
    public Point (int x, int y) {
        setPoint(x, y);
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public Point getMidPoint(Point p2) {
        int x3 = (x + p2.getX()) / 2; 
        int y3 = (y + p2.getY()) / 2;
        return new Point(x3,y3);
    }

    public double getDistanceOrigin() {
        return Math.sqrt(Math.pow((x),2) + Math.pow(x, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
