package selbstlernen._13_exceptions;

public class _12_Finally_Keyword {

    /*
    Finally blogu try blogu ile calisir.
    Bir try blogu ile istendigi kadar catch blogu ve en sonda bir tane finally blogu kullanilabilir.

    Bir try blogu ile hic catch blogu kullanmadan da finally blogu kullanilabilir.

    finally blogu her durumda calisir, kullanim amaci bir exception olussa da, mutlaka yapilmasi gereken database
    connection’inin durdurulmasi gibi gorevlerin yapilacagindan emin olmaktir.

     */

    public static void main(String[] args) {

        String a = null;

        try {
            a.concat("b"); // NullPointerException i bul
        } catch (NullPointerException e){ // bulduk
            a=""; // a'ya hiclik atiyoruz
        } finally {
            System.out.println(a.concat("c")); // c --- a ya c'yi ekliyor
        }



    }
}
