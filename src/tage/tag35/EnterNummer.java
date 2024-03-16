package tage.tag35;

import java.util.Scanner;

public class EnterNummer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib 3 Zahlen ein: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Zahl/Enter + Zahl/Enter + Zahl/Enter
        // oder:
        // Zahl/Leerzeichen + Zahl/Leerzeichen + Zahl + Enter

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);



    }
}
