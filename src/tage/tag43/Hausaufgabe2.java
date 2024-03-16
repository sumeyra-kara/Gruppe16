package tage.tag43;

import java.util.Random;
import java.util.Scanner;

public class Hausaufgabe2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir Reihenlänge des 2DArrays ein : ");
        int i = scanner.nextInt();

        System.out.println("Gib mir Spaltenlänge des 2DArrays ein : ");
        int j = scanner.nextInt();

        int [][] array  = new int[i][j];

        Random rn = new Random();


        for (i = 0; i < array.length; i++) {

            for (j = 0; j < array[i].length; j++) {


                System.out.println("Gib einen Wert in das Arrayfeld " +"[" +i +"]" + "[" + j + "] ein :");

                array[i][j]= rn.nextInt(10);

                System.out.println(array[i][j]);

            }

        }

        int dasKleinsteElement= Integer.MAX_VALUE;
        int dasGroßteElement = Integer.MIN_VALUE;

        for (i = 0; i < array.length; i++) {

            for (j = 0; j < array[i].length; j++) {

                if (array[i][j] < dasKleinsteElement){
                    dasKleinsteElement = array[i][j];
                }

                if (array[i][j] > dasGroßteElement) {
                    dasGroßteElement = array[i][j];
                }

            }

        }
        System.out.println("das Kleinste Element ist : " + dasKleinsteElement);
        System.out.println("das Großte Element ist : " + dasGroßteElement);




    }
}
