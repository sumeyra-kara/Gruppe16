package tage.tag41;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hausaufgabe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("schreiben Sie die zwichen 0 und 10 Note von Juris");
        double Note1 = scanner.nextDouble();
        double Note2 = scanner.nextDouble();
        double Note3 = scanner.nextDouble();
        double Note4 = scanner.nextDouble();
        double Note5 = scanner.nextDouble();
        double Note6 = scanner.nextDouble();
        double Note7 = scanner.nextDouble();


        double[] JurisNote = new double[7];
        JurisNote[0]=Note1;
        JurisNote[1]=Note2;
        JurisNote[2]=Note3;
        JurisNote[3]=Note4;
        JurisNote[4]=Note5;
        JurisNote[5]=Note6;
        JurisNote[6]=Note7;

        for (int i = 0; i <JurisNote.length ; i++) {
            System.out.println("Juri " + (i+1) + " : " +JurisNote[i]);
        }

        // System.out.println(Arrays.toString(JurisNote));
        niedrigsteUndHöchstePunkt(JurisNote);

    }

    double[] JurisNote = new double[7];
    public static void niedrigsteUndHöchstePunkt (double [] JuristNote){

        double niedrigstePunkt = JuristNote[0];
        double höchstePunkt = JuristNote[0];


        double summe =0;
        for (int i = 0; i < JuristNote.length ; i++) {



            if (JuristNote[i] > höchstePunkt){
                höchstePunkt=JuristNote[i];
            }

            if (JuristNote[i] < niedrigstePunkt) {
                niedrigstePunkt=JuristNote[i];
            }
            summe+=JuristNote[i];
        }

        /* mit S    Sort Methoden

        Arrays.sort(JuristNote);
        System.out.println("Natural Order : " + Arrays.toString(JuristNote));
        System.out.println( "summe von verbleidenden Punkten : " + (summe -(JuristNote[0] + JuristNote[JuristNote.length-1])));
        */

        System.out.println("der höchste Punkt : " + höchstePunkt);
        System.out.println("der niedrigste Punkt : " + niedrigstePunkt);
        // System.out.println(summe); // --die Summe von allen Noten
        System.out.println("summe von verbleidenden Punkten : " +(summe-(höchstePunkt+niedrigstePunkt)));



        Random sch = new Random();
        double Schwierigkeitsgrad = sch.nextDouble(5) + 1.2;
        System.out.println("schwierigkeitsgrad : " +Schwierigkeitsgrad);


        /* ohne Random Class
        double Schwierigkeitsgrad = 2.5;
        System.out.println("Schwierigkeitsgrad : " + Schwierigkeitsgrad);

         */

        System.out.println("summe mit Schwierigkeitsgrad  : " + (Schwierigkeitsgrad * (summe-(höchstePunkt+niedrigstePunkt))));
        System.out.println("totale punktzahl des Tauchers : " + (0.6 * (Schwierigkeitsgrad * (summe-(höchstePunkt+niedrigstePunkt)))));


    }









}
