package selbstlernen._12_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _7_ArraydekiTekrarlardanKurtulma {
    /*
    Array'deki tekrar eden elementleri sadece 1 kez yazdiraack array'i kisaltan bir kod yaziniz.
     */

    public static void main(String[] args) {

        int [] arr = {2,3,4,5,1,2,4,2,5,4,7,8,4,2,3,5,6,7,1,3,2};

        Set<Integer> benzersizSet =  new HashSet<>(); // buranin sag tarafinda istedigimiz child classlardn birisi kullanilablr

        // Arraydeki tum elemanlari set'e ekleyelim

        for (int each : arr){
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet); // [1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 1, 2, 4, 2, 5, 4, 7, 8, 4, 2, 3, 5, 6, 7, 1, 3, 2]

        // diger yol ------
        arr = new int[benzersizSet.size()];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]

        int index =0;
        for (int each : benzersizSet){
            arr[index]=each;
            index++;
        }
        System.out.println("array'in son hali : " + Arrays.toString(arr)); // array'in son hali : [1, 2, 3, 4, 5, 6, 7, 8]





    }
}
