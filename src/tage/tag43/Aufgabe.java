package tage.tag43;

import java.util.Arrays;

public class Aufgabe {

    public static void main(String[] args) {

        int [] a = {12,3,5,6,9};

        for (int i = 0; i < a.length; i++) {
            //a[i]= a[i]*a[i];
        }

        //System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(kareler(a)));
    }

    public static int[] kareler (int [] array){

        int [] arr = new int[array.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i] * array[i];
        }


        return arr;
    }
}
