package tage.tag27;

public class Hausaufgabe {

    public static void main(String[] args) {

        fahreVorwärts();
        System.out.println("******");
        holenNochmalAutoschlüssel();
    }

    public static void holeAutoschlüssel()
    {
        System.out.println("Holen wir die Autoschlüssel");
    }
    public static void öffneAutotüren() { System.out.println("Öffne die Autotüren"); }
    public static void setzeDichAufFahrerSeite() { System.out.println("Setze dich auf die Fahrerseite");}
    public static void starteMotor() { System.out.println("Starte Motor");}
    public static void legeGurtAn() { System.out.println("Lege Gurt an");}
    public static void fahreVorwärts() {

        holeAutoschlüssel();
        öffneAutotüren();
        setzeDichAufFahrerSeite();
        starteMotor();
        legeGurtAn();
        System.out.println("Fahre vorwärts");
    }

    public static void endeDesFahren () { System.out.println("Bitte beenden das Fahren");}

    public static void schalteDesMotorsaus() {
        endeDesFahren();
        System.out.println("Schalte den Motor aus");
    }
    public static void nehmeGurtAb() {
        schalteDesMotorsaus();
        System.out.println("Nehme Gurt ab");
    }
    public static void stehenFahrerseiteAuf () {
        nehmeGurtAb();
        System.out.println("Stehe vom Fahrerseite auf");
    }
    public static void schließeAutoTüren () {
        stehenFahrerseiteAuf();
        System.out.println("Schließe die AutoTüren");
    }
    public static void holenNochmalAutoschlüssel () {
        schließeAutoTüren();
        System.out.println("Holen wir nochmal den Autoschlüssel");
    }
}
