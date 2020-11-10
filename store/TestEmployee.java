import java.util.ArrayList;

public class TestEmployee {
    public static void main (String[] args){
        ArrayList<Paycheck> shrutiChecks = new ArrayList<Paycheck>();

        Employee shruti = new Employee("Shruti", "Next to me", 10.0, 1);

        System.out.println(shruti.getId());
        //Testing paycheck request
        Paycheck sPay1 = shruti.requestPaycheck();
        shrutiChecks.add(sPay1);
        System.out.println(sPay1);

        //testing setpay with one update
        
        shruti.setPayPeriodHours(2);

        Paycheck sPay2 = shruti.requestPaycheck();
        shrutiChecks.add(sPay2);
        System.out.println(sPay2);


        //Testing setpay with two update
        shruti.setPayPeriodHours(10);

        shruti.setPayPeriodHours(14);

        Paycheck sPay3 = shruti.requestPaycheck();
        shrutiChecks.add(sPay3);
        System.out.println(sPay3);
    } 
}