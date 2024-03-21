package selbstlernen._12_collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _4_2_PriorityOueue {
    public static void main(String[] args) {
        /*
        istenilen sirayla siralanir
        Biraz genellemeyle, PriorityQueue yapısına da kuyruk diyeceğiz; ama burada yüklenen anlamı
        FIFO yapısından farklı olabilir.
        Sıralama bazen öğelerin doğal sırasıdır, bazen ilgili Comparator tarafından belirlenen sıradır.

         */
        Comparator<Integer> compareForEven =new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                int result = i%2 - j%2;
                if (result==0)
                     result = i - j;

                  return result;
            }
        };

        // Comparator çift sayılara öncelik veriyor
     PriorityQueue<Integer > pr = new PriorityQueue<>();
        // ters sirada sayilari kuyruga ekle
        for (int i = 0; i < 20; i++) {
            pr.offer(20-i);
        }
      // öğeleri Comparator'un sırayla yazdır
        for (int i = 0; i < 20; i++) {
            System.out.println("\t " + pr.poll());
        }




    }
}
