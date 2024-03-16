package tage.tag52;

import java.util.Arrays;

public class Squares {
    public static void main(String[] args) {
        int [] nums = {3,5};

        System.out.println("nums = " + nums);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));  //3,5

        System.out.println("Arrays.toString(square(nums)) = " + Arrays.toString(square(nums)));  //6, 10

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));  //6,10
        System.out.println("nums = " + nums);

        String str = "Ahmet";
        System.out.println("str = " + str);
        System.out.println("reverse(str) = " + reverse(str));
        System.out.println("str = " + str);
    }
    public static int [] square(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] *=2;
        }

        return nums;
    }

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        str = result;
        return str;
    }


}
