package tage.tag42;

import java.util.Arrays;

public class C02Arrays {

    public static void main(String[] args) {
        // İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.

        int [] nums = {1,35,67,2};
        System.out.println(Arrays.toString(toplaCarp(nums)));

    }

    public static int [] toplaCarp (int [] sayilar){

        int [] resultArr = new int[2];
        int toplam = 0;
        int carpim =1;

        for (int sayi : sayilar) {
            toplam+=sayi;
            carpim*=sayi;
        }

        resultArr[0]= toplam;
        resultArr[1]= carpim;

        return resultArr;


    }


}
