import java.util.*;

public class ColorMain {
    public static void main (String [] args) {
        Color c1 = new Color(100,100,100);

        System.out.println(Arrays.toString(c1.getSummary()));
        c1.randomColor();
        System.out.println(Arrays.toString(c1.getSummary()));
        Color c2 = new Color("#fefefe");
        System.out.println(Arrays.toString(c2.getSummary()));

    }
}