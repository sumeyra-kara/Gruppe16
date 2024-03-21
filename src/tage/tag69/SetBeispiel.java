package tage.tag69;

import java.util.*;

public class SetBeispiel {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Toyota");
        stringSet.add("BMW");
        stringSet.add("Honda");
        stringSet.add("Kia");
        stringSet.add("Toyota");
        stringSet.add("Toyota");
        stringSet.add("BMW");

        System.out.println("stringSet: " + stringSet); // Set speichert keine dublicates

        Set<String> setTree = new TreeSet<>();

        System.out.println("setTree: " + setTree);

        setTree.add("A");
        setTree.add("C");
        setTree.add("B");
        setTree.add("C");

        System.out.println("setTree: " + setTree);


        Integer[] arrayInt= {1,2,3,4};
        // array -> arraylist



        int[] arrayInt2= {1,2,3};

        List<Integer> intList = Arrays.asList(arrayInt);
        List<Integer> intList1 = List.of(arrayInt);


        // array[Integer] --> treeset
        Set<Integer> setInt = Set.of(arrayInt);
        System.out.println("Set: " + setInt);

        // Set --> Liste
        List<Integer> list2 = new ArrayList<>(setInt);
        System.out.println("List: " + list2);
        list2.add(4);

        // Collection -> Array
        Object[] objArray = list2.toArray();
        System.out.println("Object Array: " + Arrays.toString(objArray));


    }
}
