package selbstlernen._09_inheritance;

public class Parent_Class extends PGrandParent_Class {
    // genel özellikler bu classta yazilir

    int a = 10;
    int b;
    String s = "belirtilmemis";
    String t;

    protected int sayiParent;

    protected Parent_Class(){
        //super(); // burasi da ustte extends oldugu icin gizli bir super vardir
        System.out.println("Parent_Class Constructor calisti");
    }



    public void method1(){
        System.out.println("Parent Method1 calisti");
    }

    public void method2(){
        System.out.println("Parent Method2 calisti");
    }

}
