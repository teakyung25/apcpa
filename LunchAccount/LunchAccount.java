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
        this.balance = balance;
        studentCount += 1;
        if(studentCount <= 100 && balance > 0) this.balance += 20;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }

    public void buyLunch(double cost){
        if(balance > cost) {
            balance -= cost;
            totalSpent += cost;
            lunchesBought++;
            System.out.println("Purchase successful!");
        } else {
            System.out.println("Purchase not successful! Add more money to your account.");
        }
    }

    public String toString(){
        return "\nID: " + id  + "\nBalance: " + balance + "\nTotal Spent:" + totalSpent + "\nTotal Meals: " + lunchesBought;
    }

}