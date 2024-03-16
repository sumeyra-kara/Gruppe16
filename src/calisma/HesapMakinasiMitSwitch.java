package calisma;

import java.util.Scanner;

public class HesapMakinasiMitSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("2.sayiyi giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("islemi seciniz : ");
        System.out.println("\n1+\n2-\n3*\n4/");
        int islem = input.nextInt();

        switch (islem) {
            case 1 :
                System.out.println(sayi1+sayi2);
                break;
            case 2:
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                System.out.println(sayi1*sayi2);
                break;
            case 4:
                Boolean bolme = (sayi2==0);
                if (bolme) {
                    System.out.println("bölunemez");
                } else {
                    System.out.println(sayi1/sayi2);
                }
            break;

        }


    }
}
