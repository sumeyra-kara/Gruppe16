package selbstlernen.collections;

import java.util.Deque;
import java.util.LinkedList;

public class _5_Deque_1 {

    public static void main(String[] args) {
        /* Cift tarafli kuyruk demektir (Double ended queue)
        - Deque, bir Interface'Dir. Obje olusturamayiz.
        - Ekleme ve silme iki taraftan da bastan ve sondan yapilabilir
        - Queue'da FIFO gecerli iken, Deque'de hem FIFO hem de LIFO gecerlidir
        - NOT: deque null element kabul ETMEZ



         */

        Deque<String> harfler = new LinkedList<>();
        harfler.add("J");
        harfler.add("K");
        System.out.println(harfler); // [J, K]

        harfler.addFirst("B"); // ilk element olarak B'yi ekleme
        System.out.println(harfler); // [B, J, K]

        System.out.println(harfler.remove()); // B--ilk elementi silmek istiyoruz. ilk elementi bulur yazdirir
        System.out.println(harfler); // [J, K] -- sonra ilk eleenti siler

        harfler.addFirst("T"); // ilk element olarak T'yi ekle
        harfler.addLast("T");// son element olarak T'yi ekle
        harfler.add("L"); // aslinda add ile addlast ayni islevi görür ikisi de sona ekler cünkü
        System.out.println(harfler); // [T, J, K, T, L]
        System.out.println(harfler.removeLastOccurrence("T")); // true- T'varsa sil varsa true doner
        System.out.println(harfler); // [T, J, K, L] -- son gördugu t'yi siliyor
        System.out.println(harfler.removeFirstOccurrence("R")); // false. cunku silecek R yok
        System.out.println(harfler); // [T, J, K, L]

        System.out.println(harfler.peekFirst()); // T -- ilk harfi gosteriyor- o harfi kaldirmaz
        System.out.println(harfler.peekLast()); // L--  son hharfi kaldirmadan döndürür
        System.out.println(harfler.hashCode()); // 3499480--
        System.out.println(harfler);// [T, J, K, L]
        harfler.pop(); // ilk elemnti siler bize döndürür
        System.out.println(harfler); // [J, K, L]
        System.out.println("**************");


        LinkedList<String> karakterler = new LinkedList<>();
        karakterler.add("*");
        karakterler.add("?");
        System.out.println(karakterler); // [*, ?]
        karakterler.push("&"); // en bastaki element yerine yerlesiyor digerleri kaydirilir yani element eklemek
        System.out.println(karakterler);// [&, *, ?]
        // kapasite sinirlamasi varsa addFirst yerine push tercih edilir



        LinkedList<String> copy = (LinkedList<String>) karakterler.clone();
        System.out.println(copy);  // [&, *, ?]

    }
}
