package selbstlernen._06_stringManipulation;

public class CharAt {
    public static void main(String[] args) {
        String str = "Java Candir";

        // ilk harfi yazdiralim
        System.out.println(str.charAt(0)); // ilk harf icin 0 sorulur
        System.out.println(str.charAt(2 )); // 2 diyince 3. harfi yani v yi yazdirir
        // iki kelime arasindaki boslukta 1 sayi olarak eklenir onu unutma

        //son harfi yazdirmak icin
        System.out.println(str.charAt(10)); // diyebiliriz---r
        System.out.println(str.charAt(11-1)); // r

        // javada karakter sayiyini bize length verir
        System.out.println(str.length()); // karakter sayisidir
        System.out.println(str.charAt(str.length()-1)); // stringin son harfi  ---r

        // eger degisimleri algilasin ve bun agore yapsin istiorsak dinamik kod yazmaliyiz
        // bunun icin metnin lengthini kullanabiliriz
        System.out.println(str.length());

        // sondan ucuncu harfi yazdirin
        System.out.println(str.charAt(str.length() -3)); //---d

        // System.out.println(str.charAt(20)); bu sekilde olmayan bir indeksi yazdirmz hata verir
        // System.out.println(str.charAt(str.length())); bu hata verir ama neden?
        // cunku, once karakter sayisini buluyor 11 buldu ama 11 e kadar yok 10 a kadar var deger

    }
}
