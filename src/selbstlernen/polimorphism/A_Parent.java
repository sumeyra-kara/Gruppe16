package selbstlernen.polimorphism;

public class A_Parent {
    String city ="Parent";

   void method1(){

        System.out.println("Parent class method1");
    }



    void method2(){
        System.out.println("Parent class method2 ");

    }
    Object method3(){
        System.out.println("Parent class method 3 ");

        return null;
    }

    public static void main(String[] args) {
        A_Parent a = new A_Parent();
        a.method2(); // Parent class method2
        a.method3(); // Parent class method3
        System.out.println(a.city); // Parent


        B_Child b = new B_Child();
        b.method2();// child class method2
        b.method3();// child class method3
        System.out.println(b.city); // Child
        System.out.println("********+");

        A_Parent n = new B_Child();
        n.method2();// child class method2
        n.method3();// child class method3
        System.out.println(n.city); // Parent
       // n.method1(); // child class method1
    }
}
