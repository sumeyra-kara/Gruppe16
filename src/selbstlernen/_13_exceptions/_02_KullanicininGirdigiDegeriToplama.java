package selbstlernen._13_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_KullanicininGirdigiDegeriToplama {
    /*
    Kullanicidan istedigi kadar tam sayi alip toplayin
    Kullanici q'ya bastiginda islemi sonlandirip kac sayi girildigini ve toplamini yazdirin
    q veya Q disinda tam sayi olmayan bir deger girilirse hata mesaji verip yeni deger isteyerek isleme devam edin
     */

    public static void main(String[] args) {


        int sayac = 0;
        int toplam= 0;
        int girilenSayi = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Toplamak üzere tam sayi giriniz");

            try { // try calisinca catch kismi calismaz
                girilenSayi = scanner.nextInt(); // q,Q veya gecersiz baska input girerse Exception olur
                toplam+=girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {

                char input = scanner.next().charAt(0);

                if (input=='q' || input == 'Q'){

                    System.out.println("girilen " + sayac + "adet tamsayinin toplami " + toplam);
                    break;
                }else {
                    System.out.println("Tam sayi degeri girmelisin");
                }

            }


        }while (true);
        System.out.println("Bu is bu kadar");
    }
}
