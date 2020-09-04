public class Trigonometry {
    public static void main (String [] args){
        Double sinx = Math.sin(0.5236);
        Double cosx = Math.cos(0.5236);   
        Double sumSquare = Math.pow(sinx, 2) + Math.pow(cosx, 2);
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sumSquare );
    }
}