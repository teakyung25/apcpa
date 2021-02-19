public class Frequency {
    public static void main(String[] args){
        System.out.println(countChar("YXXXXXXYXYYYY", "X", 0));
        System.out.println(countChar("YXXXXXXYXYYYY", "Y", 0));
        System.out.println(countChar("YXXXXXXYXYYYY", "x", 0));

    }

    public static int countChar(String s, String l, int count) {
        if(s.length() == 0) return count;
        if(s.substring(0,1).equals(l)) count++;
        return countChar(s.substring(1), l, count);
    }
}