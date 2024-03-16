package calisma;
import java.util.Scanner;
public class NotOrtalamasinaGöreSinifiGecme {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, müzik; // double olarak da tanimlayabilirz
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat = input.nextInt();
        System.out.println("Fizik notunuz:");
        fizik = input.nextInt();
        System.out.println("Turkce notunuz:");
        turkce = input.nextInt();
        System.out.println("Kimya notunuz:");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz:");
        müzik = input.nextInt();

        double ort = (mat + turkce + fizik + müzik + kimya)/5.0;
        System.out.println(ort);

        if (ort<=55) {
            System.out.println("sinifta kaldiniz");
        } else {
            System.out.println("tebrikler sinifi gectiniz");
        }
    }
}
