package selbstlernen._13_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05_CokluException {
    public static void main(String[] args) {

        String str = "Java her gecen gun güzellesiyor";

        int [] arr  ={3,4,5,2,3,4,2,3,4,2,4,3,7};

        //Kullanicidan 0 veya pozitif bir tam sayi isteyin, girilen degeri index olarak kullanip,
        // str ve arr'nin o indexteki elemanlarini bulunuz

        Scanner scan  =new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozitif bir tam sayi giriniz");
        /*
        Birbirinden bagimsiz 3 farkli turde exception riski var.Bunlari farkli sekillderde hanldle edebilirz

        1- herbirini ayri ayri try-catch yapabiliriz (bu guzel yontem degil bu soru icin)
        2- tek bir try, birden fazla catch yapabilirsiniz
        3- tek bir try-catc yapip tum exceptionlari yakalayacak bir ecception turu yazilabilir.

         */

        //3.YOL
/*
        try {
            int index = scan.nextInt(); // InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

            System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            // System.out.println("Giris hatali olabilir, index String vya Array'in disinda olabilir");
            //e.printStackTrace();
            // biz mesaj yazacaksak genel bir mesaj yazabiliriz
            //veya javanin hata kodlarini yazdirabiliriz
        }

 */

        System.out.println("***************+");


        // 2. YOL
        try {
            int index = scan.nextInt(); // InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

            System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
        } catch (InputMismatchException e) {
            System.out.println("Tam sayi girmelisin");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sinirlari disinda");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Array sinirlari disinda");
        }


    }
}
