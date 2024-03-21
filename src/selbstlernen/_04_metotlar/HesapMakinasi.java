package selbstlernen._04_metotlar;

import java.util.Scanner;

public class HesapMakinasi {
    static int sum (int a, int b){
        int result =a +b;
        System.out.println("toplam : " + result );
        return result;
    }
    static int minus (int a,int b){
       int result = a-b;
        System.out.println("Cikarma : " + result);
        return result;
    }
    static int times (int a,int b){
        int result = a*b;
        System.out.println("Carpma : " + result);
        return result;
    }
    static int divided (int a,int b){
        int result = a/b;
        System.out.println("bölme : " + result);
        return result;
    }
    static int power (int a,int b){
        int result = 1;
        for (int i = 1; i <= b ; i++) {
            result *=a;
        }
        return result;
    }
    static int mod (int a,int b){
        int result = a/b;
        return a% b;
    }
    static void calc (int a,int b){
        System.out.println("cevresi : " + (2*(a+b)));
        System.out.println("alani : " + (a*b));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bölme islemi\n"
                + "5- Üslü Sayi Hesaplama\n"
                + "6- Mod alma\n"
                + "7- Dikdörtgen alan ve cevre hesabi\n"
                + "0- Cikis yap\n";

        while (true) {
            System.out.println(menu);
            System.out.print("bir islem seciniz : ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }
            System.out.println("lütfen a sayisini giriniz");
            int a = scan.nextInt();
            System.out.println("lütfen b sayisini giriniz");
            int b = scan.nextInt();
            ;

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2 :
                    minus(a,b);
                    break;
                case 3 :
                    times(a,b);
                    break;
                case 4 :
                    divided(a,b);
                    break;
                case 5 :
                    System.out.println("üs hesabi : " +  power(a,b));
                    break;
                case 6 :
                    System.out.println(mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;

                default:

                    System.out.println("gecersiz bir islem girdiniz");

            }


        }
    }


}
