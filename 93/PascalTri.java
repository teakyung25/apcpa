import java.util.Scanner;

public class PascalTri {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("how many rows?");
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            for(int b = 0; b < i+1; b++){
                System.out.print(tri(i,b));
            }
            System.out.println("\n");
        }        
    }

    public static int tri(int row, int col) {
        if(col == 0 || row == 0) return 1;
        if(row == col) {
            return 1;
        } 
        return tri(row-1,col-1) + tri(row-1,col);
        
        // return tri(row, col);
    }

  

 }