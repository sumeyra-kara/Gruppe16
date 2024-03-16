package selbstlernen.forLoop;

import java.util.Scanner;

public class ForLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // eger i'nin ilk degeri icin bile bitis sarti true olmazsa loop body si hicbir islem yapmaz.
        //hata vermez.loop aslinda calisir ama devreye girmez.konsola yazdirmaz

        // ÖRNEK--- for (int i= 10; i>20; i++){ sout (i + "")


        // eger i'nin butun degeri icin bitis sarti true oluyorsa

        // for (int i=10; i>0; i++){ // ilk 10 sonra 11 sonra 12 diye hep sonsuza kadr gider teknik olarak

        // kullanicidan pozitif bir sayi alalim. 1'den girilen sayiya kadar(sayi da dahil) 7 ile bölunen sayilari bul

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int sayi = scanner.nextInt();
        for (int i = 1; i<=sayi; i++){
            if (i%7==0)  System.out.print(i + " "); // bu sekilde yanina da yazdirabilirim
        }








    }
}
