package tage.tag37;

import java.util.Random;

public class Beispiel {
    public static void main(String[] args) {
        Random random = new Random();
        int value;

        while (true){
           value = random.nextInt(50)+50;
            System.out.println("default value: " +  value);
           if (value %2 != 0){
               break;
           }
        }

        System.out.println("value" + value);

    }
}
