package selbstlernen._04_metotlar;

import java.util.Scanner;

public class PozitifTamBölenleriYazdir {
    public static void main(String[] args) {
        //soru : Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri yanyana yazdiran bir method olusturun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        pozitifBölenleriYazdir(sayi); // variable ismi olabilir

        pozitifBölenleriYazdir( 640); // direkt sayi  olabilir
                                            // argument---bunlari methodu kullanmak icindir ikisi de
        // eger int iken int yazmazsak kabul etmez
        // pozitifBölenleriYazdir(67,99); bu gibi --- veya icin etrue yazamam cunku int olmali
        pozitifBölenleriYazdir('z'); // bu olur cunku asc2 ye gore sayi olacak sonuc
        // method call'da kullanilan argument ile parametreler uyumlu olmalidir.yoksa kod calismaz. CTE olusur

    }

    public static void pozitifBölenleriYazdir (int sayi){ // 1 tane parametre var. parantez ici

        for (int i = 1; i <= sayi; i++) {

            if (sayi%i == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println(" ");
    }


}
