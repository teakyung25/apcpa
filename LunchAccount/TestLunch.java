public class TestLunch {
    public static void main(String [] args){
        //Testing all methods 
        LunchAccount student1 = new LunchAccount(100.0);
        //getting balance
        System.out.println(student1.getBalance());
        //adding balance
        student1.addBalance(10);
        System.out.println(student1.getBalance());
        student1.buyLunch(20);
        //Printing object
        System.out.println(student1);

        //Testing one more time
        LunchAccount student2 = new LunchAccount(1000.0);
        System.out.println(student2.getBalance());
        student1.addBalance(100);
        System.out.println(student2.getBalance());
        student1.buyLunch(100);

        System.out.println(student2);

        //testing for end of $20 promotion 
        for(int i = 0; i < 98; i++){
            //should print 30 with 20 added
            LunchAccount student = new LunchAccount(10);
            System.out.print(student);
        }
        //should have 10 not 30 as the promotion end after 100 students 
        LunchAccount student = new LunchAccount(10);
        System.out.print(student);
    }
}
