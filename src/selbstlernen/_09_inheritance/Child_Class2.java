package selbstlernen._09_inheritance;

public class Child_Class2 extends Parent_Class{

    int c =20;
    int d;
    String s="Child class";
    String m;

    protected int sayiChild;

    Child_Class2(){
        System.out.println("Child Class Constructor'i calisti");
    }

    public void method1 (){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        //child classtan bir obje olusturalim ve özelliklerini yazdiralim

        Child_Class2 obj = new Child_Class2();
        // hem bu classa hem de parent class'a bakilir
        System.out.println(obj.a); // 10---bu classta yok ama extends yaptigimiz parent class'ta var
        System.out.println(obj.c); // 20--- bu classta bu variable var ama atama yapilmamis default degeri alinir
        System.out.println(obj.b); // 0 --- bu classta yok ama extends yaptigimiz pasrent class'ta var
        System.out.println(obj.m); // null - bu classta bu variable var ama atama yapilmamis default degeri alinir
        System.out.println(obj.s); // Child class --- ikisinde de varsa kendi classindaki degeri ayli
        //!!!!!!!! yani ilk önce ait oldugu class'a bakar.eger orada yoksa parents class'a bakiyor !!!!!!

        System.out.println(obj.t);// null---bu classta yok ama extends yaptigimiz parent class'ta var.default degeri.
        obj.method1();// child class method1--ait oldugu yere bakar önce.orada oldugu icin diger parent class'a bakmaya gerek yok
        obj.method2(); //Parent Method2 calisti---bu classta yok ama extends yaptigimiz parent class'ta var onu yazdirir

        System.out.println("***************");
        Child_Class2 objChild = new Child_Class2(); // bunun icin ustteki constructor calisior
        System.out.println(objChild.sayiChild); // 0
        System.out.println(objChild.sayiParent); // 0
        System.out.println(objChild.sayiGrandParent); // 0

        /*
        Child Class'tan olusturdugumuz bir onje, parent ve grandparent classlarindaki
        tüm özelliklere sahip olur.

        bir obje olusturuldugunnda ilk degerleri alabilmesi icin mutlaka bir CONSTRUCTOR calismalidir.

        Constructor call bizim cok kullandigimiz özellik degiildir.Ancak;
        inheritance'i tam olarak anlayabilmek icin constructor call konusunu bilmek lazim

        Bu class'tan obje olusturmak icin Child() Constructorunu kullandik ama objjemiz parent ve grandparent'teki
        özellikleri de sahiplenir. bu nasil oluyor?

        her ne kadar objeyi child class'tan olustursak da bu objen'nin parent ve grandparent class'larindaki
        ötellikleri alabilmesi icin o class'larin constructorlari da calismak ZORUNDADIR.

        Java bu mecburi calismayi saglayabilmek icin cok ozel bir sistem gelistirmistir.
        Bunun adi super() : super constructor call'dir

         */


    }
}
