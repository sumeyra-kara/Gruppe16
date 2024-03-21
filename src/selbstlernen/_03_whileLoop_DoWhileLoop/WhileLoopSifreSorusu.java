package selbstlernen._03_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class WhileLoopSifreSorusu {
    public static void main(String[] args) {

        //kullanicidan sifre iste. sartlari kontrol edin.
        // sartlari saglamazsa sifrelerde hatalari yazdir kullanicidan yeni sifre girmesini iste
        // gecerli sifreye kadar bu islemi tekrar edin.gecerli sifre yazinca "sifre basariliyla kaydedildi"yazdir
        //sartlar : 1-ilk harf kucuk 2- son karakter rakam olacak
        // 3-sifrede bosluk icermyecek 3-uzunluk en az 10 karakter olacak

        Scanner scanner = new Scanner(System.in);
        int flag=7; // while looopun calismaya baslayip kullanicidan deger alabilmek icin 0 disinda deger girdik
        String sifre = "";
        while (flag>0){
            flag = 0;

            System.out.println("lütfen bir sifre giriniz");
            sifre = scanner.nextLine();

            // ilk harf kucuk harf olmali
            char ilkHarf = sifre.charAt(0);

            if (!(ilkHarf>='a' && ilkHarf<='z')){
                System.out.println("ilk harf kücuk harf olmali");
                flag++;
            }

            // son karakter rakam olmali

            char sonKarakter = sifre.charAt(sifre.length()-1);

            if (!(sonKarakter>='0' && sonKarakter<='9')){
                System.out.println("son karakterbrakam olmali");
                flag++;
            }

            // sifrede bosluk olmamali

            if (sifre.contains(" ")){
                System.out.println("sifre bosluk icermemeli");
                flag++;
            }

            // uzunlugu en az 10 karakter olmali

            if (sifre.length()<10){
                System.out.println("uzunlugu en az 10 karakter olmali");
                flag++;
            }


        }

        System.out.println("sifre basari ile kaydedildi");



    }

}
