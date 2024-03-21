package selbstlernen._08_arrays_arraylist;

import java.util.Arrays;

public class Array7_equals {
    public static void main(String[] args) {

        // Array.equals(arr1,arr2)-- iki array esitligi kontrolu icin
        // ayni ise TRUE, farkli ise FALSE dondurur

        int [] arr1 = {2,1,7,6};
        int [] arr2 = {1,7,6,2};

        System.out.println(Arrays.equals(arr1,arr2)); // false--elemanlar ayni olsa da siralama farkli cunku

        int [] arr3 = {4,2,6,8,11};
        int [] arr4 = {2,6,8,4,11};

        Arrays.sort(arr3);
        Arrays.sort(arr4);

        System.out.println(Arrays.equals(arr3,arr4)); // true cunku artik siraladik.elemanlar da siralama da ayni
    }

}
