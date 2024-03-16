package tage.tag36;

import java.util.Scanner;

public class Wiederholung {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // int temperatur=10; // bu kac oldugu onemli dehil cunku bundan sonra kullanici kendisi deger giriyor

        System.out.println("Gib eine Temperatur ein");
        int temperatur= scanner.nextInt();

        if (temperatur<15){
            System.out.println("Schalte die Heizung ein");
        } else {
            System.out.println("Schalte die Heizung nicht ein");
        }

        System.out.println("Gib deine Kreditkartennummer ein");
        long kkNummer = scanner.nextLong();

        System.out.println(kkNummer);

    }

}
