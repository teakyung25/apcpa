import java.util.*;

public class WeekTemp {
    public static void main (String [] args ){
        WeekForecast week1 = new WeekForecast();
        Boolean editMore = true;
        Scanner input = new Scanner(System.in);
        week1.setWeekTemp();
        week1.display();
        System.out.print("Would you like to edit a temperature (True or False): ");
        editMore = input.nextBoolean();
        while(editMore){
            week1.setDayTemp();
            System.out.print("Do you need to edit another day (True or False):");
            editMore = input.nextBoolean();
        }
        week1.display();
    }
}