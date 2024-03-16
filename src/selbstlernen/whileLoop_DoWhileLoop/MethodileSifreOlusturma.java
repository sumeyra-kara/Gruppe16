package selbstlernen.whileLoop_DoWhileLoop;

import java.util.Scanner;

public class MethodileSifreOlusturma {
    public static void main(String[] args) {

        //kullanicidan sifre iste. sartlari kontrol edin.
        // sifreyi bir method'da kontrol edin
        // methotda sartlari saglamayan sifrelerde sifrelerde hatalari yazdirip
        // methottan sifrenin durumunu true ya da false olarak cevirin
        // main methot'da kullanici gecerli sifreye kadar bu islemi tekrar edin.
        // gecerli sifre yazinca "sifre basariliyla kaydedildi"yazdir
        // sartlar sunlar : 1-ilk harf kucuk 2- son karakter rakam olacak
        // 3-sifrede bosluk icermyecek 3-uzunluk en az 10 karakter olacak

        Scanner scanner = new Scanner(System.in);
        int flag=7; // while looopun calismaya baslayip kullanicidan deger alabilmek icin 0 disinda deger girdik
        String sifre = "";

        while (flag>0) {
            System.out.println("lütfen sifrenizi giriniz");
            sifre = scanner.nextLine();

            boolean sonuc = sifreKontrol(sifre); // true veya false dönecek

            if (sonuc){
                System.out.println("sifreniz basariyla kaydedildi");
            } break;
        }
    }

    public static boolean sifreKontrol (String sifre){
        int flag = 0;

        // ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("ilk harf kücuk harf olmali");
            flag++;
        }

        // son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("son karkter rakam olmali");
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

        if (flag == 0) {
            return true;
        } else {
            return false;
        }


    }
}
