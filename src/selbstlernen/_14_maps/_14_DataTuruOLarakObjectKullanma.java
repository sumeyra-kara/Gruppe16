package selbstlernen._14_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _14_DataTuruOLarakObjectKullanma {

    public static void main(String[] args) {

        List<Object> sayilar  =new ArrayList<>();

        sayilar.add(4);
        sayilar.add("Java");
        sayilar.add('a');
        sayilar.add(2.3);
        sayilar.add(true);
        System.out.println(sayilar); // [4, Java, a, 2.3, true]

        int [] a = {2,3,4};
        sayilar.add(a);

        System.out.println(sayilar); // [4, Java, a, 2.3, true, [I@6acbcfc0] --- array'i yazdirmiyor
        // referansini yazdirir

        System.out.println(Arrays.toString((int[]) sayilar.get(5))); // bu sekilde array yazdirilabilir

        System.out.println(7 + 6.5); // 13.5
        System.out.println((Integer) sayilar.get(0) + (Double)sayilar.get(3)); // 6.3 -- casting yapilmali


    }
}
