public class Palindrome {
    public static void main(String[] args){
        System.out.println(palindrome("tacocat"));
        System.out.println(palindrome("bruh"));
        System.out.println(palindrome("xyx"));

    }

    public static boolean palindrome(String s ){
        
        if(s.length() <= 1) return true;
        if(s.substring(0,1).equals(s.substring(s.length()-1, s.length()))) {
            return palindrome(s.substring(1,s.length()-1));
        }
        return false;
    }

}
