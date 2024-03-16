package selbstlernen.arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array6_binarySearch {

    public static void main(String[] args) {

        int[] arr = {3,8,9,1,4,2,12,5};


        System.out.println(Arrays.binarySearch(arr, 2)); // 5
        System.out.println(Arrays.binarySearch(arr, 12)); // 6
        System.out.println(Arrays.binarySearch(arr, 5)); // -7
        System.out.println(Arrays.binarySearch(arr, 3)); // -7
        System.out.println(Arrays.binarySearch(arr, 8)); // -7
        System.out.println(Arrays.binarySearch(arr, 9)); // -7
        System.out.println(Arrays.binarySearch(arr, 1)); // 3
        System.out.println(Arrays.binarySearch(arr, 4)); // -7

        // BinarySearch özel bir yöntemdir.
        // yazdirma islemi yapmadan SORT methodunu kullanip siralamaliyiz yoksa bazen yanlis sonuclar alabiliriz

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));// [1, 2, 3, 4, 5, 8, 9, 12]
        // sort methodunu kullandiktan sonra atik dogru sonuclari aliriz

        System.out.println(Arrays.binarySearch(arr, 2)); // 1
        System.out.println(Arrays.binarySearch(arr, 12)); // 7
        System.out.println(Arrays.binarySearch(arr, 5)); // 4
        System.out.println(Arrays.binarySearch(arr, 3)); // 2
        System.out.println(Arrays.binarySearch(arr, 8)); // 5
        System.out.println(Arrays.binarySearch(arr, 9)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // 0
        System.out.println(Arrays.binarySearch(arr, 4)); // 3

        System.out.println("*********");

        // peki olmayan bir eleman yazarsak ne olur
        System.out.println(Arrays.binarySearch(arr, -3)); // -1
        System.out.println(Arrays.binarySearch(arr, 0)); // -1
        System.out.println(Arrays.binarySearch(arr, 6)); // -6
        System.out.println(Arrays.binarySearch(arr, 13)); // -9
        System.out.println(Arrays.binarySearch(arr, 58)); // -9
        System.out.println(Arrays.binarySearch(arr, 100)); // -9
        System.out.println(Arrays.binarySearch(arr, 44)); // -9

        //mesela -3 icin--eger array'e koymak istesek 1'in önune koymaliydik. 1 de 0.indeks olunca onun bir öncesi -1dir
        //0 icin de aynisi gecerli.1 in önune gelirdi.yani -1
        //6 icin de o arrayde eger olsaydi 5 den sonraya yani 6.siraya gelmeliydi.sonra da basina eksi koyuyoruz
        // 13 eger olsaydi 12 den sonraya yani 9.sirada olmaliydi o yuzden -9
        // 12 den sonraki tum yailar icin -9 olur
        // veya 2 den önceki tum sayilar icin de mesela -1 olur bu örnege göre

        // olmayan sayilarda olmadigini belirtmek icin -  kullaniliyor
        // olmayan elementlerin yerlrini de sira olarak verir

        // binary Search icin mutalaka SORT lazim


    }
}
