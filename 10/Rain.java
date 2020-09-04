public class Rain {
    public static void main (String [] args) {
        Double april = 12.0; 
        Double may = 14.0;
        Double june = 8.0;
        Double average = (april+may+june)/3;

        System.out.format("April: %s \nMay:%s  \nJune: %s  \nAverage: %s", april,may,june,average);
    }
}