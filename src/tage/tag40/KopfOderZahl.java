package tage.tag40;

import java.util.Random;
import java.util.Scanner;

public class KopfOderZahl {
    public static void main(String[] args) {
        /**
         * Kopf oder Zahl Spiel
         *
         * Der Computer wirft eine Münze.(Random Class)
         * Wir raten, ob es Kopf oder Zahl ist.(Scanner Class)
         * Wenn es richtig ist, bekommen wir 1 punkte.
         * Wir haben insgesamt 5 versuche
         * Am Ende sehen wir, wie viele Punkte wir bekommen haben
         *
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int punkt = 0;
        String computerResult;

        System.out.println("******Willkommen Kopf oder Zahl Spiel******");

        for (int i = 0; i < 5; i++) {

            //Computer
            int computer = random.nextInt(2);//0->kopf   1->zahl

            if(computer == 0){
                computerResult = "kopf";
            }else {
                computerResult = "zahl";
            }

            //Benutzer
            System.out.println("Bitte Kopf oder Zahl vorhersagen");
            String benutzerAntwort = scanner.nextLine();

            //Vergleich
            if(computerResult.equalsIgnoreCase(benutzerAntwort)){
                punkt++;
                System.out.println("Richtig --> computerResult = " + computerResult);
            } else {
                System.out.println("Falsch --> computerResult = " + computerResult);
            }

        }

        System.out.println("------------------------------------------------");
        System.out.println("Meine Gesamtpunkte ist = " + punkt);

    }
}
