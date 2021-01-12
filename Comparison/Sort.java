import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int[] bru = {10,2,12,3,4};
        int[] bru1 = {10,2,12};

        System.out.println(Arrays.toString(selection(bru)));
        System.out.println(Arrays.toString(insertion(bru1)));
        System.out.println(Arrays.toString(bubble(bru)));
    }

    public static int[] selection(int[] data){
        for(int i = 0; i < data.length-1; i++){
            int minI = i;
            for(int p = i+1; p < data.length; p++){
                if(data[p] < data[minI]) minI = p;
            }
            int bruh = data[minI];
            data[minI] = data[i];
            data[i] = bruh;
        }
        return data;
    }

    public static int[] insertion(int[] data){
        for(int i = 1; i < data.length; i++) {
            int peep = data[i];
            int j = i-1;
            while(j >= 0 && peep < data[j]){
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = peep;
        } 

        return data;
    }

    public static int[] bubble(int[] data) {
        for(int d: data){
            for(int i = 0; i < data.length-1; i++){
                if(data[i] > data[i+1]) {
                    int bruh = data[i];
                    data[i] = data[i+1];
                    data[i+1] = bruh;
                } 
            }
        }
        return data;
    }
}