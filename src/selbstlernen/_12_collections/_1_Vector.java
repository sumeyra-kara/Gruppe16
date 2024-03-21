package selbstlernen._12_collections;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class _1_Vector {
    public static void main(String[] args) {
         /*
           Eski bir yapidir. ArrayList'ler tercih edilir.ArrayList'lere cok bnezer.cok kucuk fark vardir.
           Maliyeti bize göre daha fazladir. Yavastir. ArrayList daha hizli calisir.
           Arraylsitteki cogu method burada da mevcuttur
           -thread-safe --Vector is synchronized


          */

        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("Istanbul");
        vector.add("Izmir");


        System.out.println(vector); // [Ankara, Ankara, Istanbul, Izmir]


        vector.add(2,"Adana");
        System.out.println(vector); // [Ankara, Ankara, Adana, Istanbul, Izmir]
        System.out.println(vector.contains("Ankara")); // true

        System.out.println(vector.getFirst()); // Ankara
        System.out.println(vector.firstElement()); // Ankara

        System.out.println("************+");
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // elemanlari yazdiriyoruz
        }

        for (String str : vector){
            System.out.println(str); // bu da ayni sekilde yazdirir
        }
        System.out.println("***********+");

        // Stack
        // Vector classindan vererbrt --- LIFO

        Stack<String> stack  = new Stack<>();

        stack.add("AA");
        stack.add("BB");
        stack.add("CC");

        System.out.println(stack); // [AA, BB, CC]
        System.out.println(stack.get(1)); // BB
        // System.out.println(stack.peek()); // CC -- silmedem son elementi verir
        System.out.println(stack.pop()); // CC -- son elementi verir ama listeden siler sonra
        System.out.println(stack); // [AA, BB]

        System.out.println(stack.push("DD")); // son elemente DD ekliyor
        System.out.println(stack); // [AA, BB, DD]


    }
}
