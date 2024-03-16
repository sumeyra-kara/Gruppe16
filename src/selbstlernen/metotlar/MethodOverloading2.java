package selbstlernen.metotlar;

public class MethodOverloading2 {
    public static void main(String[] args) {
        /*
        overloading olmasi icin method ismi ayni olunca.ayni olmak zorunda
        java bir class'da ayni isimde birden fazla method olmasina izin verir ANCAK
              SIGNATURE'lari farkli olmak zorundadir

              signature = method ismi + parametre data turleri demektir

              eger ayni isimde birden fazla method varsa
              1-java öncelikle argument ve parametreler arasinda  %100 uyumlu olan var mi diye bakar
              2-eger %100 uyum yoksa casting ile kullanilabilecek var mi diye tumunu kontrol eder
               Birden fazla method casting ile calisabilir durumda olursa en az casting olani kabul eder.
         */

        topla(6); // 1 olan calisir cunku.uyumlu olani arar
        topla(3,5); // 2 olandir. topla int int olana bakar
        topla(6.3,5); // topla double int olana girer // 3
        topla(2.4f,5); // 4 olan. topla float oint
        topla(2.3,3.4); // 5. topla double doubledir

        topla('a',5); // topla char int dir. asagida yok.hepsini kontrol edecek.casting ile 2 yi kabul eder
                          // topla double int yani 3 de kabul eder
                        // topla float int de kabul eder yani 4.
                        // topla double double de kabul eder castiing ile
        // char olunca cogu kabul eder. ama char kendini int gibi kabul eder int int gibi onu tercih eder


        topla(2.3f,3.5f); // topla float float yok aslinda en uygunu topla double doubledir
        topla(4,5.2); // topla int double yok ama zopla double double uyar
    }

    public static void topla (int sayi){ // 1
        System.out.println("tek int : " + (sayi+sayi));
    }
    public static void topla (int a, int b){ // topla int olmaz ama topla int int olur // 2
        System.out.println(a+b);
    }
    public static void topla (double c, int d){ // topla double int oldu   // 3
        System.out.println(c+d);
    }
    public static void topla (float c, int d){ // topla float int kabul eder // 4
        System.out.println(c+d);
    }
    public static void topla (double e,double b){ // topla double double olur // 5
        System.out.println(e+b);
    }
}
