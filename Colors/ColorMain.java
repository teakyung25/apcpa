import java.util.*;

public class ColorMain {
    public static void main (String [] args) {
        Color c1 = new Color(100,100,100);
        System.out.println("C1: ");
        // System.out.println(Arrays.toString(c1.getSummary()));
        c1.randomColor();
        System.out.println(Arrays.toString(c1.getSummary()));
        c1.lightenColor(10);
        System.out.println(Arrays.toString(c1.getSummary()));
        c1.darkenColor(10);
        System.out.println(Arrays.toString(c1.getSummary()));

        System.out.println("C2: ");

        Color c2 = new Color("#fefefe");
        System.out.println(Arrays.toString(c2.getSummary()));
        c2.darkenColor(5);
        System.out.println(Arrays.toString(c2.getSummary()));
        c2.lightenColor(5);
        System.out.println(Arrays.toString(c2.getSummary()));

    }
}