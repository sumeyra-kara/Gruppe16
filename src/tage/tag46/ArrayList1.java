package tage.tag46;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        //arraylistler primitivelerde kullanilmaz.non-primitiive veya warapper class olmali

        List<String> tiere = new ArrayList<>();
        ArrayList<Integer> zahlen = new ArrayList<>(); // bu mesela wrapper klasse
        ArrayList<Double> fKommaZahl = new ArrayList<>();

        System.out.println(tiere); // daha tanimlamadik. bu yuzden bos bir dizi verir

        tiere.add("Katze"); // add ekleme yapiyor arraya.simdi tanimliyoruz yani --[]
        tiere.add("Hund");
        tiere.add("Delfin");
        tiere.add("Löwe");
        tiere.add("Vogel");

        System.out.println(tiere); // [Katze, Hund, Delfin, Löwe, Vogel]
        System.out.println("Die größte von ArrayList tiere ist : " + tiere.size()); // 5
        // size uzunlugunu verir.arraylerdeki length methodu gibidir ama arraylistler icin SIZE--

        tiere.add("Schlange");// sonradan bu sekilde listeye eleman ekleyebiliyoruz
        System.out.println(tiere);//[Katze, Hund, Delfin, Löwe, Vogel, Schlange]
        System.out.println("Die größte von ArrayList tiere ist : " + tiere.size()); // 6

        System.out.println("tier an indeks 1 ist : " + tiere.get(1)); // Hund--indeks 1 daki element Hund
        System.out.println("tier an indeks 3 ist : " + tiere.get(3)); // Löwe--indeks 3 daki element Löwe

//[Katze, Hund, Delfin, Löwe, Vogel, Schlange]----simdi bu sekilde
        System.out.println("********");
        tiere.set(1,"Frosch"); // 1 yerine frosch geliyor Hund yerine.hund gidiyor
        System.out.println(tiere.get(0)); // gidiyor o yazilan indekse
        System.out.println(tiere.get(1));
        System.out.println(tiere.get(2));
        System.out.println(tiere.get(3));
        System.out.println(tiere.get(4));
        System.out.println(tiere.get(5));
        System.out.println(tiere); //[Katze, Frosch, Delfin, Löwe, Vogel, Schlange]
        System.out.println("************");

        tiere.add(2,"Hase"); // 2.siraya hase geliyor yanindakiler de kayiyor.
        // eleman sayisi da bir tane artmis oluyor
        System.out.println(tiere.get(0));
        System.out.println(tiere.get(1));
        System.out.println(tiere.get(2));
        System.out.println(tiere.get(3));
        System.out.println(tiere.get(4));
        System.out.println(tiere.get(5));
        System.out.println(tiere.get(6));
        System.out.println(tiere); //[Katze, Frosch, Hase, Delfin, Löwe, Vogel, Schlange]
        System.out.println("********");

        System.out.println(tiere.contains("Katze")); // true--katze tiere sinifinda var mi diye bakiyor
        System.out.println(tiere.contains("Kamel")); //false--contains o obje var mi yok mu diye bakar boolean olarak

        System.out.println(tiere.indexOf("Katze")); // indeksi 0
        System.out.println(tiere.indexOf("Hase")); // hase nin indeksi 2 dir
        System.out.println(tiere.indexOf("Pferd")); // -1 cünkü pferd listede yok
        System.out.println("*****");
        //[Katze, Frosch, Hase, Delfin, Löwe, Vogel, Schlange] ---- guncel dizimiz

        tiere.add("Delfin"); // yeni seyler ekleme yapiyoruz
        tiere.add("Delfin");
        tiere.add("Delfin");
        // 3 tane Delfin ekledik diziye add metodu ile

        System.out.println(tiere);//[Katze, Frosch, Hase, Delfin, Löwe, Vogel, Schlange, Delfin, Delfin, Delfin]
        System.out.println("tier an indeks ist : " + tiere.get(0)); // 0.indekse git demek---Katze


        System.out.println(tiere.indexOf("Delfin")); // 3-- indeks von Delfin
        //birden cok o elementten varsa indexof metodu ayni olan elementten ilkinin indeksini verir
        System.out.println(tiere.lastIndexOf("Delfin")); //9--Delfin in son indeksi nedir

        //tiere.clear(); //tum elemanlari temizler bir sey kalmaz

        tiere.isEmpty(); // liste bos mu ?
        System.out.println(tiere.isEmpty());// true oder false olarak dönder---false . cunku dolu

        tiere.remove("Hase"); // hase yi siliyoruz. remove ile o verilen sey silinir
        System.out.println(tiere.get(2)); // artik hase yok 2.indekste Delfin var

        tiere.remove("Delfin"); //ilk Delfin i temizler eger birden fazla varsa
        // eger tekse de dekfin i yok eder
        System.out.println(tiere);//[Katze, Frosch, Löwe, Vogel, Schlange, Delfin, Delfin, Delfin]
        //3.indeksteki Delfin i sildi

        tiere.remove(4); // 4.indekstekini temizler. 4.indekste schlange vardi onu silecek
        System.out.println(tiere);//[Katze, Frosch, Löwe, Vogel, Delfin, Delfin, Delfin]

        tiere.addAll(2,tiere);

        System.out.println(tiere); // 2.indeksin oldugu yere tiere array ini ekleiyoruz
        // sonra tekrardan kendi arrayimizi yaziyoruz
        //[Katze, Frosch, Katze, Frosch, Löwe, Vogel, Delfin, Delfin, Delfin, Löwe, Vogel, Delfin, Delfin, Delfin]

        System.out.println(tiere.containsAll(tiere)); // tiere array inin icinde tiere var mi --true

        for (String t : tiere){ // for-each schleife ile kolaylikla buluruz elementleri

            System.out.print(t + " ");
        } //Katze Frosch Katze Frosch Löwe Vogel Delfin Delfin Delfin Löwe Vogel Delfin Delfin Delfin
        System.out.println("**********");

        for (int i = 0; i< tiere.size(); i++){ // for schleife ile de bulabiliriz
            System.out.println(tiere.get(i));
        }
        /* Katze
           Frosch
           Katze
           Frosch
           Löwe
           Vogel
           Delfin
           Delfin
           Delfin
           Löwe
           Vogel
           Delfin
           Delfin
           Delfin*/









    }
}
