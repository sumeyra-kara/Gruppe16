package selbstlernen.metotlar;

import java.util.Scanner;

public class Method2_TamBolenSayisi {
    public static void main(String[] args) {

        // soru : Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(pozitifTamBolenSayisi(sayi));


    }

    public static int pozitifTamBolenSayisi (int sayi) {

        int sayac = 0;

        for (int i = 1; i <= sayi ; i++) {

            if (sayi % i == 0){
                sayac++;
            }

        }

        return sayac;

    }
}
