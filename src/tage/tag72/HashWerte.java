package tage.tag72;

public class HashWerte {
    public static void main(String[] args) {

        String a = "m";
        String b =  a + "d";
        String c = "md";
        String d = "md";

        System.out.println(b == c);         //false
        System.out.println(d == c);         //true
        System.out.println(b.equals(c));    //true

        // Hash code of string:
        System.out.println("b hashcode: " + b.hashCode()); // hash wert für md
        System.out.println("c hashcode: " + c.hashCode()); // hash wert für md

        // Identity hash code of object:
        System.out.println("b identityhascode: " + System.identityHashCode(b));
        System.out.println("c identityhascode: " + System.identityHashCode(c)); // c und d gleich
        System.out.println("d identityhascode: " + System.identityHashCode(d)); // c und d glich


    }
}
