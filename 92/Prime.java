public class Prime {
    public static void main(String[] args) {
        int n = 9;
        int b = 7;
        System.out.println(prime(n,n-1));
        System.out.println(prime(b,b-1));

    }


    public static Boolean prime(int n,int x) {
        if(n <= 1) return false;
        if(x == 1) return true;
        if(n % x == 0) return false;
        return prime(n,x-1);
    }
}