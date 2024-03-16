package selbstlernen.inheritance;

public class Child_Class3 extends Parent_Class{

    String childstr;

    Child_Class3(){
        //super();// yukarisi extends oldugu icin bunu biz yazmasak bile burada gizli br super vardir
        System.out.println("Child_Class3 Constructor calisti");
    }

    public static void main(String[] args) {

        // System.out.println(childstr); kendi class'ima bile ulasamiyorum cunku main metodu static.
        //ama variable static olmadigi icin bu variableye erisemem.kullanamam.
        //System.out.println(sayiParent); yine ulasamam static degil
        // sayiGrandParent.sout-- buna da ulasamam static degil

        // obje olusturmam lazim

        Child_Class3 objeChild =new Child_Class3();
        // constructorlar calisacak,yazdirilacak.en genelden en özele dogru hepsini.
        // yani ilk granparent,sonra parent sonra da child classtaki constructor calisir


        System.out.println(objeChild.childstr); // null
        System.out.println(objeChild.sayiParent); // 0
        System.out.println(objeChild.sayiGrandParent); // 0

        /*
        Java'da inheritance kullanirken child classtaki obje parent classlardaki tum özelliklere sahip olur
        Bunu saglayan Java mekanizmasi super() constructor call'dur.

        Extends keyword kullanan bir class'ta olusturulan her bir constructor'in ilk satirinda biz gormesek bile
        super const. call vardir. yani super().--önce parent class'a gidip oradaki parametresiz constr'i calistir demektir.

        Bu sekilde child class'taki constructor calistiginda extends keyword kullanmayan parent buluncaya kadar
        parent class'lara kadar gider

         */

    }
}
