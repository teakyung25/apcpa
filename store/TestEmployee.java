import java.util.ArrayList;

public class TestEmployee {
    public static void main (String[] args){
        //Employees Paycheck stored

        ArrayList<Paycheck> shrutiChecks = new ArrayList<Paycheck>();
        ArrayList<Paycheck> jakeChecks = new ArrayList<Paycheck>();


        //SHRUTI EMPLOYEE//

        Employee shruti = new Employee("Shruti", "Next to me", 10.0, 1);
        System.out.println("SHRUTI: \n\n");
        System.out.println( "ID: "+ shruti.getId());

        System.out.println(shruti.getPayPeriodHoursWorked()); // 1
        System.out.println(shruti.getTotalHoursWorked()); // 1
        
        //Testing paycheck request
        Paycheck sPay1 = shruti.requestPaycheck();
        shrutiChecks.add(sPay1);
        System.out.println(sPay1);

        System.out.println(shruti.getPayPeriodHoursWorked()); // 0
        System.out.println(shruti.getTotalHoursWorked()); // 1

        //testing setpay with one update
        
        shruti.setPayPeriodHours(2);

        Paycheck sPay2 = shruti.requestPaycheck();
        shrutiChecks.add(sPay2);
        System.out.println(sPay2);


        //Testing setpay with two update

        System.out.println(shruti.getPayPeriodHoursWorked()); // 0
        System.out.println(shruti.getTotalHoursWorked()); // 3

        shruti.setPayPeriodHours(10);

        
        shruti.setPayPeriodHours(14);

        System.out.println(shruti.getPayPeriodHoursWorked()); // 24
        System.out.println(shruti.getTotalHoursWorked()); // 27

        Paycheck sPay3 = shruti.requestPaycheck();
        shrutiChecks.add(sPay3);
        System.out.println(sPay3);

        System.out.println(shruti.getPayPeriodHoursWorked()); // 0
        System.out.println(shruti.getTotalHoursWorked()); // 27


        


        //JAKE EMPLOYEE //
        Employee jake = new Employee("Jake", "Coding Boi", 10.22, 22);


        System.out.println("\n\nJAKE: \n\n");

        System.out.println( "ID: " + jake.getId());

        System.out.println(jake.getPayPeriodHoursWorked()); // 22
        System.out.println(jake.getTotalHoursWorked()); // 22
        
        //Testing paycheck request
        Paycheck sPay4 = jake.requestPaycheck();
        jakeChecks.add(sPay4);
        System.out.println(sPay4);

        System.out.println(jake.getPayPeriodHoursWorked()); // 0
        System.out.println(jake.getTotalHoursWorked()); // 22\

        //Testing Wage Change

        jake.setPayPeriodHours(9);
        jake.setWage(100.0);

        Paycheck sPay5 = jake.requestPaycheck();
        jakeChecks.add(sPay5);
        System.out.println(sPay5);

        //erroneous test
        jake.setPayPeriodHours(10000);
        jake.setWage(10000);
        Paycheck sPay6 = jake.requestPaycheck();
        jakeChecks.add(sPay6);
        System.out.println(sPay6);
    } 
}