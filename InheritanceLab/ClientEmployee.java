import java.util.Scanner;

public class ClientEmployee {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        String last, first, dept;

        double pay_rate;

        int hours;

        System.out.println("first name: ");
        first = input.next();
        System.out.println("last name: ");
        last = input.next();
        System.out.println("Department: ");
        dept = input.next();
        System.out.println("pay rate ");
        pay_rate = input.nextDouble();
        System.out.println("hours works: ");
        hours = input.nextInt();


        Employee prof = new Employee("John", "Doe", 25.50, 50.0, "COSC"); //subclass alternate constructor invoked
        Employee prof2 = new Employee(first,last,pay_rate,hours,dept); //subclass alternate constructor invoked

        Employee newEmp = new Employee(); //subclass default constructor invoked
        System.out.println("NEW Employee TEST: ");
        System.out.println(newEmp);

        System.out.println("Prof TEST: ");
        System.out.println(prof);

        Employee profCopy = prof.getCopy();

        prof.copy(prof2);
        
        System.out.println("Prof1 copy of Prof2 TEST: ");
        System.out.println(prof);

        prof.copy(profCopy);

        System.out.println("Prof1 copy of profCopy TEST(AKA reset): ");
        prof.print();
    }

}