package calisma;

import java.util.Scanner;

public class Atm_SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String kartNo, parola ;
        kartNo = "983777";
        parola = "8282";
        System.out.println("Wilkommen Deutsche Bank");
        System.out.println("Lutfen kart No Giriniz : ");
        kartNo = scan.nextLine();
        System.out.println("Lutfen sifrenizi giriniz");
        parola = scan.nextLine();
        System.out.println("Lutfen isleminizi seciniz");




        int bakiye =1000;
        int islem;


        System.out.println("1. Bakiye görüntüle");
        System.out.println("2. Para Yatirma");
        System.out.println("3. Para Cekme");
        System.out.println("4. Sistemden cikis");

        islem = scan.nextInt();

        switch (islem){
            case 1 :
                System.out.println("Bakiyeniz : " + bakiye + "tl`dir ");
                break;
            case 2 :
                System.out.println("Ne kadar yatiracaksiniz");
                int miktar = scan.nextInt();
                System.out.println("Bakiyeniz : " + (bakiye+miktar) + "tl`dir ");
                break;
            case 3 :
                System.out.println("Ne kadar cekeceksiniz");
                miktar = scan.nextInt();
                if(miktar <= bakiye){
                    System.out.println("Bakiyeniz : " + (bakiye-miktar) + "tl`dir ");
                } else {
                    System.out.println("bakiyeniz yetersiz");
                }
                break;
            case 4 :
                System.out.println("sistemden cikiliyor");
                System.out.println("Bakiyeniz : " + bakiye + "tl`dir ");
                break;
            default:
                System.out.println("Gecersiz islem");

        }





    }
}
