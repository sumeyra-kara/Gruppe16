package selbstlernen.arrays_arraylist;

import java.util.Arrays;

public class Array5_sort {
    public static void main(String[] args) {

        // Bir Arrray'in elemanlari nasil siralanir--SORT METHODU ile---Arrays.sort()

        int [] arr = {1,3,9,5,2,7,4};
        System.out.println(Arrays.toString(arr)); //[1, 3, 9, 5, 2, 7, 4]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 7, 9]

        System.out.println("En buyuk sayi :" + arr[arr.length-1]);
        System.out.println("En kucuk sayi :" + arr[0]);


        // String olursa peki?
        String [] namen = {"Seher","Selim","Songül","Merve","Ali","sedat","Saime"};
       System.out.println(Arrays.toString(namen)); //[Seher, Selim, Songül, Merve, Ali, Sedat, Saime]


        Arrays.sort(namen);
        System.out.println(Arrays.toString(namen)); // [Ali, Merve, Saime, Seher, Selim, Songül, sedat]
        // Natural order denilir-dogal siralama yani
        // eger string uzunlugu ayni ise ilk harfe bakar, o da ayni ise 2. harfe vs..
        // ayrica buyuk harfler her zaman kucuk harflerden önce siralanir.(asc2 tablosuna göre)

        // eger buyukten kucuge dogru sirlamayi sorarsa, önce sort ile siralayip sonra for-loop yapmaliyiz

    }
}
