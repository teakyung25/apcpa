public class Radians {
    public static void main (String [] args){
        Double rad = 30 * Math.PI/180;
        Double sinx = Math.sin(rad);
        Double cosx = Math.cos(rad);   
        Double sumSquare = Math.pow(sinx, 2) + Math.pow(cosx, 2);
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sumSquare );
    }
}