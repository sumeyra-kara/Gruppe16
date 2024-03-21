package selbstlernen._06_stringManipulation;

import java.util.Locale;

public class toUpper_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.toUpperCase()); // Buyuk harflerle yazdirma
        System.out.println(str.toLowerCase()); // kucuk harflerle yazdirma
        System.out.println(str); // orjinal metin degismez
        // degisikligi kalici yapmak istersek atama yapmaliyiz

        str = str.toUpperCase(); // artik kalici olur
        System.out.println(str );

        // str'i kucuk harfe cevirin ancak I harfi i olur kucuk olunca. ingilizce harf cunku
        //
        System.out.println(str.toLowerCase());
        // bu sekilde i yerine kucuk I harfi elde edebiliriz
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));
    }
}
