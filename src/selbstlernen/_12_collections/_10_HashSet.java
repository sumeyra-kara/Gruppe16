package selbstlernen._12_collections;

import java.util.*;

public class _10_HashSet {
    public static void main(String[] args) {


        // HashSet ler eklendigi gibi yazdirilmayabilir rastgele cikiyor

        Set<String > set1 = new HashSet<>();

        set1.add("Kadir");
        set1.add("Yusuf");
        set1.add("Süleyman");
        set1.add("Emre");
        set1.add("Duygu");
        set1.add(null);
        System.out.println(set1); // null, Duygu, Süleyman, Yusuf, Kadir, Emre] --- rastegele sekilde verdi

        for (String s : set1){
            System.out.println(s); // sirayla elemanlari yazdirir
        }

        set1.add("Emre");
        System.out.println(set1); // [null, Duygu, Süleyman, Yusuf, Kadir, Emre]-- eski Emre'yi silip yenisini ekliyor

        System.out.println(set1.contains("Yusuf")); // true -- icinde Yusuf var mi
        System.out.println(set1.size()); // 6 -- Boyutunu verir
        System.out.println(set1.isEmpty()); // False -- bos mu? hayir

        System.out.println("***************");


        HashSet<Integer> hashSet  = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(30); // sadece interger degeri atayabilirim
        System.out.println(hashSet); // [20, 10, 30]
        // hashSet.add(null); bu sekilde null da ekleyebiliriz
        System.out.println(hashSet.size()); // 3
        System.out.println(hashSet.isEmpty()); // false-- bos mu degil mi
        System.out.println(hashSet.contains(20)); // true --- 20 sayisi listede var mi
        hashSet.remove(10); // true --- yani listeden 10'u silecegim demek icinde var cunku
        System.out.println(hashSet); // [20, 30] -- listeden siliyor
        // hashSet.clear(); --- komple siliyor

        System.out.println("***********");


        // 2 SEKILDE ELEMANLAR YAZDIRILIR FOR VE ITERATOR
        for (Integer sayi : hashSet){
            System.out.println(sayi); // elemanlari yazdirir   20   10   30
        }


        Iterator<Integer> itr = hashSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next()); // 20   10   30--
        }
        Iterator<Integer> itrtr = hashSet.iterator();
        // calisma mantiklari : iterator her zaman bir sonraki var mi diye bakar
        // has.next() var mi yani sonraki eleman  var mi diye bakar varsa true yoksa false döndürür
        // iterater next methodu ise bir sonraki elementi getirir bize-- geziniyor yani
        // itr.next() diyince bizi bir sonnraki objeye dondurur


        /*
        Digeri ise Linked HashSet'tir. bu HashSet'lerin bir altindaki class'tir
        HashSet'lerin tum özelliklerini alir böylece.

        Tek fark: HashSet'lerde ekledigimiz sirayla bize yazdirma garantisi yoktur ama Linked HashSetlerde
        bunu saglayabiliriz. girilen sekilde sonuc verir.
        Cift baglantili bir liste
        16 boyutlu kapasitesi var


         */
        System.out.println("*********************");

        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(10);
        lSet.add(20);
        lSet.add(30);
        System.out.println(lSet); // [10, 20, 30] --- girilen siraya göre yazdirir

        Iterator<Integer> itr4 = lSet.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next()); // 10   20   30
        }








    }
}
