public class Employee extends Person {
    private double payRate;    
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

   

     //default constructor
     public Employee() {
        super();
        this.payRate = 0.0;
        this.hoursWorked = 0.0;
        this.department = "None";
     }

     public Employee(String firstName, String lastName, double payRate, double hoursWorked, String department) {
         super(firstName, lastName);
         this.payRate = payRate;
         this.hoursWorked = hoursWorked;
         this.department = department;
     }

     //add an alternate constructor with parameters

     public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " are: $" + calculatePay();
     }

     public void print() {
       //Should print output like this (same line):
       System.out.println("The employee " + super.toString() + " from the " + department + " worked " + hoursWorked + " hours with a pay rate of " + payRate + ". The wages for this employee are " + calculatePay());
     }

     public double calculatePay() {
        if(hoursWorked > HOURS) {
            double overtimeHrs = hoursWorked - HOURS;
            System.out.println(overtimeHrs);
            return ((HOURS) * payRate) + (overtimeHrs * (OVERTIME * payRate));
        } else {
            return hoursWorked * payRate;
        }
     }

     public void setAll(String first, String last, double rate, double hours, String dep){
        setName(first, last);
        this.payRate = rate;
        this.hoursWorked = hours;
        this.department = dep;
     }

     public double getPayRate() {
        return payRate;
     }

     public double getHoursWorked() {
        return hoursWorked;
     }

     public String getDepartment() {
        return department;
     }

     public boolean equals(Object o) {
        if(!(o instanceof Employee)) return false;
        Employee p = (Employee) o;
        return p.getFirst().equals(this.getFirst()) && p.getLast().equals(this.getLast()) && p.payRate == this.payRate && p.hoursWorked == this.hoursWorked && p.department.equals(this.department);
    } 

     public Employee getCopy() {
        return new Employee(getFirst(),getLast(), this.payRate, this.hoursWorked, this.department);
     }
  
     public void copy(Employee e) {
        this.setAll(e.getFirst(),e.getLast(), e.getPayRate(), e.getHoursWorked(), e.getDepartment());
     }     
}