import java.io.*;
import java.util.*;

public class Todo  {
    //Task list
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private Task resetTaskCount = new Task();
    //Input scanner for user input
    private Scanner uInput = new Scanner(System.in);
    private File TaskF = new File("data.dat");

    //Constructor with no arguments 
    public Todo () {
        try{
            TaskF.createNewFile();
            ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(TaskF)));
            input.readObject();
            // output.close();
        } catch (IOException e) {
            updateFile(tasks);
        } catch (ClassNotFoundException e) {

        }
    }
    //method that creates a Task object array


    private Task taskPrompt(){
        // System.out.println("New Todolist Item: ");
        System.out.print("Description: ");
        String dis = uInput.nextLine();
        System.out.print("Date: ");
        String date = uInput.nextLine();
        System.out.print("Priority: ");
        int priority = uInput.nextInt();
        uInput.nextLine();
        return new Task(dis,date,priority);
    }

    //Saves the Task objects to the file created by the users
    public void createTask() {
        ArrayList newtasks = getArrayList();
        Task tN = taskPrompt();
        newtasks.add(tN);
        // resetTaskCount.resetCount();
        // System.out.println(newtasks);
        updateFile(newtasks);
    }

    public void editTask(){
        try{
            ArrayList newTasks = getArrayList();
            System.out.print("# of task to edit: ");
            int taskNum = uInput.nextInt()-1;
            uInput.nextLine();
            Boolean runEdit = true;
            Task selectTask = (Task) newTasks.get(taskNum);
    
            while(runEdit){
                int menuNum = editMenu();  
                resetTaskCount.resetCount();
                System.out.println(selectTask);
                if(menuNum == 1) {
                    boolean isDone = Boolean.parseBoolean(userInput("Completion Status: "));
                    selectTask.setCompleted(isDone);
                } else if(menuNum == 2){
                    selectTask.setDescription(userInput("Description: "));
                } else if(menuNum == 3) {
                    selectTask.setDate(userInput("Due Date: "));
                } else if(menuNum == 4) {
                    int priority = Integer.parseInt(userInput("Priority: "));
                    selectTask.setPriority(priority);
                } else if(menuNum == 5) {
                    runEdit = false;
                }
            }
            newTasks.set(taskNum,selectTask);
            updateFile(newTasks);
        } catch(Exception e) {
            System.out.println("You don't have any tasks to edit or have entered the wrong value.");
        }

    }

    public void removeTask(){
        try{
            ArrayList newTasks = getArrayList();
            System.out.print("# of task to delete: ");
            int num = uInput.nextInt()-1;
            uInput.nextLine();
            newTasks.remove(num);
            updateFile(newTasks);
        } catch(Exception e) {
            System.out.println("You don't have any tasks to delete or have entered the wrong value.");
        }
    }

    public void clearTasks(){
        updateFile(tasks);
        System.out.println("Todo List Clear.");
    }


    private int editMenu(){
        boolean more = true;
        int i = 0;
        while(more) {
            System.out.println("Menu options");
            System.out.println("    1:Completion Status");
            System.out.println("    2:Description");
            System.out.println("    3:Due Date");
            System.out.println("    4:Priority");
            System.out.println("    5:Exit");
            System.out.print("Enter: ");
            i = uInput.nextInt();
            uInput.nextLine();
            if(i <= 5 && i > 0) {
                more = false;
            } else {
                System.out.println("Please Enter a number between 1-5.\n");
            }
        }
        return i;
    }

    private String userInput(String prompt){
        System.out.print(prompt);
        return uInput.nextLine();
    }

    private void updateFile(ArrayList newtasks) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(TaskF)));
            output.writeObject(newtasks);
            output.close();
        } catch (IOException e) {}
    }

    private ArrayList getArrayList(){
        ArrayList tasksList = new ArrayList<>();
        try{
            ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(TaskF)));
            //Writes object in the array of Task Objects 
            // output.writeObject();
            //Closes the ObjectOutputStream
            // Object obj = input.readObject();
            tasksList = (ArrayList) input.readObject();
            // System.out.println(tasksList);
            input.close();
        } catch (IOException e) {
            //Error thrown if there is an IOException 
            System.out.println("Error writing task arraylist: " + e);
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found: " + c);
        }
        return tasksList;
    }

    public void display(){
        resetTaskCount.resetCount();
        ArrayList newTasks = getArrayList();
        for(Object task : newTasks){
            Task tN = (Task) task;
            System.out.println(tN);
        }
    }


}