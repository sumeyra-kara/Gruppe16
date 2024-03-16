package selbstlernen.arrays_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(220);
        numbers.add(100);
        numbers.add(30);
        numbers.add(40);

        numbers.forEach(i -> System.out.println(i)); // bu da baska bir kullanimi

        Iterator itr = numbers.iterator(); // böyle bir kullanim da var
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("***");

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

        // eger mesela belirli bir sayiyi silecek(indeks uzerinden degil) olursak bu sekilde yapmaliyiz
        //diger yol asagidaki


        Integer löschenElement = 10;
        numbers.remove(löschenElement);
        System.out.println(numbers);//[220, 100, 30, 40]

        numbers.set(2,13); // set metodu ile 2.indeksteki element yerine oraya 13 koyuyor digerini atiyor
        System.out.println(numbers); //[220, 100, 13, 40]


    }
}
