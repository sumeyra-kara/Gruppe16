package tage.tag35;

import java.util.Scanner;
// Klasse Scanner wird eingebunden/importiert:

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib 5 Ganzzahlen ein:");
        int zahl1 = scanner.nextInt();
        int zahl2 = scanner.nextInt();
        int zahl3 = scanner.nextInt();
        int zahl4 = scanner.nextInt();
        int zahl5 = scanner.nextInt();

        //System.out.println("Gib eine Fließkommazahl ein:");
        //double zahl2 = scanner.nextDouble();

        //System.out.println("Meine Ganzzahl ist      : " + zahl1);
        //System.out.println("Meine Fließkommazahl ist: " + zahl2);

        int result = (zahl1+zahl2+zahl3+zahl4+zahl5)/5;
        System.out.println("Der Durchschnitt meiner 5 Zahlen ist: " + result);

    }
}
