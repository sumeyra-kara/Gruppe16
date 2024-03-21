package selbstlernen._14_maps;

import java.util.Map;

public class _02_Maps_2 {
    public static void main(String[] args) {

        Map<Integer, String> okulMap =_03_MapMethodDepo.ornekMapOlustur(); // sagdan method geliyor ve kaydediyoruz
        // yapilan eklenen seyler diger okulMap icin degil, bu classtaki okulMap'de olur

        okulMap.put(110,"Kerem-Umut-12-K-MF");
        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106, 110] --- 110 buradan eklenir

        System.out.println(okulMap.values()); // Value'lari yazdirmak icin
        // [Ali-Cem-10-H-MF, Veli-Can-10-M-TM, Ali-Can-11-M-Soz, Ayse-Cem-10-H-TM, Ayse-Han-10-H-MF, Veli-Han-10-H-MF, Kerem-Umut-12-K-MF]

        // Verilen sube'deki ögrencilerin sinif isim ve soyisimlerini basta sira olacak sekilde
        // her satirda bir ismin olacagi bir liste olarak yazdirin

        /*
        Ali-Cem-10-H-MF,
        Veli-Can-10-M-TM,
        Ali-Can-11-M-Soz,
        Ayse-Cem-10-H-TM,
        Ayse-Han-10-H-MF,
        Veli-Han-10-H-MF,
        Kerem-Umut-12-K-MF
         */


        _03_MapMethodDepo.subeOgrenciListesiYazdir(okulMap, "H");


    }
}
