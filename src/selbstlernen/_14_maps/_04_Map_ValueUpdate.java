package selbstlernen._14_maps;

import java.util.Map;

public class _04_Map_ValueUpdate {
    /*
    Update :  guncelleme
    update yaparken key'lere gore yapmak lazim
    Value Update: Update istenen element’in key’i belli ise once value’sune ulasir, onda istenen degisikligi yapip
    yeniden ayni key ve yeni deger ile map’e ekleyebiliriz.

    Verilen Map'de sube ismi M olanlarin subesini N yapin
     */

    public static void main(String[] args) {

        Map<Integer, String> okulMap  = _03_MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);
        // {101=Ali-Cem-10-H-MF, 102=Veli-Can-10-M-TM, 103=Ali-Can-11-M-Soz, 104=Ayse-Cem-10-H-TM, 105=Ayse-Han-10-H-MF, 106=Veli-Han-10-H-MF}

        System.out.println(okulMap.get(101));
        okulMap.put(101, "Ali-Cem-10-M-MF"); // 101 numarali ogrenci zaten vardi. bu sefer bu geliyor diger 101 numarali gidiyor
        System.out.println(okulMap);
        // {101=Ali-Cem-10-M-MF, 102=Veli-Can-10-M-TM, 103=Ali-Can-11-M-Soz, 104=Ayse-Cem-10-H-TM, 105=Ayse-Han-10-H-MF, 106=Veli-Han-10-H-MF}

        okulMap.put(102,"Veli-Can-10-M-Soz"); // bu sefer de zaten olan numarali key den bira tane daha farkli olusturuyorum
        System.out.println(okulMap); // ilk 102 numarali value degerleri gidiyor yenisi geliyor
        // {101=Ali-Cem-10-M-MF, 102=Veli-Can-10-M-Soz, 103=Ali-Can-11-M-Soz, 104=Ayse-Cem-10-H-TM, 105=Ayse-Han-10-H-MF, 106=Veli-Han-10-H-MF}



        //6. return edilen yeni halini eski okulMap'e assign edelim
        okulMap =  _03_MapMethodDepo.topluSubeDegistirme(okulMap, "M", "N");
        System.out.println(okulMap);


    }
}
