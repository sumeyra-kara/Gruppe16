package selbstlernen.stringManipulation;

public class StringMan_equals {
    public static void main(String[] args) {

        // equals yapisi

        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMet";
        String str5 = "Ahmet";
        String str6 = new String("Ahmet"); //non primitiv old icin bu sekilde yazilabilir
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7 + str8; //Ahmet

        // String case sensitivedir. yani buyuk kucuk harf duyarlidir. str1 str2 str3 str4 degerleri farklidir
        // str1 str5 str6 str9 degerleri ise ayni
        // stringte karsilastirma icin == kullanirsak metni ayni olan stringlerde bile false verebiluir

        System.out.println(str1 == str5);
        System.out.println(str1 == str6); //normalde true ama false verdi neden?
        System.out.println(str1 == "Ahmet");
        System.out.println(str1 == str9); //true ama false verdi neden?
        // sebep-- == hem metin degerine hem de referansa bakar. bu yuzden metni ayni olan string icin false verebilir
        // iki stringin ayni olup olmadigini kontrol etmek icin simdilik == kullanmayacagiz
        // bunun yerine stringlerde metinler ayni oldugunu kontrol icin equals kullanilir

        System.out.println(str1.equals(str5)); // artik hepsi true dur
        System.out.println(str1.equals(str6)); // true
        System.out.println(str1.equals("Ahmet")); // true
        System.out.println(str1.equals(str9)); // true

        System.out.println(str1.equals(str2)); // false olur cunku zaten yazim bicimleri farkliydi
        System.out.println(str1.equals(str4)); // false. metin olarak farkli old. icin equals kullanilmz zaten.

        // eger buyuk-kucuk harf farkli yazimlarda olsa da esit kabul edeceksek ne olacak?
        // o zaman equalsIgnoreCase kullanmaliyiz

        System.out.println(str1.equalsIgnoreCase(str2)); // True olur cunku kucuk buyuk onemli degil
        System.out.println(str1.equalsIgnoreCase(str4));


    }
}
