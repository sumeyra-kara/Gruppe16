package selbstlernen._03_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class KarekokBulma {
    public static void main(String[] args) {

        // kullanicidan pozitif sayi alalim,tam kare mi diye bakalim
        /// tamkare ise true,degilse false yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        int karekok = 1;

        int flag=10;

        // for loop ile

        for (int i = 1; i*i <= sayi; i++) {
            if ( i * i == sayi){
                flag++;
                break;
            }
        }
        if (flag==10){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        // do While ile yapalim

        karekok = 1;
        flag=10;

        do {
            if ( karekok * karekok == sayi){
                flag++;
                break;
            }
            karekok+=1;

        }  while (karekok*karekok <= sayi);

        if (flag==10){
            System.out.println("false");
        } else {
            System.out.println("true");
        }



    }
}
