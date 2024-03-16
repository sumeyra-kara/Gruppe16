package tage.tag16;

public class Übung1 {
    public static void main(String[] args) {

        // schreibe eine if abfrage die das Gehalt mit 1,2 multipliztiert
        // wenn Arbeitsstunden größer als 38 sind.

        double Gehalt = 60000;
        int Arbeitsstunden = 37;

        if (Arbeitsstunden>38) {
            System.out.println("Gehalt wird erhöcht");
            Gehalt = Gehalt * 1.5 ;
        }

        System.out.println("Gehalt : " + Gehalt);
    }
}
