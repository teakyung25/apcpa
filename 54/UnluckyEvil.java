public class UnluckyEvil {
    public static void main(String [] args){
        for(int i = 0; i < 1000; i++){
            if(isUnlucky(i) && isOdious(i)){
                System.out.println("Evil and Unlucky number!: " + i);
            }
        }
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
