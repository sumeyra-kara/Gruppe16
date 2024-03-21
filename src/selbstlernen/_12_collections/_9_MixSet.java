package selbstlernen._12_collections;

import java.util.*;

public class _9_MixSet {
    public static void main(String[] args) {

        Set<Object> mixSet  =new HashSet<>(); // Object olarak yazarsam her seyi ekleyebilirim
        mixSet.add(12);
        mixSet.add("Java");
        mixSet.add('S');
        mixSet.add(true);

        int [] arr = new int[3];
        mixSet.add(arr);
        arr[2]=34;
        arr[1]=71;

        List<Object> mixList = new ArrayList<>();
        mixList.add("Hava");
        mixList.add(24);
        mixSet.add(mixList);

        System.out.println(mixList); // [Hava, 24]
        System.out.println(mixSet); // [Java, [Hava, 24], S, [I@6acbcfc0, 12, true]--bu sekilde tuhaf bir sey gelebilir
        // Bu yuzden Object cok tercih edilmez
        // Collection objeleri bir arada tutan yapilardir

        System.out.println(mixSet.size()); // 6--mesela boyutunu yanlis verdi
        System.out.println(mixSet.contains(24)); // aslinda var yani true olmasi lazim ama false verdi
        System.out.println(mixSet.contains(12)); // true-- burada dogru cevabi verdi

        System.out.println(Arrays.toString(arr)); // [0, 71, 34]
        // Data türü object secilirse icin eher data turunden element konulabilir
        // Ancak elementlere ulasmamiz veya update etmek gibi islemleri yapmamiz mumkun olmayabilir veya zor olabilir



    }
}
