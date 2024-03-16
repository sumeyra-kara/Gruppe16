package selbstlernen.inheritance;

public class T_Child extends T_Parent{

    String str = "Child";
    public void method1(){
        System.out.println("Child method 1");
    }
    public void hareket(){System.out.println("ucarlar");}
    public void beslenme(){System.out.println("et yerler");}
    public void pence(){System.out.println("pencelidir");}

    public static void main(String[] args) {
        T_Child obj = new T_Child();
        obj.method1(); //Child method 1
        System.out.println(obj.str); // child
        obj.hareket(); // ucarlar
        obj.beslenme(); //et yerler
        obj.pence(); // pencelidir
        obj.kanat(); //kanatlidir
        obj.omur(); //yasar ve ölurler
        System.out.println("**********+");

        T_Parent obj2 = new T_Child();
        obj2.method1();//Child method 1
        System.out.println(obj2.str); // parent
        obj2.beslenme();//et yerler
        obj2.omur();//yasar ve ölurler
        obj2.kanat();//kanatlidir
        obj2.solunum();//akcigerle nefes alirlar
        //obj2.pence--CTE HATA
        System.out.println("******+");

        T_GrandParent obj3 = new T_Child();
        obj3.beslenme();//et yerler
        obj3.omur();//yasar ve ölurler
        obj3.kanat();//kanatlidir
        obj3.hareket();//ucarlar
        //obj3.solunum--CTE hata



    }

    /*  Override :  gecersiz kilma
        Overridden  : gecersiz kilinan

        T_Parent obj2 = new T_Child(); mesela bunun icin variablalara bakacagimiz zyamna
        Parent class'a bakilir. orasi esas alinir
        ama methodlar icin durum farklidir.methodlarda child klass esas alinir en icteki yani

        data turu ve constructor ayni olunca, o class'ta aramaya baslariz,
        buldugumuz ilk degeri kullaniriz

        eger FARKLI ise, data turu olan class'tan aramaya baslar.o class veya parent class'larinda bulamazsa CTE verir.
        Bulursa; override edilmis mi diye kontrol eder ve en guncel bilgiyi yazdirir.data turundeki classtan constructor edilen
        klass'a kadar bakilir.


     */


}
