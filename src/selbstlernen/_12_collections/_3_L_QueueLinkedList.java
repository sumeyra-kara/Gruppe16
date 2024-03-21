package selbstlernen._12_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _3_L_QueueLinkedList {
    public static void main(String[] args) {

        /*
        - Queue kuyruk demek ilk giren ilk cikar FIFO-- Lifo yapisi da kullanilir
        - Ilk giren ilk cikiyor mantigi

         */
        Queue<String> q = new LinkedList<>(); // bu polimorphism
        q.add("Mustafa");
        q.add("Sümeyra");
        System.out.println(q); // [Mustafa, Sümeyra]



        Iterator<String> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // Mustafa    Sümeyra
        }

        q.offer("Veli");
        System.out.println(q); // [Mustafa, Sümeyra, Veli]
        System.out.println(q.remove("Mustafa"));
        System.out.println(q); // [Sümeyra, Veli]
        q.remove(); // icine herhangi bir deger vermezsem de listenin basindaki elementi siler
        System.out.println(q); // [Veli]
        q.add("Kara");
        q.add("Fenerbahce");
        System.out.println(q); // [Veli, Kara, Fenerbahce]
        System.out.println(q.element()); // Veli --- ilk elementi silmeden yazdirir
        q.poll(); // listenin basindaki elementi alir ve diziden siler
        System.out.println(q); // [Kara, Fenerbahce]

        System.out.println(q.peek()); // ilk elementi verir



    }
}
