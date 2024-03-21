package tage.tag70;

public class ErrorExc {
    public static void main(String[] args) {

        System.out.println("First line of main");

        System.out.println(1/0); // fehler zur runtime / laufzeit

        System.out.println("Mid line of main");

        System.out.println(Math.sqrt(-4));


        //System.out.println("Last line of main"; // fehler zur compile time

        System.out.println("Last line in main");
    }
}
