package tage.tag40;

import java.util.Scanner;

public class Hausaufgabe1 {
    // Wortanzahl und Durchschnittslänge berechnen
    // den benutzer auffordern, einen Satz einzugeben.
    // Die Anzahl der Wörter im gegebenen Satz ermitteln
    // Die Gesamtlänge der Wörter berechnen
    // die durchschnittliche Länge der Wörter berechen (Gesamtlänge / Anzahl der wörter)


    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Bitte gibt einen Satz ein");
        String satz = scanner.nextLine();


        int anzahlDerWörter = (satz.replaceAll("\\S","").length())+ 1;
        System.out.println("die Anzahl der Wörter ist : "+ anzahlDerWörter );

        int gesamtLängeDerWörter = satz.replaceAll("\\s","").length();
        System.out.println("die Gesamtlänge der Wörter ist : "+ gesamtLängeDerWörter);

        double durchschnitt = (gesamtLängeDerWörter / anzahlDerWörter);

        System.out.println("die durchschnittliche Länge der Wörter ist : " + durchschnitt);



    }


}
