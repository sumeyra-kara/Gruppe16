package tage.tag43;

import java.util.Arrays;

public class ArrayMultiDimensional {

    public static void main(String[] args) {

        int [][] array = new int[2][2]; // 5 tane dis array 5 tane anner array

        array [0][0]=10;
        array [0][1]=20;
        array [1][0]=40;
        array [1][1]=50;

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));

        array[0][1]+=22;
        System.out.println(Arrays.deepToString(array));
    }
}
