package calisma;
import java.util.Scanner;
public class VucutKitleOrani {
    public static void main(String[] args) {
        // vucut kitle endeksi 30`dan buyukse obez,
        // 25-30 arasi ise kilolu
        // 20-25 arasi ise normal,
        // 20`den kucukse zayif yazdirin

        Scanner gelen = new Scanner(System.in);
        System.out.print("Lutfen agirliginizi kilo olarak giriniz :");
        double agirlik = gelen.nextDouble();

        System.out.print("Lutfen boyunuzu cm olarak giriniz giriniz :");
        double boy = gelen.nextDouble();

        double vke = agirlik * 10000 / (boy * boy);
        System.out.println("Vucut Kutle Endeksiniz : " + vke );

        if (vke>=30) System.out.println("Obez");
        else if (vke>=25) System.out.println("Kilolu");
        else if (vke>=20) System.out.println("Normal");
        else System.out.println("Zayif");



    }
}
