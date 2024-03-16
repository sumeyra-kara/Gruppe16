package calisma;
import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String[] args) {

        int sayi1, sayi2, secim ;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz : "); // kullanicidan sayiyi almak icin mesaj
        sayi1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz :");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bölme");
        System.out.println("seciminiz : " );
        secim = input.nextInt();

        if (secim==1) {
            System.out.println("Toplama : " + (sayi1+sayi2));
        } else if (secim == 2) {
            System.out.println("Cikarma : " + (sayi1-sayi2));;
        } else if (secim==3) {
            System.out.println("Carpma : " + (sayi1*sayi2));
        } else if (secim==4) {
            if (sayi2 != 0) {
                System.out.println("Bölme :" + (sayi1/sayi2));
            } else {
                System.out.println("Bir sayi 0'a bölunemez");
            }
        }
        else {
            System.out.println("Gecersiz");
        }

    }
}
