package tage.tag42;

import java.util.Arrays;
import java.util.Scanner;

public class Hausaufgabe2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float []  punkte=  new float[7];
        float sGrad=0.0f;

        float total = 0.0f;


        for (int i = 0; i < punkte.length; i++) {

            System.out.println("Gib mir den Punkt für den Jury"+(i+1)+ ":");

            punkte[i]=input.nextFloat();

        }
        Arrays.sort(punkte);
        System.out.println("Gib den Schwierigkeitsgrad an");
        sGrad=input.nextFloat();

        for (int i = 0; i < punkte.length; i++) {

            total+=punkte[i];
        }
        total=total-punkte[0]-punkte[punkte.length-1];
        total= total* sGrad;
        total=total*0.6f;
        System.out.printf("Totale Punktzahl: %.2f",total);

    }
}
