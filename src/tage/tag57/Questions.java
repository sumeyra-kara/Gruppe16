package tage.tag57;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Questions {

    public static void main(String[] args) {


        int [] arr1 = {2,4,8};
        int [] arr2 = {2,3,4,8,10,16};
        int [] arr3 = {4,8,14,40};



        for (int a : arr1){

            for (int b : arr2){

                for ( int c : arr3){

                    if ((a==b)&&(b==c)){
                        System.out.println(a);
                    }
                }

            }
        }


        System.out.println("**** TASK 3 ******");
        // Task 3

        int [] tekCift = {5,7,2,4,9};
        int cift=0;
        int tek=0;

        for (int i = 0; i < tekCift.length; i++) {

            if (tekCift[i]%2==0){
                cift++;
            }else {
                tek++;
            }

        }
        System.out.println("tek sayilarin sayisi :" + tek);
        System.out.println("cift sayilarin sayisi :" + cift);

        System.out.println("******* TASK 4 **********");

        // Task 4

        int [] aradakiFark = {5,7,2,4,9};

        Arrays.sort(aradakiFark);
        // System.out.println(Arrays.toString(aradakiFark));
        int min = aradakiFark[0];
        int max = aradakiFark[aradakiFark.length-1];

        System.out.println("Arraydeki en büyük fark : " + (max-min));



        System.out.println("*************** TASK 2 *************");



        int [] ball = {8,2,4,3,1,6,7}; // 1 2 3 4 5 6 7 8----- 8*9/2 36-(31)= 5
        Arrays.sort(ball);
        //System.out.println(Arrays.toString(ball)); //[1, 2, 3, 4, 6, 7, 8]

        int minimumWert = ball[0];
        int maximumWert = ball[ball.length-1];
        System.out.println("Minimum ist : " + minimumWert + " " + "Maximum ist : " + maximumWert);


        for (int i = 1; i < ball.length; i++) {

            if (!(ball[i]-ball[i-1] == 1)){
                System.out.println("missing : " + (ball[i]-1));
            }

        }













    }
}
