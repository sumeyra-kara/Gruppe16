package selbstlernen.whileLoop_DoWhileLoop;

import java.util.Scanner;

public class KullanicidanAlinanSayilariToplama {
    public static void main(String[] args) {

        // kullanicidan toplamak icin sayil alin. toplam 500'u gecerse
        //"bu kadar sayi yeter,.. adet sayi girdiniz ve toplami .. oldu " yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangic ve bitis icin 2 tamsayi giriniz");


        double sayi = 0;
        double toplam =0;
        int sayac = 0;

        while (toplam<=500){
            System.out.println("Lütfen toplamak üzere sayi giriniz");
            sayi = scanner.nextDouble();

            sayac++;
            toplam+= sayi;
        }

        System.out.println("bu kadar sayi yeter " + sayac + " adet sayi girdiniz ve toplami : " + toplam);

    }
}
