package tage.tag37;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        Random randomNumber = new Random();

        System.out.println(randomNumber.nextInt());
        System.out.println(randomNumber.nextDouble());
        System.out.println(randomNumber.nextFloat());
        System.out.println(randomNumber.nextBoolean());

        // mit parameter

        System.out.println(randomNumber.nextInt(10)); // 0-10 ama 10 haric

        System.out.println(randomNumber.nextInt(9)+1); // 1-10 arasi 10 haric

        System.out.println(randomNumber.nextInt(10)+5); // 5-15 arasi sayilar 15 haric



        System.out.println(randomNumber.nextInt(50)+50); // 50-99 arasi 99 dahil




    }
}
