package tage.tag40;

import java.util.Random;
import java.util.Scanner;

public class KopfOderZahl2 {

    public static void main(String[] args) {

        int punkt = 0;

        System.out.println("******Willkommen Kopf oder Zahl Spiel******");

        for (int i = 0; i < 5; i++) {

            //Computer
            String computerResult = wirfMuenze();

            //Benutzer
            String benutzerAntwort = benutzerVorhersahe();

            //Vergleich
            punkt = vergleich(computerResult, benutzerAntwort, punkt);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Meine Gesamtpunkte ist = " + punkt);
    }

    public static String wirfMuenze(){
        Random random = new Random();
        String computerResult;

        int computer = random.nextInt(2);// 0->kopf   1->zahl

        if(computer == 0){
            computerResult = "kopf";
        }else {
            computerResult = "zahl";
        }

        return computerResult;
    }

    public static String benutzerVorhersahe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Kopf oder Zahl vorhersagen");
        String benutzerAntwort = scanner.nextLine();

        return benutzerAntwort;
    }

    public static int vergleich(String computerResult, String benutzerAntwort, int punkt){
        if(computerResult.equalsIgnoreCase(benutzerAntwort)){
            punkt++;
            System.out.println("Richtig --> computerResult = " + computerResult);
        } else {
            System.out.println("Falsch --> computerResult = " + computerResult);
        }

        return punkt;
    }
}
