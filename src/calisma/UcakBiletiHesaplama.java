package calisma;
import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        int yas, tip, km;

        Scanner input = new Scanner(System.in);
        System.out.println("mesafeyi giriniz :");
        km = input.nextInt();
        System.out.println("yasinizi giriniz");
        yas = input.nextInt();
        System.out.println("Yolculuk tipinizi seciniz : (1 = Tek gidis, 2= Gidis/Dönüs)");
        tip = input.nextInt();

        double normalFiyat, yasIndirimi, gitgel, tipIndirimi, sonFiyat;

        if (km > 0 && yas > 0 && (tip == 1)) {
            normalFiyat = km * 0.10;
            if (yas < 12 && tip == 1) {
                yasIndirimi = normalFiyat * 0.5;
                tipIndirimi = 0;
            } else if (yas >= 12 && yas <= 24 && tip == 1) {
                yasIndirimi = (normalFiyat * 0.10);
                tipIndirimi = 0;
            } else if (yas >= 65 && tip == 1) {
                yasIndirimi = normalFiyat * 0.30;
                tipIndirimi = 0;
            } else {
                yasIndirimi = 0;
                tipIndirimi = 0;

            }
            sonFiyat = normalFiyat - (yasIndirimi + tipIndirimi);
            System.out.println(normalFiyat);
            System.out.println(yasIndirimi);
            System.out.println("son fiyat :" + sonFiyat);
        }

        if (km > 0 && yas > 0 && (tip == 2)) {
            normalFiyat = km * 0.10;
            if (yas < 12 && tip == 2) {
                yasIndirimi = normalFiyat * 0.5;
                tipIndirimi = (normalFiyat * 0.20) * 2;
            } else if (yas >= 12 && yas <= 24 && tip == 2) {
                yasIndirimi = (normalFiyat * 0.10);
                tipIndirimi = (normalFiyat * 0.20) * 2;
            } else if (yas >= 65 && tip == 2) {
                yasIndirimi = normalFiyat * 0.30;
                tipIndirimi = (normalFiyat * 0.20) * 2;
            } else if (tip == 2) {
                yasIndirimi = 0;
                tipIndirimi = (normalFiyat * 0.20) * 2;

            }




        } else {
            System.out.println("Yanlis islem");
        }

    }
}



