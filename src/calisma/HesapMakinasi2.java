package calisma;
import java.util.Scanner;
public class HesapMakinasi2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sayi1, sayi2;

        System.out.println("1.sayiyi giriniz : ");
        sayi1 = input.nextDouble();
        System.out.println("2.sayiyi giriniz : ");
        sayi2 = input.nextDouble();

        System.out.println("Isleminizi seciniz");
        String islem = input.next();

        switch (islem) {
            case "toplama":
                System.out.println(sayi1 + sayi2);
                break;
            case "cikarma":
                System.out.println(sayi1 - sayi2);
                break;
            case "carpma":
                System.out.println(sayi1 * sayi2);
                break;
            case "bölme":
                System.out.println(sayi1 / sayi2);
                break;
            default:
                System.out.println("istediginiz islem bulunamadi");
        }





    }
}
