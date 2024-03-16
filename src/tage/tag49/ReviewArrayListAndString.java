package tage.tag49;

import java.util.ArrayList;

public class ReviewArrayListAndString {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Mbappe : 7 - 8");
        list1.add("Messi : 7 - 7");
        list1.add("Alvarez : 7 - 4");
        list1.add("Giourd : 6 - 4");
        list1.add("Morata : 4 - 3");

        String[] result = list1.get(0).split(":");

        System.out.println(result[0]);
        System.out.println(result[1]);

        String[] numberString = result[1].split("-");

        System.out.println(numberString[0]);
        System.out.println(numberString[1]);


        int first = Integer.parseInt(numberString[0].trim());
        int second = Integer.parseInt(numberString[1].trim());

        System.out.println("first als int wert : " + first);
        System.out.println("second als int wert: " + second);

        if(second > 16)
        {
            System.out.println("neuer rekord");
        }
        else
        {
            System.out.println("kein neuer rekord");
        }









    }
}
