import java.util.Scanner;
import java.io.*;

public class TodoList {
    Scanner input = new Scanner(System.in);
    File todos = new File("todo.csv");
    File temp = new File("temp.csv"); 
    PrintWriter output;
    PrintWriter tempOutput;
    Scanner fileInput;

    public TodoList (){
        try{
            // output = new PrintWriter(new FileOutputStream(todos,true));
            // tempOutput = new PrintWriter(temp);
            fileInput = new Scanner(todos);
        } catch (IOException e) {}
    }

    public void createTask () {
        try {
            output = new PrintWriter(new FileOutputStream(todos,true));
            // System.out.println(taskPrompt().csvFormat());
            output.println(taskPrompt().csvFormat());
            output.close();
        } catch (IOException e) {}

    }

    private Task taskPrompt(){
        // System.out.println("New Todolist Item: ");
        System.out.print("Description: ");
        String dis = input.nextLine();
        System.out.print("Date: ");
        String date = input.nextLine();
        System.out.print("Priority: ");
        int priority = input.nextInt();
        input.nextLine();
        return new Task(dis,date,priority);
    }


    public void editTask () {
        try {
            Scanner file = new Scanner(todos);
            output = new PrintWriter(new FileOutputStream(todos,true));
            tempOutput = new PrintWriter(temp);
            System.out.print("Task # to edit: ");
            int num = input.nextInt();
            input.nextLine();
            Task newTask = taskPrompt();
            int count = 0;
            while (file.hasNextLine()){
                ++count;
                // System.out.println(file.nextLine());
                System.out.println(count);
                if(count == num) {
                    System.out.println("this one is the one:::::");
                    output.println(newTask.csvFormat());
                    continue;
                }
                // save.push(file.nextLine());
                output.println(file.nextLine());
            }
            file.close();
            tempOutput.close();


            output.close();
        } catch (IOException e) {System.out.print(e);}
    }
 
    public void updateFile () {

    }

    public void display() {
        while(fileInput.hasNextLine()){
            // System.out.println(fileInput.nextLine());
            System.out.println(taskObj(fileInput.nextLine().split(",")));
        }
    }

    public Task taskObj(String[] data){
        return new Task(data[1],data[2],Integer.parseInt(data[3]));
    }

}
