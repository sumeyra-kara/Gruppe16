package selbstlernen.arrays_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist4 {

    public static void main(String[] args) {

        ArrayList<Object> namelist  = new ArrayList<>(); // sadece tek veri tipi ile degil de karisik istersek Object yaziyoruz

        namelist.add("ss");
        namelist.add(5);

        System.out.println(namelist); //[ss, 5]


        ArrayList <String> liste = new ArrayList<>();
        liste.add("eva");
        liste.add("esin");
        liste.add("yakup");

        System.out.println(liste); //[eva, esin, yakup]
        Collections.sort(liste);
        System.out.println(liste);//[esin, eva, yakup]
        // Collections.sort ile arraylisti siralayabiliriz

        // ya da diger yolla siralanabilir
        liste.sort(null);
        System.out.println(liste);








    }
}
