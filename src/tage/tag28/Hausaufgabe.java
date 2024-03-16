package tage.tag28;

public class Hausaufgabe {


    public static void main(String[] args) {
        System.out.println(meilenInKm(10));
        System.out.println( meilenInKm(200));
    }


    public static double meilenInKm(int km){

        double meilen= 0.621376;
        return km*meilen;
    }
}
