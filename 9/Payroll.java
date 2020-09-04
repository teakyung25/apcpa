public class Payroll {
    public static void main ( String[] args ) {
      long   hoursWorked;
      double payRate, taxRate;
      hoursWorked = 40;    
      payRate = 10.0;
      taxRate = 0.10;    
      System.out.println("Hours Worked: " + hoursWorked );
      System.out.println("pay Amount  : " + (hoursWorked * payRate) );
      System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
    }
}

//When the there is no variable or when there is no value to the variable there is an error because other parts of the code are reliant on the values of the varibles  