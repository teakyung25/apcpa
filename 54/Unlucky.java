public class Unlucky {
    public static void main (String [] args){
        System.out.println(isUnlucky(1307));
        System.out.println(isUnlucky(13));
        System.out.println(isUnlucky(513));
        System.out.println(isUnlucky(813015));
        System.out.println(isUnlucky(103));
        System.out.println(isUnlucky(31));
        System.out.println(isUnlucky(41237));
     }   
    
     public static boolean isUnlucky (long num) {
        long dnum = num;
        long prev = 0;
        String result = "";
        while(dnum != 0){
            long val = dnum % 10;
            prev = (dnum/10) % 10;
            dnum = dnum / 10;
            if(val == 3 && prev == 1) return true;
        }
        return false;
     }
}
