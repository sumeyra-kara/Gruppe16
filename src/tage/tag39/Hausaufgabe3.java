package tage.tag39;

import java.util.Scanner;

public class Hausaufgabe3 {

    public static void main(String[] args) {

        // Erstellen Sie eine Login-Funktionalität nach folgender Logik--Benutzername,Passwort
        // Das Programm fordert zur Eingabe von Benutzername und Passwort auf
        // Wenn sowohl Benutzername als auch Passwort leer sind (1)
        // "Die Felder Benutzername und Passwort können nicht leer sein"
        // Wenn der Benutzername leer ist und das Passwort nicht leer ist (2)
        // "Benutzername kann nicht leer sein"
        // Wenn der Benutzername nicht leer ist und das Passwort leer ist (3)
        // "Passwort kann nicht leer sein"
        // Wenn der Benutzername oder das Passwort ungültig ist (4)
        // "Benutzername oder Kennwort ist nicht gültig. Bitte überprüfen"
        // Wenn sowohl der Benutzername als auch das Kennwort gültig sind (5)
        // "Benutzer erfolgreich eingeloggt"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gibt den Benutzername ein und der muss ein Punkt enthalten");
        String benutzerName = scanner.nextLine();

        System.out.println("Bitte gibt das Passwort ein und es muss 8 Character sein.");
        String passwort = scanner.nextLine();

        if (benutzerName.contains(" ") && passwort.contains(" ")){
            System.out.println("Die Felder Benutzername und Passwort können nicht leer sein");
        } else if (benutzerName.contains(" ") && (!(passwort.contains(" ")))) {
            System.out.println("Benutzername kann nicht leer sein");
        } else if (passwort.contains(" ") && (!(benutzerName.contains(" ")))) {
            System.out.println("Passwort kann nicht leer sein");
        } else if ((!(benutzerName.contains(".")) || (!(passwort.length()== 8)))) {
            System.out.println("Benutzername oder Kennwort ist nicht gültig. Bitte überprüfen");
        } else if ((benutzerName.contains(".") && (passwort.length()== 8))) {
            System.out.println("Benutzer erfolgreich eingeloggt");
        }

    }
}
