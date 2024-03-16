package selbstlernen.abstract_Class_Interface;

public class D_GöcmenKuslar extends B_Kuslar{

    /*
    abstract olmayan classlar : CONCRETE CLASS denir

    1- abstract bir class
    Parent'i olan abstract classtaki abstract methodelari implement etmek ZORUNDA DEGILDIR (OPSIYONEL)
    isterse impelement edip concrete hale getirir isterse de yok sayar

    2- abstract bir silsileden sonra gelen ilk concrete class parent veya grandparent'lar olan abstract
    class'larda concrete yapilmayan tum abstract class'lari IMPLEMENT etmek zorundadir.



     */
    @Override
    public void hareket() {
    }

    @Override
    public void beslenme() {
    }

    @Override
    public void omur() {
    }

}
