package tage.tag45;

public class Wrapperclasse {
    public static void main(String[] args) {


        int n =5;
        Integer num1 = 1234;
        System.out.println(num1.toString());

        Double d1 = new Double("1522");
        double d2 = d1;
        System.out.println(d2); // 1522.0
        System.out.println(d1); // 1522.0

        long l1 = new Long("132424244"); // 132424244  unboxing
        Long l2 = new Long("132424244"); //132424244

        System.out.println(l1);
        System.out.println(l2);

        long l3 = l2; // unboxing
        // casting funktioniert nur bei primitive Datentypen

        int x = 255;
        double y = x;
        System.out.println(y); //255.0
        Integer num4 = Integer.valueOf("2664"); // 2664
        System.out.println(num4);

    }
}
