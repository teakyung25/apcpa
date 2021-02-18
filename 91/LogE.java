public class LogE {
    public static void main(String[] args) {
        System.out.println(logD(1));
    }
    
    public static int logD(int n) {
        if(n == 1 ) return 0;
        return  (1 +  logD(n/2));
    }

}