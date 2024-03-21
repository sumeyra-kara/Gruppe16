package selbstlernen._14_maps;

import tage.tag47.Kreis;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _03_MapMethodDepo {

    public static Map<Integer, String> ornekMapOlustur (){

        Map<Integer, String> okulMap = new HashMap<>();

        okulMap.put(101,"Ali-Cem-10-H-MF");
        okulMap.put(102,"Veli-Can-10-M-TM");
        okulMap.put(103,"Ali-Can-11-M-Soz");
        okulMap.put(104,"Ayse-Cem-10-H-TM");
        okulMap.put(105,"Ayse-Han-10-H-MF");
        okulMap.put(106,"Veli-Han-10-H-MF");

        return okulMap;
    }

    public static void subeOgrenciListesiYazdir(Map<Integer, String> okulMap, String istenenSube) {
        // 1- Value'lari ayri bir collection olarak kaydedelim

         Collection<String> valueCollection = okulMap.values();

        //2- sonra her bir value'yi split ile bir Array'e dönusturelim

        System.out.println("==== Sube listesi ====");
        System.out.println("Sira   Sinif    Isim   Soyisim");

        int siraNo=1;
        for (String eachValue : valueCollection){
            // Ali-Cem-10-H-MF
            String [] valueArr= eachValue.split("-"); // [Ali, Cem, 10, H, MF]- array oluyor ilk dongude mesela

            // 3- sonra array'demn subeyi kontrol edip eger istenen sube ise ogrencinin sinif isim ve soyismini yazdiralim

            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(siraNo+ " - " + valueArr[2] + ", " + valueArr[0] + ", " + valueArr[1]);
                siraNo++;
            }
        }

    }


    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {

        //1. once value'leri bir Set olarak kaydedelim

        Set<Integer> okulKeySeti = okulMap.keySet(); // [101, 102, 103, 104, 105, 106]

        for (Integer eachKey : okulKeySeti){
            //2. her bir key'e ait value'yu split ile array'e donusturelim

            String [] valueArr= okulMap.get(eachKey).split("-"); // [Ali, Cem, 10, H, MF] mesela ilk dongude

            //3. sube bilgisi eskiSube olanlari yeniSube yapalim

            if (valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[3] = yeniSube;
            }

            //4. array'deki bilgileri birlestirerek yeniden map'e ekleyelim


            String yeniValue = "";
            for (int i = 0; i < valueArr.length-1 ; i++) {
                yeniValue+=valueArr[i] + "-";

            }
            yeniValue+= valueArr[valueArr.length-1];

            okulMap.put(eachKey, yeniValue);


        }


        //5. okulMap'inin son halini return yapalim

        return okulMap;

    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer, String> okulMap) {

        //1- keyleri bir Set olarak kaydedelim

        Set<Integer> keySeti  =okulMap.keySet();
        //2- Set'deki herbir key'e ait value'i for-each loop ile ele alalim

        for (Integer eachKey : keySeti){

            //3- her key'e ait value'yu split() ile ayirip, array olarak kaydedelim
            String [] valueArr = okulMap.get(eachKey).split("-");

            //4- array olarak kaydettigimiz bilgilerde istenen update'i yapalim

            if (valueArr[2].equalsIgnoreCase("12")){
                valueArr[2]= "Mezun";
            } else { // "9"  "10" "11" ihtimalleri var

                int sinif  =Integer.parseInt(valueArr[2]); // string'i int yaptik burada
                sinif++;

                valueArr[2]  = sinif + "";
            }

            //5- array'in yeni halini String olarak birlestirip yeniValue elde edelim

            String yeniValue  ="";

            for (int i = 0; i < valueArr.length-1; i++) {

                yeniValue += valueArr[i] + "-";

            }

            yeniValue += valueArr[valueArr.length-1];
            //6- herbir key ve yeniValue'yu map'e ekleyerek map'i update edelim

            okulMap.put(eachKey,yeniValue);
        }

        return okulMap;

        //7- map'in yeni halini return edelim
    }

    public static void sinifaGoreyazdir(Map<Integer, String> okulMap, int istenenSinif) {

        // 1. okul map'deki entry'leri kaydedelim
        Set<Map.Entry<Integer,String>> okulEntryset= okulMap.entrySet();

        //2. her biri entry'i ele alip istenen islemi yaptiralim

        for (Map.Entry<Integer,String> eachEntry : okulEntryset){

            String value = eachEntry.getValue();
            String [] valueArr = value.split("-");

            if (valueArr[2].equals(istenenSinif + "")){
                System.out.print(eachEntry.getKey()+ " "); // bu no icin
                System.out.print(valueArr[0] + " " + valueArr[1] + " " + valueArr[4]);
                System.out.println("");

            }
        }
    }

    public static Map<Integer,String> soyIsimleriBuyukYap(Map<Integer, String> okulMap) {

        // Entry'ler ile vozelim

        Set<Map.Entry<Integer,String>> okulEntrySeti =okulMap.entrySet();

        // her bir entr'yi elden gecirip, sadece soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer, String> eachEntry : okulEntrySeti){

            // her bir entry'deki value'yi alalim
            String value  = eachEntry.getValue();

            //value'i Array'e cevirelim
            String [] valueArr = value.split("-");

            // array icindeki soyismi buyuk harf yapalim
            valueArr[1]= valueArr[1].toUpperCase();

            eachEntry.setValue(valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]);


        }
        return okulMap;

    }
}
