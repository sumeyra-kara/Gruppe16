package selbstlernen.arrays_arraylist;

import java.util.Arrays;

public class Array9 {

    public static void main(String[] args) {
        int [] sayi = {4,2,1};

        // mesela 4. element olarak 3 sayisini ekleyebilir miyiz
        // yeni array olusturmaliyiz

        // sayilar [3] = 3; dersek hata olur bu sekilde yapamayiz

        int eklenecekElement = 3;
        int [] yenisayi = new int[sayi.length+1];
        System.out.println(Arrays.toString(yenisayi)); // [0, 0, 0, 0]

        for (int i = 0; i < sayi.length; i++) {
            yenisayi[i]=sayi[i];
        }

        yenisayi[yenisayi.length-1] = eklenecekElement;
        sayi=yenisayi;
        System.out.println(Arrays.toString(sayi)); // [4, 2, 1, 3]




    }
}
