public class Odious {
 public static void main (String [] args){
    System.out.println(isOdious(11));
    System.out.println(isOdious(1));
 }   

 public static boolean isOdious (long num) {
    long dnum = num;
    int count = 0;
    String result = "";
    while(dnum != 0){
        long val = dnum % 2;
        dnum = dnum / 2;
        result += Long.toString(val);
        if(val == 1) count ++;
    }
    if(count % 2 != 0) return true;
    return false;
 }
}
