import java.util.*;

public class WeekForecast {
    int [] forecast = new int[7];
    String [] days = {"Sun","Mon","Tus","Wed","Thurs","Fri","Sat"};
    Scanner input = new Scanner(System.in);
    // public Temperature (int day, int temp){
        
    // }
    public void setWeekTemp(){
        System.out.println("Enter the temperatrue for each day of the week: ");
        for(int i = 0; i < 7 ; i++){
            System.out.print(days[i] + ": ");
            forecast[i] = input.nextInt(); 
        }
    }

    public void setDayTemp(){
        int index;
        System.out.print("Which day of the week? (1-7 : 1 = Sun | 7 = Sat): ");
        index = input.nextInt();
        System.out.print(days[index] + ": ");
        forecast[index] = input.nextInt();
    }

    public void display(){
        System.out.println(forecast);
    }
}
