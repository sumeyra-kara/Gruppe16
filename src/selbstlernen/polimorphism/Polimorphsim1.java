package selbstlernen.polimorphism;

import java.util.Arrays;

public class Polimorphsim1 {
    // Polimorphism, bir objenin farkli davranabilme özelligidir.(Cok bicimlilik)
    // ayni isimdeki methodu farkli sonuc verdirmesini saglamak

    /*
    Ayni isimde ama farkli islevi olan methodlar olusturmak icin 2 olasilik vardir:
    1- Overloading  (compile time / static Polimorphism)
    2- Overriding   (Run time / dinamic Polimorphism)

    Overloading : Ayni class'da ayni isimde fakat farkli signaturelara sahip methodlar olusturmaktir.
    (signature :  mezhod ismi+parametreler).. buradaki accesss modifier,method Body'sindeki kodlar
    ve return type'in önemi yoktur.

    Overriding : bunun icin parent-child olmasi gerekir. Bu inheritance ile birlikte kullanilabilecek bir yontemdir.
    Child class#lara methodlari kendine ozellestirme imkani tanir.
    Overriding icin parent ve child classlardaki methodlar ayni isim ve signature'A sahip olmalidir.
    AMA objenin data turu ve constructor'u farkli olmalidir.
    return type ve acccess modifier icin ise kurallari vardir

     */
    /*


     */

    public static void main(String[] args) {

        /*
        int [] sayilar = new int[]{1,2,3,4,5}; // bu int turunde oldugu icin sadece int turunde alir
        System.out.println(Arrays.toString(sayilar));


        A_Parent [] loggers = new A_Parent[]{new B_Child()}; // burada turu farketmez
        // baska child classlar varsa da onlari da ekleyebilirdik

        for (A_Parent log : loggers){
            // log.  o class icindeki log methodunu yazdirirdi
        }
         */

    }



}
