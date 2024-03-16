package selbstlernen.ilkKonular;

import java.util.Scanner;

public class NestedIfElseKisaYol2 {
    public static void main(String[] args) {
        // kullanicidan cinsiyet ve yas alin
        // kadin 60 veya buyukse, erkek 65 yas ve ustu emekli olabilir
        // "emekli olabilirsin" ya da "emekli olmak icin .. yil daha calisman lazim" yazdir
        // kisa olarak nested if else ile yazma bicimi 1.yol

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz : ");

        String cinsiyet = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz : ");
        double yas = scan.nextDouble();

        //önce degiskenlerden birini ana degisken secelim
        //mesela yasi secelim

        if (yas < 0 || yas > 90) {
            System.out.println("Yas girisi gecersiz");
        } else if (yas < 60) {
            // 60 yastan kucuk böumu
            if (cinsiyet.equalsIgnoreCase("Kadin")) {
                System.out.println("Emekli olman icin" + (60 - yas) + " yil daha calisman lazim");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olman icin" + (65 - yas) + " yil daha calisman lazim");
            } else {
                System.out.println("cinsiyet girisi gecersiz");
            }
        } else if (yas < 65) {

            // 60-65 arasi
            if (cinsiyet.equalsIgnoreCase("Kadin")) {
                System.out.println("Emekli olabilir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olman icin" + (65 - yas) + " yil daha calisman lazim");
            } else {
                System.out.println("cinsiyet girisi gecersiz");
            }
        } else {
            //65-90 arasi
            if (cinsiyet.equalsIgnoreCase("Kadin")) {
                System.out.println("Emekli olabilir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("emekli olabilir");
            } else {
                System.out.println("cinsiyet girisi gecersiz");
            }
        }
    }
}


