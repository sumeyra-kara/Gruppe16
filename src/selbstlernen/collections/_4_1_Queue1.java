package selbstlernen.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _4_1_Queue1 {

    /*
    - Temel özelligi FIFO(First in First out) kuraliidr. Sirayla olusturulur.
    - Queue bir Interface oldugu icin obje olusturmak mumkun degildir.
    - Queue özelliklerine sahip bir obje olusturmak icin PriorityQueue veya LinkedList class'larindan
      constructor kullanilmalidir.

    - PriorotyQueue Java'nin belirlemis oldugu bir oncelige göre sirlama yapar, LinkedList ise ekleme
      sirasina göre bir list olusturur.



     */
    public static void main(String[] args) {
        Queue<String> harfler = new LinkedList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("A");

        System.out.println(harfler); // [A, B, C, A]
        // 2. indekse D ekleyelim
        // Queue özelliginden dolayi (indeksini secerek ekleyemez) her zaman sadece sona ekler

        System.out.println(harfler.remove()); // A --bu sekilde ilk gördugu elementi siliyor
        System.out.println(harfler); // [B, C, A]
        harfler.remove(); // ilk gördugunu siliyor yani B'yi
        System.out.println(harfler); //[C, A]
        harfler.add("K");
        harfler.add("L");
        System.out.println(harfler); //[C, A, K, L]
        System.out.println(harfler.element()); // C -- ilk elementi silmeden bize yazdirir
        System.out.println(harfler); //[C, A, K, L]
        System.out.println(harfler.peek()); // C --- ilk elementi silmeden bize yazdirir
        System.out.println(harfler); //[C, A, K, L]

        // yani element ile peek methodu ayni isi yapar yani ilk elementi dondurur
        // eger bossa element methodu Exception NoSuchElementException, peek methodu ise NULL dondurur tek farki budur

        System.out.println(harfler.poll()); // C --ilk elemani yazdirir ama sonra listeden siler
        System.out.println(harfler); // [A, K, L]

        // poll ve remove de ikisi de ilk elementi siler ve bize dondurur. tek fark
        // Bos bir queue icin poll NULL, remove ise EXCEPTION sonucunu verir


        Queue<String > karakterler = new LinkedList<>();
        System.out.println(karakterler.peek()); // null
       // System.out.println(karakterler.element()); // Exception NoSuchElementException hatasi verir
        System.out.println(karakterler.poll()); // null-- bos oldugu icin null döndurur

        System.out.println(karakterler.offer("A")); // true----A' yi listenin sonuna ekliyoruz. islemi yapiyor
        System.out.println(karakterler); // [A]
        // add methoduna benziyor ama offer kapasite sinirlamasina bakar, add ise kapasite sinirlamasina bakmaz.
        // eger kapasite sinirlamasi varsa add yerine offer tercih edilmelidir


        Queue<String> queue = new PriorityQueue<>();
        queue.add("AA");
        queue.add("BB");
        queue.add("CC");
        queue.add("DD");
        queue.add("EE");
        System.out.println(queue.size());

        System.out.println(queue); // [AA, BB, CC, DD, EE]
        queue.poll();
        System.out.println(queue); // [BB, DD, CC, EE] ---ilk elementi siler

        queue.offer("FF");
        System.out.println(queue); // [BB, DD, CC, EE, FF]


    }


}
