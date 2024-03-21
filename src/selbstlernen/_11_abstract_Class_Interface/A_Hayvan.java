package selbstlernen._11_abstract_Class_Interface;

public abstract class A_Hayvan {
    /*
    Bir class'i abstract(soyut) class yapmak icin ABSTRACT keyword yazmak yeterlidir.

    Abstract class'lar class oldugu icin Constructor'lari vardir ama abstarct Class'lardan obje OLUSTURULAMAZ.

    !!!! 2 DURUMDA abstract kullanilir : Sadece kural koysun istersek veya o class'tan obje olusturmayacaksak..

    Abstract Class'larda bugune kadar kullanidigimiz yapida methodlar olusturabiliriz.ANCAK bunlar Child class tarafindan
    override olmak zorunda degildir.
    Child class'lari uyarlamaya mecbur etmek istedigimiz method'lari da abstract yapmaliyiz.

    Bir methodu abstract yapmak icin yine deklaration ile abstract yazmak yeterlidir.

    Abstract methodlarin Body'si olmaz.
    Abstract olmayan (concret) child class'lar buradaki abstract methodunu override etmek ZORUNDADIR.
    Diyelim bir method var abstract yaptik yani bodysi yok. Child class'larda onu override eden body'si olan
    method mutlaka olmak Zorunda. eger olmazsa abstract olmayan child class'lar kirmiziya boyanir.

    CONCRETE CLASS'LARDA ABSTRACT METHOD OLMAZ :
    Abstract methodlar final veya private olarak tanimlanamazlar. cunku eger olursa override edilemezler.


        implement : uyarlamak, uygulamak
     */

    public abstract void hareket (); // bu abstarct method oldugu icin override edilmek zorunda yani body'li child classta olmasi lazim
    public abstract void solunum ();

    public abstract void beslenme ();
    public abstract void cogalma ();
    public abstract void omur ();
    /*
    Biz buradakileri abstract yaptiysak bu methodlarin bodyli olani mutlaka gereklidir.
     */

}
