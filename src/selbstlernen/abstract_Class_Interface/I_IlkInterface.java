package selbstlernen.abstract_Class_Interface;

public interface I_IlkInterface {


    /*
    class ------extends------class
    class ------implements--------interface
    interface ------extends------interface
     */

     /* Interfaces(Arayüz) : bir sinifin davranislarini belirlemek icin kullanilan abstract bir tur olarak tanimlanir.
    - Icinde sadece abstract methodlarin bulundugu bir yapidir. Bunlar Class DEGILDiR!!
    - Bir class'in temel planidir(blueprint)
    - Constructorlari yoktur (abstarct'larin constructurlari vardir). obje olusturulamay abstractlar gibi.
    - Abstract diye yazmaya gerek yoktur. interface'in icindekiler sen abstract olarak yazsan da yazmasan da Abstarcttir.
    ( mesela list bir interface dir..size() methodu ise de abstract'tir.)
    - Bir class istedigi kadar Interface'i implement edebilir mesela;
     public class Class1 implements Interface1, Interface2,Interface3 {       gibi
     ayni zamanda baska class'i parent de edebilir.(asagidaki gibi)
     public class Class1 extends Parent implements Interface1, Interface2,Interface3 {   gibi
     (bu sekilde ayni yerde hem extends hem de implement keywordlari kullanilabilir)

    -!!!! Sadece CONSTANT variable(degistirilemez) kullanilabilir.
      Interface icindeki variableler mutlaka puclic, static ve final olmalidir.
      public static final int SAYI1=20;
      static final int SAYI2=10;
      final int SAYI3=5;
      int SAYI4=0;
      Bunlarin hepsi ayni özelliklere sahiptir..!!!!!

      * Static olduklari icin proje icinden rahatlikla ulasilabilir
      * Final olduklari icin sonradan degistirilemez ve mutlaka bir deger atanmalidir.
      * Private veya Ptotected variable'ler CTE verir

     */

    /*Interface'deki butun methodlar public ve abstract'tir.ama istisnai olarak ::::::
    cunku bazen developerlar sonradan bir sey eklemek istiyorlar ama bunu implement etmek zorunda degilsek...
     INTERFACE'DE BODY'SI OLAN METHOD KULLANIMI??

    - Default ve static keywordlari kullanilarak body'si olan methodlar olusturulmasina izin verilmistir

    Mesela bir Interface'e sonradan yeni bir degisiklik yaptik ama normalde child class'ta implement etmek zorundayim.
    Cunku body'si olan methoda ihtiyacim var yani override yapmaliydim.
    Ama diyelim ki ben child class'ta onu implement yapma mecburiyetim olmasin istersem ne olacak?

    O zaman parent class'a yani Interface Class'ina geliyorum geliyorum ve abstract methodumuz mesele neydi.
    void inter1b();   olarak yazmistik
    void inter1b() {  } ;   olarak da kullanamam cunku interface icinde sadece abstract methodu kullanmak zorundaydim
    !!!!! O zaman DEFAULT veya STATIC keywordlarindan yardim aliyorum.

    default void inter1b() {  } ;      veya    static void inter1b() {  } ;
    olarak yazarsam problem cözumlenmis olur.
    Bu durumda artik Child Class'larda bunlari override etmek zorunda degiliz.
    Ama tabi override etmek istersek ededebiiliriz bu bize kalmis

    buradaki default access modifier degildir
     */

    /*
    Abstract classes ile Interface Farklari :

    - Abstarctlar classtir, interfaceler degildir.
    - Abstractlarda abstarct ve concret methodlar olurken, INterface'lerw sadece sadece abstarct methodlar konabilir
    - Abstract classlarda kismi abstraction varken Interfacelerde tam Abstraction saglar
    - Bir child classin sadece 1 tane parent abstract class'i olabilir yani coklu Inheritance olmaz AMA
      bir class#dan istenilen kadar Interface'i inherit edebilriz.Yani coklu inheritance'a uygundur.
    - Abstract class'lardaki nesnelerin public olmasi zorunlu degildir ama Interface'lerin icindeki tum nesnelerin
      public olmasi zorunludur
    - Abstract class'larin Constructoru vardir ama Interca'lerin yoktur.
    - Abstract Class'lar soyut olmayan methodlar static olarak tanimlanabilir ama Interfacelerde metotlar static olamaz

     */




}
