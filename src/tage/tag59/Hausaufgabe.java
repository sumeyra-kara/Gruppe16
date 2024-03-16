package tage.tag59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Hausaufgabe {

    public static void main(String[] args) {


        String str = "red2 blue4 black3 yellow1 green6 gold5";
        String[] list = str.split(" ");
        System.out.println("Ilk arrayList : " + Arrays.toString(list));

        String [] neuString = new String[list.length];


        for (int i = 0; i < list.length; i++) {
            String neu = list[i].replaceAll("\\d", "");
            neuString[i]=((list[i].charAt(list[i].length() - 1)+ neu));

        }

        System.out.println("Sayilari basa almis hali olan list :  " + Arrays.toString(neuString));

        Arrays.sort(neuString);
        System.out.println("Array'in siralanmis hali : " + Arrays.toString(neuString));

        System.out.println("Sayilari atmis hali : " + Arrays.toString(neuString).replaceAll("\\d", ""));

        /*
        String result = String.join(" ",neuString);
        System.out.println(result);
        result =result.replaceAll("\\d", "");
        System.out.println(result);
         */

    }
}
