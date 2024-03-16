package calisma;
import java.util.Scanner;

public class CalismaDaireAlan {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner gelen = new Scanner(System.in);
        System.out.print("Dairenin Yari capini giriniz :");

        r = gelen.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);

    }

}
