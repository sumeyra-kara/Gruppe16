package tage.tag25;

public class Loops {
    public static void main(String[] args) {
        //for-Schleifen

        // + große Datenmengen

        int counter = 0;
        int var = 0;
        // 100 Iterationen durch die Schleife

        for(counter = 0; counter<101; counter++){ // counter = index für die Iterationen

            // iterieren durch die schleife.
            // 1 Schleifendurchlauf = 1 Iteration

            System.out.println("Hello, mein counter hat den Wert: "  + counter);
            var =+ (counter * 2);
            System.out.println("var ist: " + var);
        }

        System.out.println("Nach der Schleife hat der counter den Wert: " + counter);
        System.out.println("Nach der Schleife hat die variable var den Wert: " + var);

        // Mein Excelfile hat höchsten 100 Spalten die ich betrachten will
        for(int i = 0; i<100; i++){ // Index i steht für Spalten in meinem Excel file

            System.out.println("Äußere Loop");

            // Mein Excelfile hat höchsten 5 Zeilen die ich betrachten will
            for(int k = 0; k<5; k++){ // Index k steht für Zeilen in meinem Excel file

                // i = 10
                // k = 4
                // Spalte 10, Zeile 4 --> Zelle(10,4)

                System.out.println("   Inneren Loop");

            }

        }
        // ende des codeblocks der äußeren schleife
    }
}
