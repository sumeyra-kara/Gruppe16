package selbstlernen._02_forLoop;

import java.util.Scanner;

public class ForLoopSoru {

    public static void main(String[] args) {


        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic bir pozitif sayi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("lutfen bitis degeri olarak pozitif bir tam sayi giriniz");
        int sayi2 = scanner.nextInt();

        int toplam = 0;

        if (sayi2 < sayi1) {
            System.out.println("hata");
        } else {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
            System.out.println(toplam + " ");
        }


    }
}