package calisma;
import java.util.Scanner;
public class CalismaMeyveToplamDeger {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican= 5;

        Scanner giren = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? : ");
        double aKilo = giren.nextDouble();

        System.out.print("Elma Kac Kilo ? : ");
        double eKilo = giren.nextDouble();

        System.out.print("Domates Kac Kilo ? : ");
        double dKilo = giren.nextDouble();

        System.out.print("Muz Kac Kilo ? : ");
        double mKilo = giren.nextDouble();

        System.out.print("Patlican Kac Kilo ? : ");
        double pKilo = giren.nextDouble();

        double toplam = (armut * aKilo) + (elma * eKilo) + (domates * dKilo) + (muz * mKilo) + (patlican * pKilo);

        System.out.println("Toplam Tutar :" + toplam);












    }
}
