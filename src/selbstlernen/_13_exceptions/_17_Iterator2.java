package selbstlernen._13_exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _17_Iterator2 {
    public static void main(String[] args) {

        /*
        Iterator veya ListIterator kullanirken dikkat etmemiz gereken en onemli  konu, iterator’un nerede oldugu ve
        nasil hareket ettirilecegidir.



         */


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(4);
        // cift olan sayilari silelim mesela

        Iterator it1 = sayilar.iterator();


        while (it1.hasNext()){ // yaninda birisi var mi diye soruyor.varsa ilerle
            Integer sayi =(Integer) it1.next(); // burada objeyi integer'a casting yaptik.öyle gerekti cunku.

            if (sayi%2==0){
                it1.remove(); // cift bulunca sil
            }
        }

        System.out.println(sayilar);


    }
}
