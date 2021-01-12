import java.util.Random;
public class Sort {
    public static Random rand = new Random();
    public static final int NUM_TESTS = 10000;
    public static final int TEST_DATA_SIZE = 10;
    public static final int RANDOM_RANGE = 100;

    public static void main(String[] args){
        System.out.println("SELECTION________________");
        testSort("selection", NUM_TESTS);
        System.out.println("INSERTION________________");
        testSort("insertion", NUM_TESTS);
        System.out.println("BUBBLE________________");
        testSort("bubble", NUM_TESTS);
        // int[] bru = {10,2,12,3,4};
        // int[] bru1 = {10,2,12};

        // System.out.println(Arrays.toString(selection(bru)));
        // System.out.println(Arrays.toString(insertion(bru1)));
        // System.out.println(Arrays.toString(bubble(bru)));
    }

    public static void testSort(String method, int times){
        for(int test = 0; test < times; test++) {
            int[] data = createTestData(TEST_DATA_SIZE);
            int[] orig = duplicate(data);

            sortUsing(data,method);
            print(data);
            if(!isSortedAsc(data)) {
                printSortErrorMassage(method,data,orig);
                return;
            }
        }
    }
    public static void sortUsing(int[] data, String method) {
        if(method.toLowerCase().equals("selection")){
            selection(data);
        } else if(method.toLowerCase().equals("insertion")){
            insertion(data);
        } else {
            bubble(data);
        }
    }

    public static void printSortErrorMassage(String method, int[] data, int[] orig) {
        System.out.println("Error, during " + method);
        System.out.println("Original data:");
        print(orig);
        System.out.println("AFfter sorting: ");
        print(data);
        System.out.println();
    }

    public static int[] createTestData(int amount) {
        int[] data = new int[amount];
        for(int i = 0; i < data.length; i++){
            data[i] = rand.nextInt(RANDOM_RANGE);
        }
        return data;
    } 

    public static int[] duplicate(int[] data) {
        int[] dup = new int[data.length];
        for(int i = 0; i < data.length; i++) {
            dup[i] = data[i];
        }
        return dup;
    }

    public static void print(int[] data) {
        System.out.print("[");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if(i < data.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static boolean isSortedAsc(int[] data) {
        for(int i = 0; i < data.length -1; i++) {
            if( data[i+1] < data[i]){
                return false;
            }
        }
        return true;
    }

    public static void selection(int[] data){
        for(int i = 0; i < data.length-1; i++){
            int minI = i;
            for(int p = i+1; p < data.length; p++){
                if(data[p] < data[minI]) minI = p;
            }
            int bruh = data[minI];
            data[minI] = data[i];
            data[i] = bruh;
        }
        // return data;
    }

    public static void insertion(int[] data){
        for(int i = 1; i < data.length; i++) {
            int peep = data[i];
            int j = i-1;
            while(j >= 0 && peep < data[j]){
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = peep;
        } 

        // return data;
    }

    public static void bubble(int[] data) {
        for(int d: data){
            for(int i = 0; i < data.length-1; i++){
                if(data[i] > data[i+1]) {
                    int bruh = data[i];
                    data[i] = data[i+1];
                    data[i+1] = bruh;
                } 
            }
        }
        // return data;
    }
}