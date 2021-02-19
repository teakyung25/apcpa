public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(6,9));
        System.out.println(gcd(2,8));

    }

    public static int gcd(int n, int x) {
        if(n == 0) return x;
        return gcd(x%n, n);
    }
}
