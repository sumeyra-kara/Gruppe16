package tage.tag52;

public class Hausaufgabe {
    static  int sayi = 20;
    int yas=40;

    public Hausaufgabe(){
        sayi++;
        yas=10;
    }

    public static int method1 (){
        return 2*sayi;
    }

    public static void main(String[] args) {
        Hausaufgabe obj1 = new Hausaufgabe();
        Hausaufgabe obj2 = new Hausaufgabe();

        int sonuc = obj2.method1();
        System.out.println(obj2.yas + "," + obj2.sayi+","+sonuc);// 10,22,44
    }
}
