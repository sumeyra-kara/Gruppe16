package selbstlernen.whileLoop_DoWhileLoop;

import java.util.Scanner;

public class WhileLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // 1- while parantezinde kontrol ettigimiz degisken loop icerisinde degistirilmezse sonsuz loop olusur

        /*
        int sayi = 5;
        int sayac=0;

        while (sayi<=10){
            sayac++;
            System.out.println(sayac);
        }
         burada sonsuz olur cunku sayiyi degil sayaci kontrol ettik.
         sayiyi kontrol ediyorsak sayi ile ilgili degisiklik yapmaliyiz mesela sayi++ gibi
         */


        // 2- eger loop olusturulmadan once ihtiyac duydugumuz variableleri biz olusturuyorsak
        // loopun ilk defa calismasini ve kullanicidan degerler almasini engellemeyecek bir deger atamaya dikkat edilmeli

        // kullanicidan sayilar isteyin,verilen sayi pozitif oldugu muddetce sayilari toplayalim
        // ve negatif sayi girdiginde toplami yazdiralim

        int toplam=0;
        int sayi = 20;
        Scanner scanner = new Scanner(System.in);


        while (sayi>0){

            System.out.println("Lutfen toplanmak uzere pozitif tam sayilar girin");
            sayi = scanner.nextInt();

            if (sayi>0) toplam+=sayi;

        }
        System.out.println(toplam);

        // e3- eger loop oparantezinde yazdigimiz degisken icin looop icerisinde kullanicidan deger aliyorsak
        // aldigimiz degerin loop u bitirme ozelligi olmayan bir deger oldugundan emin olunca islemi yapmaliyiz
        // 39.satirdaki gibi

    }
}
