package tage.tag27;

public class VariablenInMethoden {
    public static void main(String[] args) {

        int number = 23; //  main methodu icine de yazabiliriz ayni isimle. degisen bir sey yok

        System.out.println(number);
        printNumber10();
        printNumber100();
        number = 1; // bu diger metotlardan sonra yazildiysa sonda verir

        System.out.println(number);

    }

    public static void printNumber10 () {
        int number= 10;
        System.out.println(number);
        number = 1223; // variable hat tamporär den Wert 1223,nach Aufruf der Methoode geht wert verloren
    }

    public static void printNumber100 () {
        int number = 100;
        System.out.println(number);
    }


}
