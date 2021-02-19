public class MaxElement {
    public static void main(String[] args) {    
        int[] data = {31,23,3,4,5};
        int[] data2 = {2221,233,3,43333,32};

        System.out.println(maxE(data,0));
        System.out.println(maxE(data2,0));

    }
    public static int maxE(int[] array, int i) {
        if(i == array.length-1) return array[i-1];
        return array[i] > maxE(array, i+1) ? array[i] : maxE(array, i+1);
    }
}
