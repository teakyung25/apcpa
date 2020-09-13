import java.util.Scanner;

public class SubStringFun {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String ogString = input.nextLine();
        System.out.print("Enter Beginning index: ");
        int a = input.nextInt(); 
        System.out.print("Enter ending index: ");
        int b = input.nextInt();

        System.out.println("OG String: ");
        System.out.println(ogString);

        System.out.println("Substring: ");
        System.out.println(ogString.substring(a,b));
    }    
}
