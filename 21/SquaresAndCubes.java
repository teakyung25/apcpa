import java.util.Scanner;

public class SquaresAndCubes {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Upper Limit: ");
        int limit = input.nextInt();
        double squares = 0;
        double cubes = 0;
        for(int i = 0; i < limit; i++){
            squares += Math.pow((i+1),2);
            cubes += Math.pow((i+1),3);
        }

        System.out.println("The sum of Squares is (explicit): " + squares);
        System.out.println("The sum of Cubes is (explicit): " + cubes);

        squares = (limit * (limit+1) * (2*limit+1)) / 6.0;
        cubes = (Math.pow(limit,2) * Math.pow((limit+1),2)) / 4.0;

        System.out.println("The sum of Squares is (formulas): " + squares);
        System.out.println("The sum of Cubes is (formulas): " + cubes);
    }
}
