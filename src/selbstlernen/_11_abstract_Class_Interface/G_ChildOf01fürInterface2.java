package selbstlernen._11_abstract_Class_Interface;

import java.util.ArrayList;
import java.util.List;

public class G_ChildOf01fürInterface2 implements I_InterfaceGiris1,I_InterfaceGiris3 {

    /*
    Interface'in en onemli artisi; bir class'in birden fazla interfac'i implement edebilmesidir.
    -Bir class'i extends ile de baska class'a child yapabiliriz

    - Ancak birden fazla interface'i implement ederken dikkat etmemiz gereken bir konu vardir :
    Eger implement etmek istedigimiz farkli interface'lerde ayni isimde fakat farkli return taypei olan
    methodlar varsa iki methodu ayni anda implement edemeyecegimiz icin o iki interface'den sadece birini
    implement edebiliriz

     */

    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoriyel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {
        G_ChildOf01fürInterface2 obj = new G_ChildOf01fürInterface2();
        // obj.sayi; bu sekilde gelmez.
        //Interface'in constructoru yok o yuzden bu obje parentlerine gidip o özelligi alamaz

        System.out.println(I_InterfaceGiris1.str); // Interface adiyla ulasilabilir
        System.out.println(I_InterfaceGiris1.sayi);
        System.out.println(I_InterfaceGiris3.sayi);
        System.out.println(I_InterfaceGiris3.str);

        System.out.println(I_InterfaceGiris2.sayi);
        System.out.println(I_InterfaceGiris2.str);

        List<String>harfler = new ArrayList<>();




    }


}
