public class LunchAccount {
    private int id;
    private double balance;
    private int lunchesBought;
    private double totalSpent;
    private static int studentCount = 0; 
    private static int idPrev = 999;

    //chekc balance
    //add money 
    //choose item/buy

    public LunchAccount(double balance) {
        this.id = ++idPrev;
        studentCount++;
        addBalance(balance);
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
        if(studentCount <= 100 && balance > 0) this.balance += 20;
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