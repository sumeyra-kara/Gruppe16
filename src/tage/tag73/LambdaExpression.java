package tage.tag73;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 20, 60, 80, 4 , 15 ,70));

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }

        System.out.println("**************************************");

        //numbers.stream().forEach(System.out::println);

        numbers.stream().forEach( x -> {
            System.out.println(x);
            System.out.println("--");
            System.out.println(x+10);

        });

        System.out.println("*****************************************+");

        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.add(5);
        numbers2.add(9);
        numbers2.add(8);
        numbers2.add(1);
        numbers2.add(6);

        numbers2.forEach(
                (n) -> {
                    System.out.println(n);
                }
        );

        List<Integer> collect;
        collect = numbers.stream().filter( x -> x < 10).collect(Collectors.toList());

        System.out.println("collection filtered:  " + collect);



    }


    public static void printblabla(){
        //...
    }

    public void blablabla(){
        //...
    }
}
