package selbstlernen._01_ilkKonular;

import java.util.Scanner;

public class SwitchCaseGunler {
    public static void main(String[] args) {

        // Kullanicidan gun numarasi alip haftaici ve haftasonu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz : ");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1 :
                System.out.println("Hafta ici");
                break;
            case 2 :
                System.out.println("Hafta ici");
                break;
            case 3 :
                System.out.println("Hafta ici");
                break;
            case 4 :
                System.out.println("Hafta ici");
                break;
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
                System.out.println("Hafta sonu");
                break;
            case 7 :
                System.out.println("Hafta sonu");
                break;
            default :
                System.out.println("gecersiz gun numarasi");
        }
        /* case 1 :
           case 2 :
           case 3 :
           case 4 :
           case 5 :
                System.out.println("Hafta ici");
                break;
           case 6 :
           case 7 :
                System.out.println("Hafta sonu");
                break;
           default:
               System.out.println("gecersiz gun numarasi");

               KISA SEKLI ILE BU SEKILDE YAPABILIRIZ
         */
    }
}

