package selbstlernen.inheritance;

public class Child_Class extends Parent_Class{
    // spesifik özelliklerin yazildigi classtir

    int c =20;
    int d;
    String s="Child class";
    String m;

    public void method1 (){
        System.out.println("child class method1");
    }


    public static void main(String[] args) {
        Parent_Class obj3= new Parent_Class();
         //parent classtan obje olusturursam eger,oradaki variable veya methodlara ulasabilirim
        obj3.a=20;
        obj3.s="p";
        obj3.t="k";
        obj3.b=22;
        obj3.method1();//Parent Method1 calisti
        obj3.method2();//Parent Method1 calisti



        Child_Class obj4 = new Child_Class();
        //icinde bulundugum classtan obje olusturursam eger,icinde bulundugum yerdeki variable veya methodlara ulasabilirim
        obj4.c=25;
        obj4.d=50;
        obj4.s="u";
        obj4.m="l";
        obj4.method1();//child class method1

        // yani nerdeki classtan obje olusturursam oradaki classtaki degiskenleri kullanabilirim---normal obje olusrurma durumudur bu

        /*
        Java'da parent class'lar child edilmez ama child class'lar parent edilebilir.

        bir class'in baska bir class'in tum ozelliklerini almasini istiyorsak o classi EXTEND  yapariz.
        ----class name + extends  + (parent yapmak istedigimiz class ismi)-----
         */


        // parent class'ini child class'ina child yapinca,,child classta olmayip parent classta olan
        // b,t,a ve method2 na erisilebiliyor
        obj4.b=8;
        obj4.t="y";
        obj4.a=22;
        obj4.method2();//Parent Method2 calisti


    }


}
