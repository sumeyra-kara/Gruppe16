package tage.tag36;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Zahl ein:");
        int zahl = scanner.nextInt();

        int dayinMinuten= 1440; // 60*24 (wie viele Minuten gibt es in einem Tag?
        int jahrinMinuten= 525600; // 365 * dayinMinuten

        System.out.println(zahl + " minutes is approximtely " + ( zahl/jahrinMinuten) + " years and " + ((zahl%jahrinMinuten)/dayinMinuten));
    }
}
