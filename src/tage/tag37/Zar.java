package tage.tag37;

import java.util.Random;
import java.util.Scanner;

public class Zar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. zari atiniz");
        int ersteNummer = scanner.nextInt();

        System.out.println("2. zari atiniz");
        int zweiteNummer = scanner.nextInt();



        Random random = new Random();


        if (!((ersteNummer+zweiteNummer) ==8)){

            ersteNummer = random.nextInt(6)+ 1;
            zweiteNummer = random.nextInt(6)+ 1;


            System.out.println(" nicht richtig");

        }

        if ((ersteNummer+zweiteNummer) == 8){
            System.out.println("richtig");
        }

    }
}
