package selbstlernen._08_arrays_arraylist;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        // SORU 1 :array'in tum elemanlarini 2 arrttirip,eski array'i yeni olarak kaydetmek istersek ne yapmaliyiz

        int [] arr = {5,1,7,9,2};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+2;
        }

        System.out.println(Arrays.toString(arr)); // [7, 3, 9, 11, 4]
        // methodla yapalim

       /* arr = elementArttir(arr,2);
        System.out.println(Arrays.toString(arr));
        */
    }

    public static int [] elementArttir (int [] arr, int artisMiktari){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+artisMiktari;
        }
        return arr;
    }

}
