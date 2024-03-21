package selbstlernen._14_maps;

import java.util.HashMap;
import java.util.Map;

public class _01_Maps_Giris {

    /*

    - Map key-value pairs(ikilileri) kullanir. Bu onceki objelere gore en buyuk farkidir.
    - Interfacedir.
      (Key'i tc numaran gibi dusun, Value'i ise o kisiye ait tum bilgiler olarak dusun)
    - Database yapisinda Java'ya en uygun yapidir
    - Her bir element icin bir Key bir de value vardir
    - Cok data turu  oluyor ama kompleks oluyor(islem sayisi coktur cunku) bu da dezavantajidir.
    - Tutulan data o kadar coksa, map icerisinde o bilgilere erisim de o kadar komplekstir.

    - Elementler key degerleri ile tutuldugundan, key’lerin unique(benzersiz) olmasi gerekir.
    - Value icin unique olma(benzersiz) mecburiyeti yoktur. Value String bir ifadeye eklenecek bir cok bilgiyi icerebilir
      ama map value olarak tek bir deger store eder

    - Map ile key ve value degerlerine ayri ayri method’lar ile ulasabiliriz
      Map ile yapacagimiz her seyi Map ile yapacagiz.
    - Map ile ayni ozelliklere sahip birden fazla objeyi store edebilirsiniz.
      Objelere ait ozellikleri value olarak kaydederiz. Sonradan bu ozelliklere ulasabilmek icin manipulation
      method’larini kullanacagimizdan, tum objelerin value’lari ayni ozellikleri ayni sira ile barindirmali,
      aralarinda kullanacagimiz ayirac da standart olmalidir.

    -  Bir cok bilgi iceren value’ler barindiran bir map’de istedigimiz bilgiye ulasmak icin
         1. mapismi.values( ) ile value’leri bir collection olarak kaydederiz
         2. for-each loop ile her bir value’yu ele alip
         3. split ile bilgileri birbirinden ayirir, istedigimiz bilgiye ayirdigimiz array’den ulasabiliriz

      a.size() ------- element sayisi
      a.keySet() ----- icindeki Key'leri yazdirma
      a.values() ----  tum value'lari yazdirir
      a.values().size() ---- value'lardaki element sayisi
      a.get(key) ------ o key'in values'sini bize verir


      HashMap : sirali olmaz yaszildigi gibi gelmez
      TreeMap : dogal siralamaya asc2 ye göre olur... Key'lere göre siralanirlar
      LinkedMap :  sirali olur. reihenfolge wichtig


     */

    public static void main(String[] args) {

        Map<Integer, String> okulMap = new HashMap<>();
        /*
        Bir Map olustururken ve element eklerken bilgilere sonradan erisimin sonradan mumkun olabilmesi icin tum
        elementlerin ayni bilgileri barindirdigindan ve ayni siralama ile element'e eklendiginden emin olmaliyiz
        */

        okulMap.put(101,"Ali, Cem, 10, H; MF");
        okulMap.put(102,"Veli, Can, 10, M; TM");
        okulMap.put(103,"Ali, Can, 11, M; Soz");
        okulMap.put(104,"Ayse, Cem, 10, H; TM");
        okulMap.put(105,"Ayse, HAN, 10, H; MF");
        okulMap.put(106,"Veli, Han, 10, H; MF");

        System.out.println(okulMap);
        // {101=Ali, Cem, 10, H; MF, 102=Veli, Can, 10, M; TM, 103=Ali, Can, 11, M; Soz, 104=Ayse, Cem, 10, H; TM,
        // 105=Ayse, HAN, 10, H; MF, 106=Veli, Han, 10, H; MF} ---tek sira halinde her sey yazdirilir

        // Map'te kac element var?
        System.out.println(okulMap.size()); // 6

        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106] --- tum Key'leri yazdirir
        System.out.println(okulMap.values()); // tum value'lari yazdirir
        // [Ali, Cem, 10, H; MF, Veli, Can, 10, M; TM, Ali, Can, 11, M; Soz, Ayse, Cem, 10, H; TM, Ayse, HAN, 10, H; MF, Veli, Han, 10, H; MF]


        //Value collection'u icinde kac element vardir? -- value'larin hepsi tek  elemanlidir
        System.out.println(okulMap.values().size()); // 6

        System.out.println(okulMap.get(101)); // 101.keydekinin value'sini verir

        System.out.println(okulMap.containsKey(102)); // true
        System.out.println(okulMap.containsValue("Veli, Can, 10, M; TM")); // true

        System.out.println(okulMap.putIfAbsent(106, "Veli, Han, 10, H; MF")); // eger aynisi zaten varsa bunu kullansak da degisiklik olmaz
        System.out.println(okulMap);

        System.out.println(okulMap.putIfAbsent(108, "Veli, Can, 10, H; MF")); // eger farkli bir sey eklenirse putt gibi listeye eklenir
        System.out.println(okulMap);


    }
}
