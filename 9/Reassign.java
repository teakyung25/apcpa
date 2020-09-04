public class Reassign {
    public static void main (String [] args){
        Double x = 0.0;
        Double value;
        value = quadradicS(x);
        x = 2.0;
        value = quadradicS(x);
        x = 4.0;
        value = quadradicS(x);
    }
    public static Double quadradicS (Double x) {
        return (3 * Math.pow(x,2)) - (8 * x) + 4;
    }
}