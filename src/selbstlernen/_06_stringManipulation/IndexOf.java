package selbstlernen._06_stringManipulation;

public class IndexOf {
    public static void main(String[] args) {

        String str = "Java cok guzel bir programlama dili.";

        System.out.println(str.contains("a")); // true -- bu farkli bosey. icinde a var mi var
        System.out.println(str.indexOf("a")); // a nin kacinci sirada oldugunu veir.ilk a 1"de--1
        System.out.println(str.indexOf('c')); // char seklinde de sorabiliriz---5
        System.out.println(str.charAt(5)); // 5. siradaki karakter c--ustteki ornekle zit islemler
        System.out.println(str.indexOf("a "));//3 verir a 3 ten baslar cunku
        System.out.println(str.indexOf("guzel")); // 9 verir g harfi 9 dan baslar sonrakileri saymaya gerek yok

        System.out.println(str.indexOf(" ")); // ilk boslugun indeksini verir---4
        System.out.println(str.indexOf(" " , 10)); //aramaya baslayacagi indeks--10.indeksten sonraki bosluk

        //ikinci space'in indeksini bulalim
        System.out.println(str.indexOf(" " , (4+1))); //ilk bosluk 4.sirada,ondan sonraki bulmak icin bir ekliyoruz

        // ikinci i'nin indeksini bulalim
        System.out.println(str.indexOf("i")); // bu ilk indeks ---16
        System.out.println(str.indexOf("i",str.indexOf("i")+1)); // ikinci i'nin indeksi---32

        // ikinci a'nin indeksini bulalim
        System.out.println(str.indexOf("a")); // ilk a'nin indeksi --1
        System.out.println(str.indexOf("a ", str.indexOf("a")+1)); // ikincisi ---3

        // OLAMAYAN bir stringin indeksi nedir??
        System.out.println(str.indexOf("x")); // olmayan stringin indeksi STANDART olarak HER ZAMAN -1'dir
        System.out.println(str.indexOf("phyton")); // -1 yine

        // ikinci c olup olmadigini yazdirin

        int ilkCindex = str.indexOf("c");

        if (ilkCindex == -1){
            System.out.println("verilen metinde C yok");
        } else if (str.indexOf("c" ,ilkCindex+1) == -1) {
            System.out.println("2. c yok");
        } else {
            System.out.println("2.c var");
        }

    }
}
