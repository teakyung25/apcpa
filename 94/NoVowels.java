public interface NoVowels {
    public static void main(String[] args){
        System.out.println(removeVowels("hello"));
        System.out.println(removeVowels("bruther"));

    }

    public static String removeVowels(String s) {
        if(s.length() == 0) return s; 
        if(s.substring(0,1).toLowerCase().matches("[aeiou]")) {
            return removeVowels(s.substring(1));
        } 
        return s.substring(0,1)+ removeVowels(s.substring(1));
    }
}
