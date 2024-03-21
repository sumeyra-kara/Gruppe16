package selbstlernen._13_exceptions;

public class _11_Throws_Keyword {

    /*

    ******* Throws Keyword

    throws keyword’u bir class’da exception olusma olasiligini deklare etmek icin kullanilir.
    Yani burada hata var diyoruz kodu calistirana.

    throws keyword kullanimi exception olustugunda kodun durmasina engel OLMAZ, sadece
    Java’nin ve diger kullanicilarin bu class’da exception riskinin farkinda oldugumuzu
    bilmesine yarar.

    Throws keyword kullanildigi method’un deklare edildigi satirda ( ) ile { } arasina yazilir.
    Method icinde kullanilamaz.

    Birden fazla exception ihtimali varsa, throws keyword’den sonra aralarina virgul konarak tum exception’lar yazilabilir

    Throws keyword ile birden fazla exception yazilacaksa ve aralarinda parentchild iliskisi varsa once child,
    sonra parent exception yazilmalidir.

    ******Throw Keyword

     throw keyword kontrollu olarak bir exeption throw etmek icin kullanilir

      throw keyword ile sadece bir exeption throw edilebilir

      Throw keyword method icinde kullanilir


     */

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        Thread.sleep(5000);

        // Thread.sleep(-5000); // IllegalArgumentException ---- negatif olunca hata verir
        System.out.println("The thread is paused for " + (System.currentTimeMillis() -  start) + " millisecond");

    }
}
