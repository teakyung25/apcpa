import java.util.*;
import java.io.*;

public class MultipleFile {
    public static void main(String [] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> averages = new ArrayList<Double>();
        boolean isMore = true;
        while(isMore) {
            System.out.print("Filename(extension): ");
            String filename = input.next();
            if(!filename.equals("exit")){
                File n1 = new File(filename);
                Scanner fileR = new Scanner(n1);
                double average = 0;
                int count = 0;
                while(fileR.hasNextInt()){
                    int i = fileR.nextInt();
                    average += i;
                    count++;
                }
                average /= count;
                averages.add(average);
                System.out.println(average);
                fileR.close();
            } else {
                isMore = false;
            }  
        }
        System.out.print(averages);
    }
}