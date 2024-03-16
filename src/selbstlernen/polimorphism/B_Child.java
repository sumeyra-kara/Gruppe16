package selbstlernen.polimorphism;

public class B_Child extends A_Parent{
    String city="Child";

    @Override
    void method1() {
        //super.method1();
        // burada super. olursa hem Child class'taki method1 hem de
        // parent class'taki method1 calisir
        System.out.println("Child class method1");
    }

    void method2(){
        System.out.println("Child class method2");
    }


    Integer method3(){
        System.out.println(" child class method3");
        return 5;
    }

    /*
    Overridden method ile Overriding methodun isim ve signature'lari ayni olmalidir
    return type ve access modifierlari signature'a dahil degildir
    ancak Ovverriding'de bunlarla ilgili kurallar vardir:

    1- access modifier kurali:
    Child parent'i kisitlayamaz (access modifiierlari olarak)
    Child class daha kapsamli olmali parent class'tan mesela child public parent default gibi
    (Public-Protected-default-private)
    Eger overriding ve overriden methodlari private yaparsak, bu iki method bagimsiz olarak calisir
    Aralarinda override islemi olmaz

    2- Return typ kurali :
    - Return type primitive veya void ise iki method'un return typ'i ayni olmalidir.Int ise int, short ise short gibi
    - Non-primitive oldugunda ya ayni olmali ( Interger Integer gibi) veya
      parent class'daki return type child class'daki return teype'in parent'i olmali ( Integer Object gibi)
      (Covariant data -Ko variant data)

      COVARIANT DATA TURU: iki data turu arasinda parent child iliskisi olmasi demektir.(IS A9

     */


    /*
        Bir method override edildiginde child classda @Override rotasyonu kullanilabilir

        kullanmak veya kullanmamak arasinda pratikte söyle bir sonuc olusur :
        - Eger notasyon kulanilirsa iki metot arasindaki iliski takip edilir.
        parent class'daki method silinirse notasyin CTE verir.
        notasyon yoksa parent class'daki overriden method silinirse bir uyari verilmez CTE vermez
         */


}
