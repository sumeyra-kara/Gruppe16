package selbstlernen._14_maps;

import java.util.Map;

public class _06_EntrySet {

    /*
    - Entry (Interface):
    - Bir map’deki key ve value ikililerini birlikte kullanmak istedigimizde Entry interface’indeki method’lari kullaniriz.
      Hem Key'i hem de Value'u alir.

    - mapIsmi.entrySet( ) method’u entry’lerden olusan bir Set döndürür.

    - entry’ler map’deki data turunde olan key ve value’ler icerir. Entry’leri kaydetmek icin  data turlerine dikkat ederek,
      eentry’lerden olusan bir Set olusturmaliyiz..

      Set<Map.Entry<Integer, String>> EntrySeti = ogrencimap.entrySet();
      entry’lerden olusan bu set’i for-each loop ile istedigimiz gibi isleyebiliriz.

    - Entry interface’indeki getKey( ) ve getValue( ) method’lari ile entry’leri yandaki gibi yazdirabilir veya
      degistirdigimiz value’lari setValue(yeniDeger) method’unu kullanarak update edebiliriz.

      !!! AVANTAJI : setValue methodunu kullanarak biz value'lari direkt set edebiliriz

     */

    //  istenen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdirin
    public static void main(String[] args) {
        /*
        Daha önceki yontemlerle yapacak olsaydik,
        1. once map'taki tum key'lari okulMap.keyset() methodu ile elde edip bir Set'e kaydederiz
        2. sonra for each loop ile her bir Key'e ait value'i aliriz
           -value.split ile value'i bir arry'e cevirip kaydederiz.
           -sonra bu array'de sinifi kontrol edeip,eger istenen sinifa esit ise o zaman
             key ve value array'indan istenen bilgileri yazdiririm

         Java key ve value degerleri birlikte kullanabilsin ve gerekirse value update edilebilsin diye
         Entry interface'ini olusturmustur.



         */

        Map<Integer, String> okulMap = _03_MapMethodDepo.ornekMapOlustur();

        System.out.println(okulMap);
        //{101=Ali-Cem-10-H-MF, 102=Veli-Can-10-M-TM, 103=Ali-Can-11-M-Soz,
        // 104=Ayse-Cem-10-H-TM, 105=Ayse-Han-10-H-MF, 106=Veli-Han-10-H-MF}


        _03_MapMethodDepo.sinifaGoreyazdir(okulMap,10);



    }


}
