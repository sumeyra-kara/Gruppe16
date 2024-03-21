package selbstlernen._01_ilkKonular;

import java.util.Scanner;

public class BasitIfStatements {
    public static void main(String[] args) {

        // kullanicidan sayi isteyin
        // sayi 5 ile bölunebiliyorsa "sayi 5'in tam kati" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz :");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 5 == 0 ){
            System.out.println("Girilen sayi 5'in tam kati");
        }





    }
}
