package tage.tag44;

import java.util.Arrays;

public class Pizza {
    public static void main(String[] args) {


        String [][] pizzas = {{"Tomaten","Mozarella"},{"Döner","Pizza","Oliven"},{"Schinken"},{"Hänchen","Mais","Zwiebel"},{"Salami","Zucchini","Brokoli","Spinat","Schrimps"}};

        System.out.println(Arrays.deepToString(pizzas));

        for (String[] pizza : pizzas) {
            System.out.print(pizza.length + " : ");
            System.out.println(Arrays.toString(pizza));
        }

        System.out.println("************");

        for (int i = 0; i < pizzas.length; i++) {
            System.out.print(pizzas[i].length + " - ");
            System.out.println(Arrays.toString(pizzas[i]));
        }

        for (String pizza : pizzas[4]) {
            System.out.println(pizza);
        }



    }

}
