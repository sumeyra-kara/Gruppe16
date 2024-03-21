package selbstlernen._09_inheritance;

public class R_Toyota_Corolla_Child extends R_Toyota{

    String str3= "Corolla";

    String str7;

    R_Toyota_Corolla_Child(){
        // super() gorunmyen vardir
        System.out.println("Parametresiz Corolla Constructor Calisti");
    }

    R_Toyota_Corolla_Child(int sayi){
        this();// buraya geldikten sonra default const.na da gidiyor this oldugu icin bu.
        // super();-- buralarda görunmeyen bir const vardir
        // super() degil de this() olsaydi da önemli degil
        // super(8); // eger bu varsa gözükmeyen bir const. olmaz. 1 Tane OLMALI.
        System.out.println("Int parametreli Corolla Constructor Calisti");
    }

    public static void main(String[] args) {

        R_Toyota_Corolla_Child obj1= new R_Toyota_Corolla_Child(5);
        // ilk once main metgod calisir. obje olusturuyoruz.
        // extends OLMAZSA sadece parametreli constructor calisir onu yazdirir o kadar

        // eger EXTENDS yaparsak
        // yine main method ile baslar ve sonra obje yazdik. sonra parametreli constructora gecer.
        // hepsindeki parametreli constructorlari genelden özele yazdirir
        //Araba parametresiz Constructor calisti--Parametresiz Toyota Constructor'u calisti-Int parametreli Corolla Constructor Calisti


        /*
        Biz gorunur bir constructor olusturdugumuzda Java'nin default const'i silinmesine benzer olarak
        extends keyword kullanilmis bir class'daki herhangi bir Constructor'n ilk satirinda gözle görünür bir cons. call
        yazilmissa Java default olarak koydugu  super()'u siler.digeri devreye girer. 1 Tane olmalidir yani.

        Bir constructor'in icinde sadece 1 tane cons. OLABILIR: O da ilk satirda yazilmak zorundadir.

        Eger bir Constructor icinde this() varsa  oradaki constructoru yazdirir.ama ayni zamanda o classtaki
        default const'na da gidip onu da yazdirir.

        Eger this(parametre) veya super(parametre) ile constructor call yaptigimizda yazdigimiz argument ile uyumlu
        parametreye sahip bir const. yoksa Java CTE verir
         */

        R_Toyota child3= new R_Toyota_Corolla_Child(); // böyle olunca R_Toyota class'indan obje olusturulmus gibi degerlendirilir
        // R_Toyota class'ina eger deger orada yoksa parent class'i olan R_Araba class'ina bakilir

        // child3.str3 normalde bu klass icinde var ama objemizi toyota klassindan baktigimiz icin bu siniftaki hicbir variableyi gormez
        System.out.println(child3.str2); // toyota classindaki Toyota yi yazdirir
        System.out.println(child3.str1);// toyota clas'ina bakiyoruz orada yok.ustteki Araba class'ina bakilir oradakini yazdirir

        System.out.println(child3.str5);
        System.out.println(child3.str6);

        // child3.str7 buna erisemez cunku objemiz bizim Toyota class'indandir. bu toyota Corolla sinifini göremez

        /*
        Eger bir obje olusturulurken data turu ve constructor ayni ise ; aradigimiz ozellikler icin direkt
        o class'a gider ve özellikleri arariz

        Eger bir obje olusturulurken data turu ve constructor farkli ise ; variable ve methodlar farkli davranirlar.
        Variableller;
        once data turunun oldugu class'a bakar.Bulursa ddgerini yazdirir bulamazsa data tuurunun parentlerine bakar oradakini yazdirir
        orada da bulamazsa CTE verir

        Methodlar icin ise; ( variableler gibi degil)
        Dinamik ozellikler (method) icin ise ozellik bulunduktan sonra override edilmis mi diye
        kontrol ederiz, birden fazla override varsa en guncel hali gecerli olur.
        Yani aslinda variable nin tersine en icteki child klasstaki method calismis oluyor


         */




    }

}
