package calisma2;

import org.w3c.dom.stylesheets.LinkStyle;
import tage.tag43.ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _1_Array1 {
    /*
    int[] nums={2,3,4,4,8,12,28,12,25,23,9,8,11,10,3,3,3};
    bir arrayde çiftleri bir tarafta tekleri ise diğer tarafta toplayan metodu yazınız
     */

    public static void main(String[] args) {

        int[] nums={2,3,4,4,8,12,28,12,25,23,9,8,11,10,3,3,3};
        System.out.println(Arrays.toString(tekcift2(nums)));





    }

    public static List<Integer> tekCift (int [] nums){
        List<Integer> number = new ArrayList<>();
        for (int n : nums){
            if (n%2==0){
                number.add(n);
            }
        }
        for (int n : nums){
            if (n%2!=0){
                number.add(n);
            }
        }
        //System.out.println(number);

        return number;

    }

    public static int [] tekcift2 (int [] nums){

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                if ((nums[i]%2!=0) && (nums[j] % 2==0)){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;



    }


}
