import java.util.*;

public class Quadradic {
    public static void main (String [] args){
        System.out.println(quadradicS(2.0));
        System.out.println(quadradicS(2.0/3.0));
        System.out.println(quadradicS(5.0));
    }
    public static Double quadradicS (Double x) {
        return (3 * Math.pow(x,2)) - (8 * x) + 4;
    }
}