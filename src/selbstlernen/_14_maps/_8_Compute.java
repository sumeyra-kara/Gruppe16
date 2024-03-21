package selbstlernen._14_maps;

import java.util.Map;
import java.util.TreeMap;

public class _8_Compute {

    /*
    a.get(keyismi) : verilen key varsa valuesunu dondurur yoksa NULL dondurur

    getOrDefault : M( verilen key) varsa degerini yazdirir, yoksa 60(default-yeni deger) olarak yazdirir

    a.put("A",20); :  ekleme yapiyor.  Istenen key ve value’ye sahip elementi map’e ekler.



    a.replace("M", 50) :  (a.replace(key,yeniDeger)) Verilen key varsa degerini update eder ve eski degerini dondurur.
                                     ama tekrar dondurdugumuzde eskiyi siler yeni value degerini alir
    a.replace("T", 30, 90)); eger Key'i T, Value'si 30 olan varsa true dondurur (boolean)
                                    tekrar yadirdihimizda da T key'inin yeni values degeri 90 olur
    a.containsKey("T");  : Keylerin icinde o verilen key var mi diye bakar. mapismi.containsKey(key) :
                            istenen key map’de varsa true, yoksa false döndürür

   a.containsValue(value) : istenen value map’de varsa true, yoksa false döndürür

    a.putIfAbsent("B",50); :  B yoksa value'yi 50 yap. Eklenmek istenen key ve value map’de daha onceden mevcut ise
                             ekleme yapmaz, map’de yoksa ekleme yapabilir

    a.computeIfPresent(eachHarf,(k,v) -> v+1); :  eger o key varsa value'yi bir arttirir mesela. eger yoksa islem yapmaz

    a.computeIfAbsent("B", v -> 50 ); // yukaridaki ile aynidir eger b yoksa valuesi 50 olacak sekilde olustur

    mapismi.compute(key, (k,v)->yeni deger) : istenen key’e sahip elementin value’sunu hesaplama veya
                                              atama yontemiyle update eder.



     */
    public static void main(String[] args) {
        // Verilen bir Srtring Array'inda herbir harfin kacar defa kullanildigini yazdirin.
        // output :  A=3, B=1, C=1, N=2

        String [] arr = {"A","C","B","N","A","N","A"};
        Map<String ,Integer> kullanimMiktari = new TreeMap<>();

        // contains() kullanarak yapalim
        //arr'deki herbir elementi ele alalim
        for (String each : arr){
            // eger ele aldigim eleman map'de yoksa map'e element 1 eklerim

            if (!kullanimMiktari.containsKey(each)){
                System.out.println(kullanimMiktari.put(each, 1));
            } else {
                // yani o elemenet daha once map'de varsa o zaman value 1 arttirmamiz lazim

                int elementinEskiKullanimMiktari = kullanimMiktari.get(each);
                kullanimMiktari.put(each,elementinEskiKullanimMiktari+1);
            }

        }
        System.out.println(kullanimMiktari);
        System.out.println("**********************************************++");

        // Kolay Yol : Ayni islemi comput methodlari kullanarak yapabiliriz
        Map<String, Integer> kullanim2 = new TreeMap<>();

        for (String eachHarf : arr){

            // yani o elemenet daha once map'de varsa o zaman value 1 arttirmamiz lazim
            kullanim2.computeIfPresent(eachHarf,(k,v) -> v+1); // bende key ve value var, value'yi bir arttir

            // eger ele aldigim eleman map'de yoksa map'e element 1 eklerim
            kullanim2.putIfAbsent(eachHarf,1); // eger yoksa demek
        }

        System.out.println(kullanim2);


    }
}
