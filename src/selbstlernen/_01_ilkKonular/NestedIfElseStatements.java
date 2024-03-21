package selbstlernen._01_ilkKonular;

import java.util.Scanner;

public class NestedIfElseStatements {
    public static void main(String[] args) {

        // kullanicidan cinsiyet ve yas alin
        // kadin 60 veya buyukse, erkek 65 yas ve ustu emekli olabilir
        // "emekli olabilirsin" ya da "emekli olmak icin .. yil daha calisman lazim" yazdir


        //uzun uzun if else ile yazma bicimi

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz : ");

        String cinsiyet = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz : ");
        double yas = scan.nextDouble();

        if (yas<0 || yas>90) {
            System.out.println("Girilen yas gecersiz");
        } else if (!(cinsiyet.equalsIgnoreCase( "Kadin") || cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("Girilen cinsiyet gecersiz");
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas<60) {
            System.out.println("Emekli olman icin" + (60-yas)+ " yil daha calisman lazim");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas>=65) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas<65) {
            System.out.println("Emekli olman icin" + (65-yas) + " yil daha calisman gerekir");
        }

    }
}
