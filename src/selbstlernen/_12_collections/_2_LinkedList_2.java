package selbstlernen._12_collections;

import java.util.LinkedList;
import java.util.List;

public class _2_LinkedList_2 {
    public static void main(String[] args) {
        /*
        List data turuunde bir LinkedList olusturalim
         */
        List<String> harfler = new LinkedList<>() ;
        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");

        System.out.println(harfler);// [H, K, M, L]
        harfler.add("B");
        System.out.println(harfler);// [H, K, M, L, B]

        harfler.add(3,"T");
        System.out.println(harfler);// [H, K, M, T, L, B]

        harfler.set(3, "R");
        System.out.println(harfler);// [H, K, M, R, L, B]

        // System.out.println(harfler.size()); ----6

        List<String> semboller = new LinkedList<>();
        semboller.add("*");
        semboller.add("B");
        semboller.add("%");
        semboller.add("&");

        System.out.println(semboller); // [*, B, %, &]
        System.out.println(harfler.retainAll(semboller)); // true- istenilen islemi yaptim demek ama sonuc icin yazdirmaliyiz
        System.out.println(semboller);//  [*, B, %, &]
        System.out.println(harfler); //   [B] sembollerin icinden harflerdeki olani bulup getiriyor.ortak olani yani

        harfler.addAll(semboller); // harfler [B]'di
        System.out.println(harfler); // [B, *, B, %, &]


       /* semboller.retainAll(harfler); // herflerin icinden sembollerdeki ortak olani buluyor ve yazdiriyor semboollerde
        System.out.println(semboller); //[B]
        System.out.println(harfler); //  [H, K, M, R, L, B]

        */
        System.out.println(harfler); // [B, *, B, %, &]
        System.out.println(semboller); // [*, B, %, &]
        System.out.println(harfler.removeAll(semboller)); // true- islemi yaptim diyor.
        System.out.println(harfler); // [] harfler.. silince bos bir array kalir (ikinci tekrarli b'yi de siler)





    }
}
