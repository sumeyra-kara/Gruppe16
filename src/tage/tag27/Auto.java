package tage.tag27;

public class Auto {

    public static void main(String[] args) {

        //Algorithmus zum Hinsetzen auf die Fahrerseite:
        //setzeDichAufFahrerSeite();

        //Algorithmus zum Starten des Motors:
        //starteMotor();

        //Algorithmus um mit dem Auto vorwärts zu fahren:
        fahreVorwärts();

        // Implementiert einen Algorithmus zum Rückwertsfahren
        // ...

    }

    // Wir implementieren Methoden:
    public static void holeAutoschlüssel()
    {
        System.out.println("Holen wir die Autoschlüssel");
    }
    public static void öffneAutotüren()
    {
        holeAutoschlüssel();
        System.out.println("Öffne die Autotüren");
    }
    public static void setzeDichAufFahrerSeite()
    {
        öffneAutotüren();
        System.out.println("Setze dich auf die Fahrerseite");
    }
    public static void starteMotor()
    {
        setzeDichAufFahrerSeite();
        System.out.println("Starte Motor");
    }
    public static void legeGurtAn()
    {
        starteMotor();
        System.out.println("Lege Gurt an");
    }

    public static void fahreVorwärts()
    {
        starteMotor();
        System.out.println("Fahre vorwärts");
    }

}
