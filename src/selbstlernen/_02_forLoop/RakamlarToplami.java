package selbstlernen._02_forLoop;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi; // mesela 1453 olsun
        int birlerBasamagi =0;
        int rakamlarToplami=0;

        // sayiyi nasil string yaparim?? (sayi+"").   ile string yaparim
        int basamakSayisi = (sayi+"").length(); // 4 oluyor
        System.out.println(basamakSayisi);

        for (int i = 1; i<= basamakSayisi; i++){
            birlerBasamagi = sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi/= 10;
        }
        System.out.println(rakamlarToplami);
    }
}
