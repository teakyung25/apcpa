public class LeastPositive {
    public static void main(String[] args) {
        System.out.println(lpr(30,10));
        System.out.println(lpr(45,14));
        System.out.println(lpr(-25,10));

    }

    public static int lpr(int a, int m) {
        if(a >= 0 && a <= (m-1)) return a;
        if(a < 0) a+=m;
        if(a >= m) a-= m;
        return lpr(a,m);
    }
}
