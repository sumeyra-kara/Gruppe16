package selbstlernen.collections;

import java.util.Collections;
import java.util.TreeSet;

public class _12_TreeSet_1 {

    /*
    TreeSet'ler siralamaya göredir. Dogal siralama kucukten buyuge veya alfabettik siraya göre

     */

    public static void main(String[] args) {


        TreeSet <Integer> student = new TreeSet<>();
        student.add(12);
        student.add(22);
        student.add(22);
        System.out.println(student); // [12, 22]
        System.out.println(student.reversed()); // [22, 12] -- bu method ile de tersten yazdirilir


        TreeSet <String > studentName = new TreeSet<>();
        studentName.add("Zeynep");
        studentName.add("Asya");
        studentName.add("Sümeyra");

        System.out.println(studentName); // [Asya, Sümeyra, Zeynep]
        System.out.println(studentName.reversed()); // [Zeynep, Sümeyra, Asya]


        //  elementleri de yazdirir
        for (String s : studentName){
            System.out.println(s);// Asya    Sümeyra   Zeynep

        }










    }
}
