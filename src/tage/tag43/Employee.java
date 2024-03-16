package tage.tag43;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {

        final int angestellter = 5;
        double lohn;
        double sSatz;

        Scanner scanner = new Scanner(System.in);


        int[] arbeitsstunden = new int[angestellter];

        for (int i = 0; i < arbeitsstunden.length; i++) {

            System.out.println("Arbeitsstunden von Mitarbeiter " + (i+1));
            arbeitsstunden[i]= scanner.nextInt();
        }

        System.out.println("---");

        sSatz = scanner.nextDouble();

        for (int i = 0; i < angestellter; i++) {
            lohn = arbeitsstunden[i]*sSatz;

            System.out.println((i+1)+"verdient diesen Monat " +lohn);
        }


    }
}
