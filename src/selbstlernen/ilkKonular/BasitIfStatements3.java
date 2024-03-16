package selbstlernen.ilkKonular;

import java.util.Scanner;

public class BasitIfStatements3 {
    public static void main(String[] args) {

        //kullanicidan sayi alin
        // sayi 3 ile bölunebiliyorsa "Uc ile bölunebilen sayi"
        // 5 ile bölunebiliyorsa "bes ile bölunebilen sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");

        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0 ){
            System.out.println("Uc ile bölunebilen sayi");
        }

        if (girilenSayi % 5 == 0 ){
            System.out.println("Bes ile bölunebilen sayi");
        }



    }
}
