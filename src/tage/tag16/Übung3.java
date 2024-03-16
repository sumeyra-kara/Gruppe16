package tage.tag16;

public class Übung3 {
    public static void main(String[] args) {

        // schreibe eine If abfrage die eine Zahlung um 3 Prozent erhöht, wenn ein Wert uber 90 liegt

        double Zahlung = 100;
        int Wert = 98;

        if (Wert>90) {
            Zahlung = Zahlung * 1.83;  // Zahlung *= 1.83

        }

        System.out.println(Wert);
        System.out.println(Zahlung);
    }
}
