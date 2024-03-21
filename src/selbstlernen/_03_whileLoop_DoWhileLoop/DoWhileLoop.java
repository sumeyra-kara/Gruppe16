package selbstlernen._03_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        // while loop'ta parantez icinde kontrol edilen degiskene biz loop'tan önce deger atiyoruz
        // eger bu degiskene uygun olmayan deger atamasi yaparsak looop hic calismaz
        // java bu durumun önune gecmek icin yani kontrolu kullanicidan deger aldiktan sonra
        //yapabilmemiz icin do while loop olusturmustur
        //do while loop kullanidiginda loop body'sinin calismama ihtimali yok.en az 1 kez calisir
        // ama hic calismamasi gereken durumda da 1 kez yapiyor
        // cunku hic kontrol etmeden en basta yapiyor



        // bir ögretmenden not ortalamasi icin, notlari iste
        // ogretmen islemi bitirmek icin negatif bir sayi girmeli
        // ogretmen negatif sayi girdiginde toplam kac not girdigini,
        // not ortalamasinin kac oldugunu yazdirin

        // hem while looop hem de do while loop ile yapalim

        Scanner scanner = new Scanner(System.in);
        double not = 0;
        double toplam = 0;
        int sayac = 0;

        /*while (not>=0){

            System.out.println("ortalama icin notlari giriniz\n bitirmek icin negatif sayi giriniz");

            not = scanner.nextDouble();

            if (not>=0){
                toplam+= not;
                sayac++;
            }
        }

         */

        do {
            System.out.println("ortalama icin notlari giriniz\n bitirmek icin negatif sayi giriniz");

            not = scanner.nextDouble();

            if (not>=0) {
                toplam += not;
                sayac++;
            }

        } while ( not>=0);

        System.out.println("girilen not sayisi : " + sayac + " \ngirilen notlarin ortalamasi : " +  toplam/sayac );

    }
}
