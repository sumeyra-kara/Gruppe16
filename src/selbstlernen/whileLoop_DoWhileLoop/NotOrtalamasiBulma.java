package selbstlernen.whileLoop_DoWhileLoop;

import java.util.Scanner;

public class NotOrtalamasiBulma {
    public static void main(String[] args) {

        // bir ögretmenden not ortalamasi icin, notlari iste
        // ogretmen islemi bitirmek icin negartif bir sayi girmeli
        // ogretmen negatif sayi girdiginde toplam kac not girdigini,
        // not ortalamasinin kac oldugunu ve en yuksek notu yazdirin

        Scanner scanner = new Scanner(System.in);
        double not = 0;
        double toplam = 0;
        int sayac = 0;
        double enYuksekNot=0;

        while (not>=0){
            System.out.println("Lütfen ortalama icin notlari giriniz,\n islemi bitirmek icin negatif sayi giriniz");
            not = scanner.nextDouble();
            //

           if (not>=0){
               toplam+=not;
               sayac++;

               // en yuksek not icin her girilen notu o andaki en yuksek not ile karsilastir
               // ve girilen not, en yuksek nottan buyukse onu en yuksek not olarak ata
               if (not>enYuksekNot) enYuksekNot=not;
           }
        }

        System.out.println("not girilen ogrenci sayisi : "
                + sayac+"\nGirilen notlarin ortalamasi : " + toplam/sayac +
                "\nGirilen en yuksek Not : " + enYuksekNot);


    }
}
