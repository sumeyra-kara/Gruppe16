package tage.tag26;

public class Schleifen {
    public static void main(String[] args) {

        int maxAnzahlSpalten = 100;
        int maxAnazhlZeilen = 25;

        for(int i=1; i<=maxAnzahlSpalten; i++) // äußere Schleife für Spalte: (Index i ist Zähler der Spalten)
        {
            //System.out.println("Ich befinde mich in Spalte: " + i);

            for(int j=1; j<=maxAnazhlZeilen; j++) // innere Schleife für Zeile: (Index j ist Zähler für Zeilen)
            {
                System.out.println("Ich befinde mich in Zeile " + j + " von Spalte: " + i);
            }
        }



        System.out.println("************************************+");
        System.out.println("Ich befinde mich außerhalb der Schelfeifen");
    }
}
