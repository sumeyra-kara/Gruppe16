package tage.tag28;

public class RückgabeWert {

    public static void main(String[] args) {

        greaterNumber(12,78);
        greaterNumber(10,2);
        greaterNumber(11,11);
        greaterNumber(2,5);

    }

    public static void greaterNumber (int zahl1, int zahl2){ // void= kein Rückgabewert



        if (zahl1>zahl2){
            System.out.println(zahl1 + " ist größer als " +  zahl2);
        } else if (zahl2>zahl1) {
            System.out.println(zahl2 + " ist größer als " +  zahl1);
        } else {
            System.out.println(zahl1 + " ist genau gleich groß wie " +  zahl2);
        }

    }




}
