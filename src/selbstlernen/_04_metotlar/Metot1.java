package selbstlernen._04_metotlar;

import java.util.Scanner;

public class Metot1 {
    public static void main(String[] args) {

        /*
        verilen bir string ve baslangic ve bitis indexleri icin asagidaki görevleri tamamlayin
        1-baslangic indeksi>bitis indeksi   hata yazdirin
        2-baslangic ve/veya bitis indexi verilen string in disinda ise hata yazdirin
        3-indexler sinirlar icerisinde ise baslangic indeksi dahil bitis indeksi haric olacak
        sekilde 2 indeks arasindaki harfleri yazdirin
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String metin= scanner.nextLine();

        System.out.println("baslangic indeksini giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("baslangic indeksini giriniz");
        int bitis= scanner.nextInt();

        if (baslangic>bitis){
            System.out.println("baslangic indeksi bitis indeksinden kücük olmalidir");
        } else if (baslangic>= metin.length() || bitis>= metin.length()) {
            System.out.println("verilen indeksler metnin disinda");
        } else{
            for (int i = baslangic; i < bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }

        // yukaridaki her sey icin sadece asagidakini yapabiliriz
        System.out.println("");
        System.out.print(metin.substring(baslangic, bitis));






    }
}
