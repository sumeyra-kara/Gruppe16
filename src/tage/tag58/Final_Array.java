package tage.tag58;

import java.util.Arrays;

public class Final_Array {

    public static void main(String[] args) {


        int[] number = {1,2,3,4,5};
        int[] copy = {6,7,8,9,10};
        System.out.println("number: " + Arrays.toString(number));
        System.out.println("copy  : " + Arrays.toString(copy));

        number[0] = 999;
        //System.out.println("Werte: " + Arrays.toString(number));

        number = copy; // referenz/objekt wurde überschrieben

        System.out.println("number: " + Arrays.toString(number));
        System.out.println("copy  : " + Arrays.toString(copy));
        System.out.println("****");


        final int[] number2 = {1,2,3,4,5};
        number2[0] = 10;
        //number2 = copy;   referenz nicht überschreibbar wegen final keyword!!
        copy = number2;


    }
}
