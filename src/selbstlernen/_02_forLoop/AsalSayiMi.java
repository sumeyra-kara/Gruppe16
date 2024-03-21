package selbstlernen._02_forLoop;

import java.util.Scanner;

public class AsalSayiMi {
    public static void main(String[] args) {
        // kullanicidan pozitif sayi alin ve asal mi diye kontrol et

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        //flag

        int flag=9; // istedigimiz sayi koyabiliriz
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
            }
        }

        if (flag==9){
            System.out.println("girilen sayi asal");
        } else {
            System.out.println("girilen sayi asal degil");
        }

    }
}
