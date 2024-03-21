package tage.tag67;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Beispiel {
    public static void main(String[] args) {

        double [] tute = {1.01, 1.99, 2.5, 1.5, 1.01};// }; // 1.01, 1.99, 2.5, 1.5, 1.01};
       Arrays.sort(tute);
        System.out.println(Arrays.toString(tute));

        // 1.01-1.99   2.5    1.5-1-01

        int counter=0;
        double summe=0;

        for (int i = 0; i < tute.length ; i++) {
            summe+=tute[i];



            /*

           if (summe<=1.5 && summe>=1.01){
               counter++;
               i++;

           }else if(summe>1.5 && summe<3){
               counter++;
               i++;
               summe=0;

           }else if (summe>=3){
               i++;
               summe=0;

           }

             */

        }

        System.out.println(summe);

    }

}
