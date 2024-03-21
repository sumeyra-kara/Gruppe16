package selbstlernen._04_metotlar;

import java.util.Scanner;

public class AsalSayiMethod {

    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip, sonuc olarak “asal sayi”
        // veya “asal sayi degil” yazdiran bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        asalSayiMi(sayi);

    }
    public static void asalSayiMi (int sayi ){

        int flag= 20;

        for (int i = 2; i < sayi ; i++) {

            if (sayi%i==0){
                flag++;
                break;
            }
        }

        if (flag==20){
            System.out.println("asaldir");
        } else{
            System.out.println("asal degildir");
        }

    }

    /* baska yol.asal sayi bulmak icin
    public static boolean primeNumber (int number){

        if (number<=1){
            return false;
        }

        for (int i = 2; i < number ; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;

    }
     */


}
