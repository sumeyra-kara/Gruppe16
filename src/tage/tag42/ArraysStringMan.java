package tage.tag42;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysStringMan {

    public static void main(String[] args) {

        String [] meinAuto = {"Honda","Mercedes","BMW","Toyota"," Ford "};

        System.out.println(meinAuto[0].length());
        System.out.println(meinAuto[1].charAt(2));
        System.out.println(meinAuto[4].trim());
        System.out.println(meinAuto[2].charAt(2));
        System.out.println(meinAuto[3].substring(2,4));

        System.out.println(meinAuto[2].equals(meinAuto[2]));
        System.out.println(meinAuto[2]==meinAuto[2]); // bu == tercih edilmiyor

        String str = "Ich will diesenSatzineinArraypacken";

        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));


    }
}
