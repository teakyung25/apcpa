import java.util.*;
import java.io.*;

public class Next {
    public static void main(String[] args) throws IOException {
        File f1 = new File("test.txt");
        Scanner input = new Scanner(f1);
        ArrayList<Integer> sums = new ArrayList<Integer>();
        
        int sum = 0;
        // boolean hi = input.hasNext();
        while(input.hasNext()){
            String current = input.next();
            if(current.equals("next")){
                sums.add(sum);
                sum = 0;
                // System.out.println(sum);
                continue;
            } else if (!input.hasNext()) {
                sum += Integer.parseInt(current);
                sums.add(sum);
                sum = 0;
            }
            sum += Integer.parseInt(current);
        }
        input.close();


        for(int i = 1; i < sums.size(); i++) {
            if(sums.get(i) == 0) {
                System.out.println("Group " + i + " contains do data");
            } else {
                System.out.println("Sum of group " + i + " is " + sums.get(i));
            }
        }
    }
}
