package selbstlernen.ilkKonular;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz : ");

        double not = scan.nextInt();

        if (not>100 || not<=0) {
            System.out.println("Gecersiz not");
        } if (not>=85) {
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        } else if (not>=50) {
            System.out.println("CC");
        } else {
            System.out.println("DD");
        }

    }
}
