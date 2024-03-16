package tage.tag37;

import java.util.Random;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Nummer zwichen 1 und 10ein");
        int gepickteNummer = scanner.nextInt();
        int wieViel=0;


        Random random = new Random();
        int value;

        while (true){

            int zielNummer = random.nextInt(10)+ 1;
            wieViel++;
            // System.out.println("Versuchszahl : " + wieViel );
            System.out.println(zielNummer);
            if (zielNummer==gepickteNummer){
                System.out.println("wir haben gefunden. Die Nummer ist : " + zielNummer);
                System.out.println("Versuchszahl : " + wieViel );
                break;
            }


        }




    }


}
