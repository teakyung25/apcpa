public class SheepHerd {
    public static void main (String [] args){
        double power = 1;
        for(int i = 0; i <= 25; i++){
            System.out.println("Year: " + i);
            power *= i > 0 ? 0.83 : 1;
            double n = 220 / (1 + (10*power));

            System.out.println("Population: " + n);
        }
    } 
}