package selbstlernen._14_maps;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class _11_TreeMapMethodlari {
    /*
    treeMapismi.higherKey(key) : Verilen key’den buyuk olan ilk key’i döndürür.

    treeMapismi.higherEntry(key) : Verilen key’den buyuk olan ilk key’e ait entry’yi döndürür.
    treeMapismi.lowerKey(key) : Verilen key’den kucuk olan ilk key’i döndürür.
    treeMapismi.lowerEntry(key) : Verilen key’den kucuk olan ilk key’e ait entry’yi döndürür.
    treeMapismi.headMap(key ) : verilen key exclusive olarak oncesindeki entry’leri verir
    treeMapismi.headMap(key, true ) : verilen key inclusive olarak oncesindeki entry’leri verir
    treeMapismi.descendingMap( ) : gecici olarak tree map’i descending siralar.
    treeMapismi.pollFirstEntry( ) :
    treeMapismi.pollLastEntry( ) : istenen entry’yi silip, bize döndürür.
    treeMapismi.ceilingKey(key) : verilen key treeMap’de varsa, o key’i, verilen key
                                  treeMap’de yoksa verilen key’den buyuk olan ilk key’i döndürür.
    treeMapismi.ceilingEntry(key) : verilen key treeMap’de varsa, o key’e ait entry’yi, verilen
                key treeMap’de yoksa, verilen key’den buyuk olan ilk key’e ait entry’yi döndürür.
                Eger verilen key treeMap’de yoksa ve girilen key degerinden buyuk baska key yoksa null döndürür.
    treeMapismi.floorKey(key) / treeMapismi.floorEntry(key) : verilen key treeMap’de yoksa
        verilen key’den kucuk olan ilk key’I döndürür.

    treeMapismi.ceilingKey(key) : verilen key treeMap’de varsa, o  key’i, verilen key treeMap’de
                            yoksa verilen key’den buyuk olan ilk key’I döndürür.

    treeMapismi.ceilingEntry(key) : verilen key treeMap’de varsa, o key’e ait entry’yi, verilen key treeMap’de yoksa,
                                    verilen key’den buyuk olan ilk key’e ait entry’yi döndürür.
                         Eger verilen key treeMap’de yoksa ve girilen key degerinden buyuk baska key yoksa null döndürür.


     */

    // yavastir, dogal siralidir

    public static void main(String[] args) {

        TreeMap<String ,Integer> deneme = new TreeMap<>();

        deneme.put("F",20);
        deneme.put("T",30);
        deneme.put("A",10);
        deneme.put("M",25);
        deneme.put("Z",30);

        System.out.println(deneme); // {A=10, F=20, M=25, T=30, Z=30}

        System.out.println(deneme.tailMap("F")); // {F=20, M=25, T=30, Z=30} -- F'den baslayip sonuna kadar yazdirir
        System.out.println(deneme.tailMap("C")); // {F=20, M=25, T=30, Z=30} --
        // C olsaydi nereden baslayip verecek diye dusunup orayi verir

        System.out.println(deneme.tailMap("O")); // {T=30, Z=30} --- eger O olsaydi nerde olacaksa oradan baslayip yazdirir

        // Vrasa verilen key'den baslayip sona kadar döndürür
        // eger verilen key yoksa, olsadi nerede olurdu onu bulup oradan baslayip yazdirir

        System.out.println(deneme.tailMap("M",false)); //{T=30, Z=30}-- M'yi dahil etmeden ondan itibaren yazdirir

        // Javada baslangic degerleri inklusiv'dir, eger tail alirken verdigimiz baslangic key'inin dahil olmasini
        // istemezsek false parametresi yazabiliriz

        System.out.println(deneme.headMap("M")); // {T=30, Z=30} bu sefer M'den basa dogru ama M haric
        System.out.println(deneme.headMap("O")); // {A=10, F=20, M=25} -- O var gibi dusunup geriye dogru yazdirir
        System.out.println(deneme.headMap("T", true)); // {A=10, F=20, M=25, T=30} - buu sefer de T ve oncesi
        // yani geriye dogru yazdirir ama kendisini de yazdirir

        System.out.println(deneme.pollLastEntry()); // Z=30 -- son entry'i döndürür
        System.out.println(deneme); // {A=10, F=20, M=25, T=30} -- silip geri kalanlari yazdirir

        System.out.println(deneme.pollFirstEntry()); // A=10 -- ilk entry'i döndürür
        System.out.println(deneme); //{F=20, M=25, T=30} -- silip geri kalanlari dondurur
        // ilk veya son entry'i silip, sildigi entry'i bize döndürür


        System.out.println(deneme.higherKey("M")); // T---- M'den sonraki Key'i döndurur
        System.out.println(deneme.higherKey("C")); // F -  C olsaydi nerde olurdu ondan sonrakini yazdirir
        System.out.println(deneme.higherEntry("F")); // M=25- verilen key'den sonraki ilk key/entry'i yazdirir

        System.out.println(deneme.lowerKey("M")); // F --- M'den bir onceki key'i verir
        System.out.println(deneme.lowerKey("Y")); // T
        System.out.println(deneme.lowerEntry("K")); //F=20 --K'den bir onceki key-value'yi verir

        System.out.println(deneme.floorKey("M")); // M --- M'den asagi yuvarla ama M de dahil oldugu icin M dondurur
        System.out.println(deneme.floorKey("K")); // F -- olamayan key'i asagi yuvarla en yakin olani

        System.out.println(deneme.ceilingKey("K")); // M -- K'den sonra en yakin olan
        System.out.println(deneme.ceilingKey("T")); // T -- T'den sonraen yakin olan. kendisi old. icin kendisini yazdirir
        // ceiling tavan, floor taban demek
        // Higher ve lower'Den farklari buyukesit, kucukesi gini dusunulmelidir


        System.out.println(deneme.descendingMap()); // {T=30, M=25, F=20}  gecici olarak tree map’i descending siralar
        // buyukten kucuge siralar

        System.out.println(deneme.subMap("K", "O")); // {M=25}
        System.out.println(deneme.subMap("F","O")); // {F=20, M=25}
        System.out.println(deneme.subMap("F","M")); // {F=20}

        // baslangic key inklusiv, bitis key exklusive olarak aralarindaki entryleri yazdirir(basini alir sonunu almaz)




    }
}
