package tage.tag36;

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz");
        //int richtigeZahl = scanner.nextInt();
        int richtigeZahl =10;
        int rateZahl;
        rateZahl = scanner.nextInt();

        while (richtigeZahl!=rateZahl){
            if (richtigeZahl < rateZahl){

                System.out.println(rateZahl+ " ist zu groß. Bitte versuchen sie es noch einmal!");
                //System.out.println("Gib eine Zahl zwischen 1 und 30 ein:");
                rateZahl = scanner.nextInt();

            } else if (richtigeZahl > rateZahl) {

                System.out.println(rateZahl + " ist zu klein. Bitte versuchen sie es noch einmal!");
                //System.out.println("Gib eine Zahl zwischen 1 und 30 ein:");
                rateZahl = scanner.nextInt();

            }
        }

        if (richtigeZahl == rateZahl){
            System.out.println("Bravo! Richtige Antwort");
        }



    }

    public static void result(){

    }
}
