package tage.tag46;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(220);
        numbers.add(100);
        numbers.add(30);
        numbers.add(40);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("****");

        int i = 0;
        do {
            System.out.println("nummer : " + numbers.get(i));
            i++;
        }while (i<numbers.size());


        System.out.println(numbers);//[10, 220, 100, 30, 40]

        Integer löschenElement = 10;
        numbers.remove(löschenElement);

        System.out.println(numbers);

    }
}
