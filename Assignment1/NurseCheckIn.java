import java.util.Scanner;
import java.util.Arrays;

public class NurseCheckIn {
    static String name;
    static int age;
    static double temp;
    static double bp;
    static boolean diabetes;
    static int scale;
    static int sNum;
    static String [] symptoms;
    static Scanner input = new Scanner(System.in);
    public static void main (String [] args) {
        Boolean again = true;
        while(again) {
            try{
                name = prompt("What is your name?");
                age = Integer.parseInt(prompt("What is your age?"));
                temp = Double.parseDouble(prompt("What is your Temperature?"));
                bp = Double.parseDouble(prompt("What is your Blood Pressure?"));
                diabetes = Boolean.parseBoolean(prompt("Do you have any family history of diabetes? (True or False)"));
                scale = Integer.parseInt(prompt("What is your level of discomfort on a scale from 0 to 10?"));
                sNum = Integer.parseInt(prompt("How many symptoms do you have?"));
                symptoms = new String[sNum];
                for(int i = 0; i < sNum; i++){
                    symptoms[i] = prompt("Symptom " + (i+1));
                }
                again = false; 
            } catch (Exception e) {
                System.out.println("You have entered the wrong data type, please try again.");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.format("Name: %s \nAge:%d  \nTemp: %s  \nbp: %s  \nDiabetes: %s  \nScale: %d  \nSymptoms: %s",name,age,temp,bp,diabetes,scale,Arrays.toString(symptoms));
    }
    public static String prompt(String question) {
        System.out.println(question);
        return input.next();
    }
}