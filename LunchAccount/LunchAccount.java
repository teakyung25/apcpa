public class LunchAccount {
    private int id;
    private double balance;
    private int lunchesBought;
    private double totalSpent;
    private boolean isFirstAdd = false;
    private static int studentCount = 0; 
    private static int idPrev = 999;

    //chekc balance
    //add money 
    //choose item/buy

    public LunchAccount(double balance) {
        lunchesBought = 0;
        totalSpent = 0;
        this.balance = 0;
        id = ++idPrev;
        addBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        if(balance > 0){
            if(!isFirstAdd){
                studentCount++;
                this.isFirstAdd = true;
                if(studentCount <= 100)  this.balance += 20;
            }
            this.balance += balance;
        }
    }

    public boolean buyLunch(double cost){
        if(balance > cost) {
            balance -= cost;
            totalSpent += cost;
            lunchesBought++;
            return true;
        } 
        return false;    
    }

    public String toString(){
        return "ID: " + id  + "\nBalance: " + balance + "\nTotal Spent:" + totalSpent + "\nTotal Meals: " + lunchesBought;
    }

}