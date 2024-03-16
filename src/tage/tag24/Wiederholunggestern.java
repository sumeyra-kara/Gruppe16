package tage.tag24;

public class Wiederholunggestern {
    public static void main(String[] args) {

        // for Schleifen --- große Datenmengen

        // iteration: tekrarlama
        /*int i=0;
        for (i = 1; i < 101; i++) {
            System.out.println("hallo"); // 100 kez tekrar= Schleifendurchlauf=Iteration
            System.out.println(i);
        }
        System.out.println(i); */

        for (int i = 0; i <10 ; i++) {  // bu satir icin also Spalten
            System.out.println("außere loop");

            for (int j = 0; j <5 ; j++) { // bu sutunlae icin also fur Zeilem
                System.out.println("   innere looop");

            }
        }







    }
}
