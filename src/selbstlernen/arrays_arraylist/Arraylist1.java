package selbstlernen.arrays_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        //array alt yapsini kullanir ancak uzunlugu esnektir.arraylerden farki bu
        // primitivelar icin kullanilmaz. non primitiv eya da wrapper class olacak veya da objekt vs.veya baska klass adi
        // isaretine diamond adlandirilir
        //list aslinda bir class degil interface dir


        List<String> tiere = new ArrayList<>();
        ArrayList<Integer> zahlen = new ArrayList<>();
        ArrayList<Double> fKommaZahl = new ArrayList<>();

        System.out.println(tiere); // listeyi direkt bu sekilde yadirabiliriz.ama arrylerde boyle degil
        // daha tanimlamadik bu yuzden bos bir dizi verir
        System.out.println(tiere.size()); // 0--- tanimlamadik cunku
        System.out.println(tiere.isEmpty()); // true--bu liste bos mu.evet bos.

        tiere.add("Katze"); // add ekleme yapiyor arraya.ekleme sirasina göre yazdirir
        tiere.add("Hund");
        tiere.add("Delfin");
        tiere.add("Löwe");
        tiere.add("Vogel");
        System.out.println("Die größte von ArrayList tiere ist : " + tiere.size()); // 5
        // size uzunlugunu verir

        tiere.add("Schlange");
        System.out.println("Die größte von ArrayList tiere ist : " + tiere.size()); // 6

        System.out.println("tier an indeks 1 ist : " + tiere.get(1)); // Hund--indeks 1 daki element Hund
        System.out.println("tier an indeks 3 ist : " + tiere.get(3)); // Löwe--indeks 3 daki element Löwe

        System.out.println("********");
        tiere.set(1,"Frosch"); // 1 yerine frosch geloyor Hund yerine
        System.out.println(tiere.get(0)); // gidiyor o yazilan indekse
        System.out.println(tiere.get(1));
        System.out.println(tiere.get(2));
        System.out.println(tiere.get(3));
        System.out.println(tiere.get(4));
        System.out.println(tiere.get(5));
        System.out.println("************");

        tiere.add(2,"Hase"); // 2.siraya hase geliyor yanindakiler de kayiyor
        System.out.println(tiere.get(0));
        System.out.println(tiere.get(1));
        System.out.println(tiere.get(2));
        System.out.println(tiere.get(3));
        System.out.println(tiere.get(4));
        System.out.println(tiere.get(5));
        System.out.println(tiere.get(6));

        System.out.println(tiere.contains("Katze")); // true--katze tiere sinifinda var mi
        System.out.println(tiere.contains("Kamel")); //false--contains o obje var mi yok mu diye bakar boolean olarak

        System.out.println(tiere.indexOf("Katze")); // indeksi 0
        System.out.println(tiere.indexOf("Pferd")); // -1 cünkü pferd listede yok

        tiere.add("Delfin"); // yeni seyler ekleme yapiyoruz
        tiere.add("Delfin");
        tiere.add("Delfin");

        System.out.println(tiere);
        System.out.println("tier an indeks ist : " + tiere.get(0)); // 0.indekse git demek


        System.out.println(tiere.indexOf("Delfin")); // 3-- indeks von Delfin
        System.out.println(tiere.lastIndexOf("Delfin")); //9--Delfin in son indeksi nedir

        //tiere.clear(); //tum elemanlari temizler bir sey kalmaz

        tiere.isEmpty(); // liste bos mu ?
        System.out.println(tiere.isEmpty());// true oder false olarak dönder

        tiere.remove("Hase"); // hase yi siliyoruz. remove ile o verilen sey silinir
        System.out.println(tiere.get(2)); // artik hase yok 2.indekste Delfin var

        tiere.remove("Delfin"); //ilk Delfin i temizler eger birden fazla varsa
        // eger tekse de dekfin i yok eder
        System.out.println(tiere);

        tiere.remove(4); // 4.indekstekini temizler
        System.out.println(tiere);

        tiere.addAll(2,tiere);

        System.out.println(tiere); // 2.indeksin oldugu yere tiere array ini ekleiyoruz
        // sonra tekrardan kendi arrayimizi yaziyoruz

        System.out.println(tiere.containsAll(tiere)); // tiere array inin icinde tiere var mi --true

        for (String t : tiere){ // for-each schleife ile kolaylikla buluruz elementleri

            System.out.print(t + " ");
        }

        for (int i = 0; i< tiere.size(); i++){ // for schleife ile de bulabiliriz
            System.out.println(tiere.get(i));
        }






    }
}
