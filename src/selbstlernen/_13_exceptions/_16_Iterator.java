package selbstlernen._13_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _16_Iterator {

    public static void main(String[] args) {

        int [] arr = {3,8,1,9,23};

        // tum elementleri yazdiralim

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] +" ");
        }
        System.out.println(" ");

        // indeks kullanmadan tum elementleri 3 arttirip kaydedin
        //index istenmedigi icin for-loop kullanamayiz. For-each ile yapalim

        for (int each : arr){
            each+=3;
            System.out.print(each + " ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arr)); // ama degismedi cunku forloopùn icinde arttirdim


        // Java'daki tum yapilar indeksi kullanir mi? hayir desteklemez- bunu collectionsta gorduk (mesela set gibi)
        // Bu durumda indeks olmadiginda elementleri yazdirmak istersek for-aech looopu kullanabiliriz
        // ama elementler arasinda dolasmak, belirli sartlari saglayanlari update etmek isterseniz,
        // for-each ile yapamazsiniz.


        System.out.println("************+");

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(4);
        // cift olan sayilari silelim mesela

        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)%2==0){
               sayilar.remove(i);
            }

        }
        System.out.println(sayilar); // burada saglikli sonuc vermez hatalar verebiliyor
        /*
        List'te istenemyen elementleri silmek istedigimizde her sildigimiz element uzunlugu degistirdigi icin
        kodlar saglikli calismaz.

        Bu sorunlari cozmek icin Java Iterator Interface'ini olusturmus

         */


    }
}
