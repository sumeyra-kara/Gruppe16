package tage.tag46;

public class ReviewArrays {

    public static void main(String[] args) {
        // 3 4 5 80 90

        int [] werte = {3,4,5,80,90}; // 1te variente von Deklaration und initialisierung

        System.out.println(werte[0]);
        System.out.println(werte[1]);
        System.out.println(werte[2]);
        System.out.println(werte[3]);
        System.out.println(werte[4]);


        int [] nummern2 = new int[100]; // 2te Variante zur Deklaration eines Arrays
        nummern2[30]=500;
        nummern2[45]=56;

        System.out.println(nummern2[33]); // 0 default degeri cunku tanimlamadik
        System.out.println(nummern2[45]); // 56

        for (int i = 0; i < nummern2.length; i++) {
            System.out.println(nummern2[i]);
        }

        //for-each schleife en iyi cozum

        for (int nummer : nummern2){
            System.out.println(nummer);
        }
        System.out.println("******");

        for (int nummer : werte){

            System.out.println(nummer);
        }


    }
}
