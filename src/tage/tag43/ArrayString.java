package tage.tag43;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {

        String info1 =  "Diese Info beinhaltet Passwort : dsdsd. Bitte teilen sie es mit niemandem";
        String info2 =  "Diese Info beinhaltet Passwort : dsd2324. Bitte teilen sie es mit niemandem";

        String [] infoArray1 =  info1.split("Passwort");

        System.out.println(Arrays.toString(infoArray1));

        String s = infoArray1[1].split(". Bitte")[0];

        System.out.println(s);

    }



}
