public class Employee {
    private String name;
    private String position;
    private double wage;
    private int id;
    private int hoursWorkedPayPeriod;
    private int hoursWorkedSinceHired;
    private static int id_prev = 1; 

    public Employee (String name, String position, double wage, int hoursWorkedPayPeriod) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.hoursWorkedPayPeriod = hoursWorkedPayPeriod;
        this.id = idIncrement();
    }

    private static int idIncrement(){
        id_prev += 1;
        return id_prev;
    }


    public Paycheck requestPaycheck() {
        double payAmount = (wage * hoursWorkedPayPeriod) * 0.85; 
        Paycheck pc = new Paycheck(this,payAmount,hoursWorkedPayPeriod,wage);
        hoursWorkedSinceHired += hoursWorkedPayPeriod;
        hoursWorkedPayPeriod = 0;
        return pc;
    }

    public void setPayPeriodHours(int hours){
        hoursWorkedPayPeriod += hours;
    }

    public int getTotalHoursWorked() {
        return hoursWorkedSinceHired;
    }

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }
}