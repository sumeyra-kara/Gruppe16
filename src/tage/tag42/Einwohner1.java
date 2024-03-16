package tage.tag42;

import java.util.Arrays;
import java.util.Scanner;

public class Einwohner1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("gib mir den Bevölkerungszahl für die Städte");

        int[] einwohner = new int[8];

        for (int i = 0; i < einwohner.length; i++) {
            einwohner[i]=scanner.nextInt();
        }

        System.out.println("Tag 0 : " + Arrays.toString(einwohner));

        int tag =1;
        boolean ausgeloscht = false;

        while (!ausgeloscht){
           ausgeloscht=true;

            for (int i = 0; i < einwohner.length; i++) {
                einwohner[i] /= 2;
                if (einwohner[i]>0){
                    ausgeloscht=false;
                }
            }

            if (!ausgeloscht){
                System.out.println("Tag " + tag + " : " + Arrays.toString(einwohner));
                tag++;
            }
        }


        Arrays.fill(einwohner,0);
        System.out.println("Tag " + tag + " : " + Arrays.toString(einwohner));

        System.out.println("-----Ausgelöscht-------");
    }
}
