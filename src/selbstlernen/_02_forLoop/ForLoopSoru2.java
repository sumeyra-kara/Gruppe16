package selbstlernen._02_forLoop;

import java.util.Scanner;

public class ForLoopSoru2 {
    public static void main(String[] args) {


        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis icin iki pozitif sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int toplam =0;

        if (sayi1<sayi2){
            for (int i= sayi1; i<=sayi2; i++){
                toplam+=i;
            }

        } else  { //bitis< baslangic
            for (int i = sayi2; i<=sayi1; i++) {
                toplam+=i;
            }
        }

        System.out.println(toplam+" ");





    }
}
