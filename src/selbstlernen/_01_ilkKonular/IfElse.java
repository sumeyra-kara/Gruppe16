package selbstlernen._01_ilkKonular;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // kullanicidan bir eskenar ucgenin uc kenar uzunlugunu alin
        // ucgen eskenar ise "eskenar ucgen", degilse "eskenar degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini girin her kenardan sonra enter è basin : ");

        double kenar1 = scan.nextInt();
        double kenar2 = scan.nextInt();
        double kenar3 = scan.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }

    }
}
