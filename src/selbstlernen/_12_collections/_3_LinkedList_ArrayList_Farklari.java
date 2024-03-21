package selbstlernen._12_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _3_LinkedList_ArrayList_Farklari {

    /*
    Linked List:
    - basa ve sona veya ortaya eleman eklemek cikarmak icin bu daha kullanisli

    ArrayList :
    - search arama mekanizmasi da bunun daha iyidir

     */

    public static void main(String[] args) {

        List<String> liste =  new LinkedList<>();

        liste.add("Sümeyra");
        liste.add("Veli");
        liste.add("Kara");
        liste.add("102");
        liste.add("Veli");

        liste.remove(4);

        Iterator<String> itr =  liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); // elementleri yazdirir
        }

        for (String str : liste){
            System.out.println(str);
        }
    }
}
