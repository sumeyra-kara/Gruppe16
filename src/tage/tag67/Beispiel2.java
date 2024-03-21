package tage.tag67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Beispiel2 {

    public static void main(String[] args) {

        double [] tute = {1.01, 1.99, 2.5, 1.5, 1.01, 1.01, 1.99, 2.5, 1.5, 1.01};
        Arrays.sort(tute);
        System.out.println(Arrays.toString(tute)); // [1.01, 1.01, 1.01, 1.01, 1.5, 1.5, 1.99, 1.99, 2.5, 2.5]

        int counter=0;

        int linkeSeite = 0;
        int rechteSeite = tute.length-1;

        while(linkeSeite<=rechteSeite){
            if (tute[linkeSeite]+tute[rechteSeite]<=3.0){
                linkeSeite++;
                counter++;
                rechteSeite--;
            } else {
                counter++;
                rechteSeite--;
            }

        }

         System.out.println("Hausmeister muss " + counter + " mal nach draußen gehen um Tüten raus zu bringen");


    }
}
