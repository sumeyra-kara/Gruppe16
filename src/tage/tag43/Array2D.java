package tage.tag43;

import java.util.Random;

public class Array2D {

    public static void main(String[] args) {

        int [][] array = new int [2][2]; //2*2 Plaetze erstellen. insg. 4 Elemente bzw. 4 Schubladen

        Random rn=new Random();
        //Initialisierung
//        array[0][0]=10;
//        array[0][1]=20;
//        array[1][0]=40;
//        array[1][1]=50;


        // Nestet for-Loop oder auf deutsch "Verschachtelte For-Schleife"
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j]= rn.nextInt(100);

                System.out.println(array[i][j]);

            }

        }

        //Direkte Initialisierung bei der Deklaration. Dabei ist es zu merken, das die Gesammtzahl der Array-Felder
        // groesser ist, als die verwendeten Felder.
        int [][] array2= { {100,200,300,2},   // Reihe 0 mit 3 Elementen
                {4,5,6},           // Reihe 1 mit 4 Elementen
                {50,4,0,0},        // Reihe 2 mit 2 Elementen
                {100,10,10}        // Reihe 3 mit 3 Element

        };
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }
    }
}
