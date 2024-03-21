package selbstlernen._13_exceptions;

import java.util.Scanner;

public class _08_Throw_Keyword {
    /*
       FIRLAT demek.

       Kodlarimizi yazarken bazen belirli sartlar altinda bazi kodlarin ignore edilmesi istenebilir.
       Bu durumda kodlari ignore etme yöntemi olarak; isteyerek exception firlatip sonra da calismasini
       istedigimiz yerde catch ile exceptionu yakalayip normal calismaya  devam edebiliriz

       Kontrollu exception kullanimi kodun belli islemler icin baska satirlara gecmesi,belli methodlari kullanmasi
       gibi amaclarla kullanilabilir


     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();
        try {
            if (yas<0){
                throw new IllegalArgumentException ("Yanlis formatta giris yapildi!");
            }
        } catch (IllegalArgumentException e) {
            // System.out.println(e.getMessage()); eger bunu yorum olarak alirsam 26. satiri yazdirmaz
            System.out.println("yanlis yas girisi");
        }

    }
}
