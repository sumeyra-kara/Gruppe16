package tage.tag46;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<Object> namelist  = new ArrayList<>(); // sadece tek veri tipi ile degil de karisik istersek Object yaziyoruz

        namelist.add("ss");
        namelist.add(5);

        System.out.println(namelist); //[ss, 5]


        ArrayList<Integer> sirala  = new ArrayList<>();
        sirala.add(21);
        sirala.add(113);
        sirala.add(5);
        sirala.add(84);




    }


}
