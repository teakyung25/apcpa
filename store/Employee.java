public class Employee {
    private String name;
    private String position;
    private double wage;
    private int id;
    private int hoursWorkedPayPeriod;
    private int hoursWorkedSinceHired;
    private static int id_prev = 0; 

    public Employee (String name, String position, double wage, int hoursWorkedPayPeriod) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.hoursWorkedPayPeriod = hoursWorkedPayPeriod;
        this.hoursWorkedSinceHired = hoursWorkedPayPeriod;
        this.id = idIncrement();
    }

    //Static method for incrementing 
    private static int idIncrement(){
        id_prev += 1;
        return id_prev;
    }

    //Methods//

    //request paycheck 
    public Paycheck requestPaycheck() {
        double payAmount = (wage * hoursWorkedPayPeriod) * 0.85; 
        Paycheck pc = new Paycheck(this,payAmount,hoursWorkedPayPeriod,wage);
        hoursWorkedPayPeriod = 0;
        return pc;
    }

    //Setters

    public void setPayPeriodHours(int hours){
        hoursWorkedPayPeriod += hours;
        hoursWorkedSinceHired += hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    //Geters 

    public int getPayPeriodHoursWorked() {
        return hoursWorkedPayPeriod;
    }

    public int getTotalHoursWorked() {
        return hoursWorkedSinceHired;
    }
    
    public int getId(){
        return id;
    }

    //Print object
    public String getName() {
        return name;
    }
}