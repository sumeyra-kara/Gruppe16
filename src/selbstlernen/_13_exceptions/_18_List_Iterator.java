package selbstlernen._13_exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _18_List_Iterator {
    // bu itratordan farfklidir. List Iteratordur. Methodlari daha fazladir

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(4);
        // tum elementleri indeks kullanmadan 3 arttir


        ListIterator list = sayilar.listIterator();

        while (list.hasNext()){
            int sayi = (Integer) list.next();

            list.set(sayi+3);
        }

        System.out.println(sayilar); // [5, 4, 8, 9, 7]
    }
}
