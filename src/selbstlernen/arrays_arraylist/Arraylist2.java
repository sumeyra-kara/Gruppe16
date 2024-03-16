package selbstlernen.arrays_arraylist;

import tage.tag34.Pizza;

import java.util.ArrayList;

public class Arraylist2 {

    public static void main(String[] args) {

        ArrayList<String> meineliste =new ArrayList<>();
        ArrayList<Integer> meineliste2 =new ArrayList<>();
        ArrayList<Pizza> meineliste3 =new ArrayList<>();

        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.pizzastücke = 12;

        meineliste3.add(pizza1);
        System.out.println(meineliste3.size()); // 1


        meineliste2.add(13);
        meineliste2.add(343);
        meineliste2.add(1346);
        meineliste2.add(133);

        System.out.println(meineliste2.size()); // 4
        System.out.println(meineliste2); //[13, 343, 1346, 133]
        //meineliste2.equals()-- equals metotu ile iki listin esit olup olmadigina bakar boolean döndürür

        System.out.println("******");

        meineliste2.remove(2); // 2.indekstekini siliyoruz
        System.out.println(meineliste2);

        meineliste2.remove(meineliste2.remove(0)); //0.indeksitekini siliyoruz
        System.out.println(meineliste2);

        //System.out.println(meineliste3.get(0).pizzastücke); //12






    }
}
