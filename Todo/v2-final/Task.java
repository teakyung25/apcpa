import java.io.Serializable;

public class Task implements Serializable{
    private String description;
    private String date;
    private boolean isCompleted;
    private int priority;
    private int currentID;
    private static int idCount = 0;

    public Task (String description, String date, int priority){
        setDescription(description);
        setDate(date);        
        setPriority(priority);
        isCompleted = false;
    }

    public Task(){
    }

    public void setDescription(String description){
        this.description = description;
    }
    
    public void setDate(String date){
        this.date = date;
    }

    public void setCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public void resetCount(){
        idCount = 0;
    }
    
    // public String getDescription(){
    // }
    
    // public void setDate(String date){
    //     this.date = date;
    // }

    // public void setCompleted(boolean isCompleted){
    //     this.isCompleted = isCompleted;
    // }

    // public void setPriority(int priority){
    //     this.priority = priority;
    // }

    public String csvFormat() {
        return isCompleted + "," + description + "," + date + "," + priority;
    }

    //display task
    public String toString(){
        currentID = ++idCount;
        return  " [" + currentID + "]" + "Completed: " + isCompleted + " | Description: " + description + " | Due: " + date + " | priority(1-5): " + priority;
    }
}