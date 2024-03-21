package selbstlernen._01_ilkKonular;

public class PreincrementPostIncrement {

    public static void main(String[] args) {

        int sayi = 10;
        // sayi degerini olusturacagimiz b variablesine atayalim
        // sonra sayi degerini 1 arttiralim

        int b = sayi; // b=10
        sayi++;

        System.out.println(b); // 10
        System.out.println(sayi); // 11

        // bunu tek satirda yapabiliriz
        int c= sayi++; //once sayinin degerini atayip sonra 1 arttirir
        System.out.println(c); // 11
        System.out.println(sayi); //12

        sayi =11;
        c=++sayi;
        System.out.println(c); // sayiyi 1 arttirp atiyoruz c ye 12 oluyor
        System.out.println(sayi); // sayiyi 1 arttirmistik 12 olmustu





    }
}
