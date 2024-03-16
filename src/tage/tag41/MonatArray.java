package tage.tag41;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MonatArray {

    public static void main(String[] args) {

        // Eine Inputeingabe fur das Vorgehen

        Scanner sc = new Scanner(System.in);

        String [] monat = new String[12];

        monat[0] = "Januar";
        monat[1] = "Februar";
        monat[2] = "März";
        monat[3] = "April";
        monat[4] = "Mai";
        monat[5] = "Juni";
        monat[6] = "Juli";
        monat[7] = "August";
        monat[8] = "September";
        monat[9] = "October";
        monat[10] = "November";
        monat[11] = "Dezember";

        System.out.println("gib mir die Monatzahl an");

        int index = sc.nextInt();

        System.out.println(monat[index]);

        System.out.println(monat); // bu sekilde referanz kodu gelir

        System.out.println(Arrays.toString(monat)); // tüm aylari buluruz bu sekilde

    }
}
