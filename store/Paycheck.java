public class Paycheck {
    private Employee employee;
    private double amountPayed;
    private int hoursWorked;
    private double wage;  
    private boolean isErroneous;
    
    public Paycheck (Employee employee, double amountPayed, int hoursWorked, double wage) {
        this.employee = employee;
        this.amountPayed = amountPayed;
        this.hoursWorked = hoursWorked;
        this.wage = wage;
        if(hoursWorked >= 100 || amountPayed > 1500) {
            isErroneous = true;
        } else {
            isErroneous = false;
        }
    }

    public String toString(){
        return (employee.getName() + "'s paycheck: \n" + "Payed: " + amountPayed + "\nHours Worked: " + hoursWorked + "\nWage: " + wage + "\nIs Erroneous:" + isErroneous);
    }


}