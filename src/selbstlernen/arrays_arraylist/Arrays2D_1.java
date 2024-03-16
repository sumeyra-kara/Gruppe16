package selbstlernen.arrays_arraylist;

import java.util.Arrays;

public class Arrays2D_1 {

    public static void main(String[] args) {
        // inner ve outer arraylari vardir. iceridekiler elementler inner arraydir

        int [][] arr = {{3,2,1,5},{1,2},{3,4,5},{10},{2,7}};
        System.out.println(arr.length); // 5 elemanli bir array

        System.out.println(Arrays.toString(arr[0])); //[3, 2, 1, 5]
        System.out.println(Arrays.toString(arr[1])); //[1, 2]

        System.out.println(arr[2][2]); // 5-- 2.indeksteki arra'in 2.indeksteki elementi
        System.out.println(arr[0][1]); //2

        //Array'in hepsini yani outerini yazdirmak istersek ;
        System.out.println(Arrays.deepToString(arr)); //[[3, 2, 1, 5], [1, 2], [3, 4, 5], [10], [2, 7]]

        // mesela 10 elementi yerine 12 yazdirmak istersem;
        arr[3][0]=12;
        System.out.println(arr[3][0]); // bu sekilde 12 yapmis oluruz
        System.out.println(Arrays.deepToString(arr)); //[[3, 2, 1, 5], [1, 2], [3, 4, 5], [12], [2, 7]]

        // diyelim 1.indeksteki inner arary'in 1.indeksteki elementin degerini 3 arttiralim.
        arr[1][1]+=3; // bu sekilde yapabilirz
        System.out.println(Arrays.deepToString(arr)); //[[3, 2, 1, 5], [1, 5], [3, 4, 5], [12], [2, 7]]

    }
}
