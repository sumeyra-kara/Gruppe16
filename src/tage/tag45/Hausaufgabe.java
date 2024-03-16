package tage.tag45;

import java.util.Arrays;

public class Hausaufgabe {
    public static void main(String[] args) {
        // 2 5 7 9 10 11  12 16
        //"235 25 9 97 23 65 2118 2"
        String num = "2353 251 91 927 233 65 2118 2";

        String [] arr = num.split(" ");
        int [] toplam = new int [arr.length];

        for (int i = 0; i < arr.length; i++){
            int sayi = Integer.parseInt(arr[i]);
            int sum = 0;

            while (sayi !=0){
                int basamak = sayi%10;
                sum+=basamak;
                sayi/=10;
            }
            toplam[i]=sum;

        }
        // System.out.println(Arrays.toString(toplam));
        Arrays.sort(toplam);

        for (int i = 0; i < toplam.length; i++) {
            System.out.print(toplam[i] + " ");
        }






    }
}
