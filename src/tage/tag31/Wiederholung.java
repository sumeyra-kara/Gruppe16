package tage.tag31;

public class Wiederholung {

    // globale variable

    int Variable; // deklaraion yapilmali.initaliesierung yapilmak yorunda degil

    public static void main(String[] args) {

        subtrahieren(20,12);
        subtrahieren(40,13,17);
        subtrahieren(32.8,12.5);
        subtrahieren(12,9);

        // eger böyle olursa "lokal variable" denir. hem deklaration hem de initialisierung birlikte olursa.
        int a;
        a=10;
        System.out.println(a);


    }

    public static void subtrahieren (int a,int b){
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    public static void subtrahieren (int a,int b, int c){
        System.out.println(a + " - " + b + " - " + c + " = " + (a-b-c));
    }

    public static void subtrahieren (double a,double b){
        System.out.println(a + " - " + b + " = " + (a-b));
    }





}
