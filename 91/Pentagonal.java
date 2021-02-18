public class Pentagonal {
    public static void main(String[] args) {
        System.out.println(countPent(4));
    }

    public static int countPent(int n) { 
        if(n == 1) return 1;
        return countPent(n-1) + (n*2) + (n-2);
    }
}
