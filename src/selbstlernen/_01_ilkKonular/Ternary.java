package selbstlernen._01_ilkKonular;

public class Ternary {
    public static void main(String[] args) {

        // Bedingung ? wert1 : wert2

        // deger atanabilir ya da yazdirilabilir sout ile

        int input =56;

        System.out.println(input>0 ? "True" : "False");

        input = input %2 == 0 ? input * 2 : input+5;
        System.out.println(input);

        // 2 basamakli mi ? eger öyleyse sayiyi iki katina cikarin. degilse 2 basamakli degil yazdir
        // 2 farkli data tipi olmaz atama icin.yazdirmada olur

        int input2 = 240;
        System.out.println((input2>=10 && input2<100) ? input2*2 : "iki basamakli degil");

        int a=50,b=200;
        System.out.println(a>b ? a : b);

        // eger kullanicidan alsaydik su adimlar yapilamli: Scanner scan = new...
        // sout--Lutfen 2 sayi giriniz
        //double sayi1 = scan.nextDouble();---double sayi2 = scan.nextDouble();---
        //System.out.println(sayi1>sayi2 ? sayi1 : sayi2);


        int mutlakSayi = -100;

        mutlakSayi = mutlakSayi<0 ? -mutlakSayi : mutlakSayi;
        System.out.println(mutlakSayi);



    }
}
