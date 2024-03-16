package calisma;
import java.util.Scanner;
public class CalismaVucutKitleIndeks {
    public static void main(String[] args) {

        Scanner gelen = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu giriniz :");
        double boy = gelen.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz :");
        double kilo = gelen.nextDouble();

        double indeks = kilo / (boy * boy);


        System.out.println("Vucut Kitle Indeksiniz :" + indeks);

        // double vke = kilo*10000 / (boy * boy)



    }
}