public class SumFun {
    public static void main(String[] args) {    
        int[] data = {1,2,3,4,5};
        int[] data2 = {1,2,3,4,32};

        System.out.println(sum(data, 0));
        System.out.println(sum(data2, 0));

    }
    public static int sum(int[] array, int index) {
        if(index == array.length) return 0;
        return array[index] + sum(array, index+1);
    }
}