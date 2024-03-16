package selbstlernen.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _2_ArrayList_1 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // Bu poimorphism ornegidir
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(null);

        System.out.println(list); // [10, 1, 4, 5, null]

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // sirayla elemanlari yazdirir
        }

        for (Integer element : list){
            System.out.println(element); // ayni islem sirayla yazdirir
        }
        System.out.println("************");
        System.out.println(list.size()); // 5
        System.out.println(list.get(1)); // 1-- 1.indeksteki eleman
        System.out.println(list.get(3)); // 5

        System.out.println(list.indexOf(4)); // 4'un indeksini verir
        // eger tek varsa ilkinin indeksini verir

        list.add(1);
        list.add(4);
        list.add(5);
        list.add(1);
        System.out.println(list); // [10, 1, 4, 5, null, 1, 4, 5, 1]
        System.out.println(list.indexOf(5)); //5'in ilk indeksini verir
        System.out.println(list.lastIndexOf(5)); // 5'in sonuncu indeksini verir
        System.out.println(list.lastIndexOf(2)); // olmayan sayinin indeksi de -1'dir

        list.add(2,100); // 2.indekse 100 atiyorum digerleri kayiyior
        System.out.println(list); // [10, 1, 100, 4, 5, null, 1, 4, 5, 1]

        list.set(1, 50); // 1.indeksteki elementi silip o element yerine 100'ü koyuyuor
        System.out.println(list); // [10, 50, 100, 4, 5, null, 1, 4, 5, 1]

        System.out.println(list.contains(10)); // true-- icinde 10 var mi diye bakar
        list.remove(1); // 1.indeksteki degeri siliyor- burada onu gösterir
        System.out.println(list); // [10, 100, 4, 5, null, 1, 4, 5, 1]

        List<Integer> list2 = new ArrayList<>();
        list2.add(90);
        list2.addAll(list);
        System.out.println(list2); // [90, 10, 100, 4, 5, null, 1, 4, 5, 1]


        // Listenin altList'lerini de alabiliriz
        List<Integer> list3 = list2.subList(2,4);
        System.out.println(list3); // [100, 4]

       Object [] objectArray = list3.toArray();
        System.out.println(Arrays.toString(objectArray)); // [100, 4]

        list3.clear(); // tamamen listeyi siler


    }
}
