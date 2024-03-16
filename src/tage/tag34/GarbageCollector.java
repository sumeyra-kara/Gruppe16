package tage.tag34;

public class GarbageCollector {

    public static void main(String[] args) {

        String student1 = "Ronaldo";
        String student2="Messi";
        String student3= "Tarik";
        String student4= new String("Tarik");

        System.out.println(student3==student4); // false
        String student5 = "Ronaldo";

        System.out.println(student1== student5); // true
        student3 = "Ronaldo";
        System.out.println(student3==student1); // true
        new String("Robben"); // objekt- ohne referenz

    }



}
