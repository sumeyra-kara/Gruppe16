package selbstlernen._11_abstract_Class_Interface;

public class F_TatliSuBaliklari extends E_Balik{
    @Override
    public void beslenme() {}

    @Override
    public void omur() {}

    @Override
    public void yuzgec() {}

    @Override
    public void yasamAlani() {}

    @Override
    public void iskeletYapisi() {}

    public static void main(String[] args) {

        A_Hayvan yayin = new F_TatliSuBaliklari();
        E_Balik alabalik = new F_TatliSuBaliklari();
        F_TatliSuBaliklari sazan= new F_TatliSuBaliklari();


    }

    /*
    Abstract Class'larin Constructorlari vardir ama obje olusturamaz.

    Abstract Classlar data turu concrete child class'larin cONSTRUCTOR'lari  kullanilarak
    Abstract parent class özelliklerinde objeler olusturulabilir.


     */
}
