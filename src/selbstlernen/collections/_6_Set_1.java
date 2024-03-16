package selbstlernen.collections;

import java.util.Set;
import java.util.TreeSet;

public class _6_Set_1 {
    public static void main(String[] args) {
        /*
        - Bir veri o liste icersinde birden fazla olamaz
        - Küme mantigi ile calisir
        - Set tüm elementlerin unique oldugu collection'dur.
        - Siralamaya bakmaz, index yapisini desteklemez
        - Eger siralama onemli ise SortedSet interface'i altindaki TreeSet class'i kullanilabilir.
          TreeSet siralama yaptigi icin digerlerine göre daha yavas calisir
          Dogal siralama ise TreeSet, Hash koduna göre olursa HashSet(daha hizli olsun istersek).

         */

        Set<String> ogrenciler = new TreeSet<>(); // natural ordner
        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");
        System.out.println(ogrenciler); // [Burcu, Duygu, Emre, Kerem] --dogal olarak siralar(ekleme sirasina göre degil)

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); // [Ahmet, Burcu, Duygu, Emre, Kerem]
        ogrenciler.add("Kerem");
        System.out.println(ogrenciler); // [Ahmet, Burcu, Duygu, Emre, Kerem]
        // yeni kerem ekledigimizde eskiyi silip yenisini ekler


    }
}
