
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Boolean runApp = true;
        Scanner userInput = new Scanner(System.in);
        Todo t1 = new Todo();

        while(runApp){
            t1.display();
            int menuNum = menu(userInput);  
            if(menuNum == 1) {
                t1.createTask();
            } else if(menuNum == 2){
                t1.editTask();
            } else if(menuNum == 3) {
                t1.removeTask();
            } else if(menuNum == 4) {
                t1.clearTasks();
            } else if(menuNum == 5) {
                runApp = false;
            }
        }
    }

    public static int menu(Scanner input) {
        boolean more = true;
        int i = 0;
        while(more) {
            System.out.println("Menu options");
            System.out.println("    1:New Task");
            System.out.println("    2:Edit Task");
            System.out.println("    3:Delete Task");
            System.out.println("    4:Clear All Tasks");
            System.out.println("    5:Exit");
            System.out.print("Enter: ");
            i = input.nextInt();
            input.nextLine();
            if(i <= 5 && i > 0) {
                more = false;
            } else {
                System.out.println("Please Enter a number between 1-5.\n");
            }
            
        }
        return i;
    }

}