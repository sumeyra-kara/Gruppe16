package tage.tag47;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist5 {
    public static void main(String[] args) {

        ArrayList <Integer> numbers  =new ArrayList<>(Arrays.asList(1,22,3,4,54,213));
        ArrayList <String> text = new ArrayList<>(Arrays.asList("text1","text2"));


        System.out.println(numbers);
        System.out.println(text);

        numbers.add(2344);
        System.out.println(numbers);
    }
}
