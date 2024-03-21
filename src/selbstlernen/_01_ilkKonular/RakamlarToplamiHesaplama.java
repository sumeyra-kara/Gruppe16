package selbstlernen._01_ilkKonular;

import java.util.Scanner;

public class RakamlarToplamiHesaplama {

    public static void main(String[] args) {

        //3 basamakli bir tamsayinin rakamlar toplamini bulalim (123)
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBas =0;
        int rakamlarToplami=0;

        //3 basamak icin ayni islmei uc sefer yapmamiz lazim
        birlerBas = sayi%10;// 3
        rakamlarToplami = rakamlarToplami+birlerBas; //3
        sayi = sayi/10; // 12.3 ----- 12

        birlerBas = sayi%10; // 2
        rakamlarToplami = rakamlarToplami + birlerBas; //3+2 = 5
        sayi = sayi/10; // 1.2 --- 1

        birlerBas = sayi%10; // 1
        rakamlarToplami = rakamlarToplami +birlerBas; //5 +1_ 6
        sayi=sayi/10; // 0.1 ----0

        System.out.println("sayinin rakamlar toplami :" + rakamlarToplami);







        //System.out.println(123%10); // 3 birler basamagi
        //System.out.println(123/10); // 12.3 --- 12
        //System.out.println(12%10); // 2 onlar basamagi
        //System.out.println(12/10); // 1.2 ---- 1
        //System.out.println(1%10); // 1 yuzler basamagi





    }
}
