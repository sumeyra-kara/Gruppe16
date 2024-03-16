package tage.tag35;

import java.util.Scanner;

public class Steuerberechnung {

    public static void main(String[] args) {

        /*
        double myresult1 = berechnePreisFürAlleProdukte();
        double myresult2 = berechnePreisFürAlleProdukte();
        double myresult3 = berechnePreisFürAlleProdukte();


        System.out.println("Gesamtkalkulation: " + (myresult1 + myresult2 + myresult3));*/

        Steuerberechnung stBerechnung = new Steuerberechnung();
        stBerechnung.berechnePreisFürAlleProdukte();

        berechnePreisFürAlleProdukteStatic();


    }

    public double berechnePreisFürAlleProdukte() // Instanzmethode (nicht-statische Methode)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine Steuerrate ein: ");
        double taxRate = sc.nextDouble();

        System.out.println("Gib Preis des Produktes ein: ");
        double itemPrice = sc.nextDouble();

        System.out.println("Gib die Anzahl an Produkente ein: ");
        double numberItems = sc.nextDouble();

        double totalItem = ((itemPrice * (taxRate/100))+itemPrice);
        double totalAllItems = totalItem * numberItems;

        System.out.println("Der Produktpreis mit Steuer beträgt für ein Produkt lautet : " + totalItem);
        System.out.println("Der Produktpreis mit Steuer für alle Produkte lautet        : " + totalAllItems);

        return totalAllItems;
    }

    public static double berechnePreisFürAlleProdukteStatic() // statische Methode (ohne Objekt)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine Steuerrate ein: ");
        double taxRate = sc.nextDouble();

        System.out.println("Gib Preis des Produktes ein: ");
        double itemPrice = sc.nextDouble();

        System.out.println("Gib die Anzahl an Produkente ein: ");
        double numberItems = sc.nextDouble();

        double totalItem = ((itemPrice * (taxRate/100))+itemPrice);
        double totalAllItems = totalItem * numberItems;

        System.out.println("Der Produktpreis mit Steuer beträgt für ein Produkt lautet : " + totalItem);
        System.out.println("Der Produktpreis mit Steuer für alle Produkte lautet        : " + totalAllItems);

        return totalAllItems;
    }
}
