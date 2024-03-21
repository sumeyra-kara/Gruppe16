package selbstlernen._01_ilkKonular;

import java.util.Scanner;

public class NestedIfElseKisaYol1 {
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
        //mesela cinseyeti secelim

        if (cinsiyet.equalsIgnoreCase("Kadin")) {
            //kadin bölumu
            if (yas<0 || yas>90) {
                System.out.println("yas girisi gecersiz");
            } else if (yas<60) {
                System.out.println("Emekli olman icin" + (60-yas)+ " yil daha calisman lazim");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            //erkek bölümu
            if (yas<0 || yas>90) {
                System.out.println("yas girisi gecersiz");
            } else if (yas<65) {
                System.out.println("Emekli olman icin" + (65-yas)+ " yil daha calisman lazim");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {
            System.out.println("Cinsiyet girisi hatali");
        }





    }
}
