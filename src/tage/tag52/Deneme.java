package tage.tag52;

public class Deneme {
    static int sayi =20;
    int yas=40;
    static String okul ="ITU";

    public Deneme (int a,int b,String c) {
        this.sayi = a;
        this.yas = b;
        this.okul = c;
    }

    public static void method1(Deneme dnm){
        System.out.println("sayi : " + dnm.sayi + ", yas: " + dnm.yas + ", okul: "+dnm.okul);
    }

    public static void main(String[] args) {
        Deneme obj1 = new Deneme(20,30,"ODTU");
        Deneme obj2 = new Deneme(15,25,"Marmara");

        method1(obj1); // sayi : 15, yas: 30, okul: Marmara
        method1(obj2); // sayi : 15, yas: 25, okul: Marmara
    }
}
