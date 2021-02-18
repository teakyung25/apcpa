public class PowN {
    public static void main(String[] args) {
        System.out.println(powFunc(5));
    }

    public static int powFunc(int n ) {
        if(n == 0 ) return 1;
        return 2*powFunc(n-1);
    }
}
