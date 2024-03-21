package selbstlernen._03_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis degerlerini akin
        // baslangic v bitis dahil olarasindaki tum tamsayilari toplayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangic ve bitis icin 2 tamsayi giriniz");

        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        int sayi = baslangic;
        int toplam = 0;

        while (sayi<= bitis){

            toplam+=sayi;
            sayi++;
        }
        System.out.println("toplam : " + toplam);

    }
}
