package selbstlernen.stringManipulation;

import java.util.Scanner;

public class Mail_Kontrol_Contains {
    public static void main(String[] args) {
        // kullanicidan email isteyin. eger @ isareti yoksa "yanlis giris"
        // eger @gmail.com icermiyorsa "girilen mail gmail olmali" yazdirin
        // email @gmail.com ile bitmiyorsa "gecersiz mail" yazdirin
        // email bosluk iceriyorsa "yazim hatasi" yazdirin
        // eger hata yoksa "mailiniz kaydedildi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen e mail aresinizi giriniz");
        String email = scanner.nextLine();


        if (!(email.contains("@"))){
            System.out.println("yanlis giris");
        } else if (!(email.contains("@gmail.com"))){
            System.out.println("girilen mail gmail olmali");
        } else if (!(email.endsWith("@gmail.com"))){
            System.out.println("gecersiz mail");
        } else if (email.contains(" ")){
            System.out.println("yazim hatasi");
        } else{
            System.out.println("mailiniz kaydedildi");
        }


    }
}
