package selbstlernen._14_maps;

import java.util.Map;

public class _05_Map_ValueUpdate_2 {
    // Verilen okul map'inda ogrencilerin siniflarini bir arttirin, eger 12. sinif ögrenci varsa
    // sinif bilgisi olarak mezun yazdirin

    // eger update varsa, key ve value birlikte dusunulmelidir.
    // ayni key ile yeni value'yu map'e ekledigimizde key unique olacagi icin
    // eski value'yi update edip yeni value degerini kaydeder

    public static void main(String[] args) {
        Map<Integer, String> okulMap  = _03_MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);
        okulMap = _03_MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
        System.out.println(okulMap);
        System.out.println("*******+");


    }


}
