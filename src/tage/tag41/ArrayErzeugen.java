package tage.tag41;

import java.util.Arrays;

public class ArrayErzeugen {

    public static void main(String[] args) {

        short [] zahl = new short [999];
        float [] kommazahl = new float [999999];
        char [] buchstaben = new char [2];
        long [] großeZahl = new long [99999];

       // System.out.println(zahl[2]);
        //System.out.println(kommazahl[2]);
        //System.out.println(buchstaben[2]);
        //System.out.println(großeZahl[2]);


        String [] einkListe = {"Butter","Brot","Joghurt","Eier","Tee","Zucker", "Schokolade"};

        for (int i = 0; i < einkListe.length; i++) {
            System.out.println(einkListe[i] + " ");

        }


        System.out.print(Arrays.toString(einkListe));



    }
}
