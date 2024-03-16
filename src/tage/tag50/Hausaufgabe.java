package tage.tag50;

import java.util.Arrays;
import java.util.Random;

public class Hausaufgabe {
    public static void main(String[] args) {

        //System.out.println("Würfelwert aus Methode 1 (Random Class): "+ wuerfeln1());
        System.out.println(Arrays.toString(arrays()));

    }

    public static int [] arrays(){
        int [] arr = new int [100];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= wuerfeln1();
            //arr[i]= wuerfeln2();
        }
        return arr;
    }

    public static int wuerfeln1(){
        Random random = new Random();
        int n = random.nextInt(6) + 1;
        return n;
    }
    public  static int wuerfeln2(){
        int n = (int) (Math.random() * 6 + 1);
        return n;
    }

}
