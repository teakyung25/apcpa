public class NewString {
    public static void main (String [] args){
        String first = new String("    Hello   World     d");
        String second;
        second = first.trim();
        System.out.println(first);
        System.out.println(second);
    }
}
