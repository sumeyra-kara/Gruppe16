package tage.tag69;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {

        ArrayList<String> bags = new ArrayList<>();

        bags.add("C");
        bags.add("A");
        bags.add("A");
        bags.add("A");
        bags.add("B");
        bags.add("B");
        bags.add("B");
        bags.add("B");

        String[] strArray = {"A", "B", "B", "C"};

        // frequency:

        System.out.println("Collections frequency für C: " + Collections.frequency(bags, "lkjads"));

        if(Collections.frequency(bags, "B") == 4)
        {
            System.out.println("warnung");
        }

        // binarysearch:

        System.out.println(bags);
        System.out.println("Collections binarysearch: " + Collections.binarySearch(bags, "C"));


        // emptylist:

        List<Object> objects = Collections.emptyList();
        System.out.println(Collections.emptyList());

        System.out.println("objects.size(): " + objects.size());

        Integer[] numbers = {33, 22, 11, 23, 555, -2};

        List<Integer> numList = List.of(numbers);
        System.out.println("numList: " + numList);

        //max, min:

        System.out.println("Collections max: " + Collections.max(numList));
        System.out.println("Collections min: " + Collections.min(numList));

        System.out.println("bags before reverse: " + bags);
        Collections.reverse(bags);
        System.out.println("bags after reverse : " + bags);



    }
}
