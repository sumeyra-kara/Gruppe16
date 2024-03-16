package tage.tag50;

import java.util.Arrays;
import java.util.Random;

public class Würfeln {

    public static void main(String[] args) {

        // Schreiben eine Methode die einen Würfelwurf simuliert: 1 - 6
        // Wir schreiben die Werte von 100 Würfelergebnissen in ein Array

        System.out.println("Würfelwert aus Methode 1 (Random Class): " + wuerfeln1());
        //System.out.println("Würfelwert aus Methode 2 (Math   Class): " + wuerfeln2());




    }

    public static int wuerfeln1(){
        Random random = new Random();
        int n = random.nextInt(6) + 1;
        return n;
    }

    public  static int wuerfeln2(){
        int n = (int) (Math.random() * 6 + 1);
        return n;
    }
}
