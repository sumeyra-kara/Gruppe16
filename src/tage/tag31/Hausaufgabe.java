package tage.tag31;

public class Hausaufgabe {
    public static void main(String[] args) {

        // Aufgabenstellung: Schreibe eine Methode die Grad Celsius in Fahrenheit umrechnet
        // und eine Methode die Fahrenheit in Grad Celsius umrechnet.

        // f = c * 9/5 + 32        c = (f-32) * 5/9

        System.out.println(inFahrenheit(5));
        System.out.println(inCelcius(26));
    }

    public static double inFahrenheit (double celcius){

        return (((celcius * 9)/5) + 32);
    }

    public static double inCelcius (double fahrenheit){
        return (((fahrenheit-32)*5)/9);
    }
}
