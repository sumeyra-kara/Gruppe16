package calisma2;

import java.util.Arrays;

public class _2_Beispiel {
    //Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

    //For example:
    //Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

    public static void main(String[] args) {

        long sayi = 99999999l;
        System.out.println("sayi = " + sayi);

        long birlerBasamagi =0;
        long rakamlarToplami=0;

        int basamakSayisi = (sayi+"").length();
        System.out.println("basamak sayisi = " + basamakSayisi);
        System.out.println("***");

        for (int i = 1; i<= basamakSayisi; i++){

            birlerBasamagi = sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi/= 10;

        }

        System.out.println("rakamlarToplami = " + rakamlarToplami);

        System.out.println((rakamlarToplami % 10)+(rakamlarToplami/10));


    }
}
