package selbstlernen.stringManipulation;

public class StartsWith_endsWith {
    public static void main(String[] args) {

        // true veya false sonucu verir
        // string ne ile baslar ne ile biter

        String str = "Java Candir";

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Ja")); // true
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Java Candir")); // true
        System.out.println(str.startsWith("")); // true

        System.out.println(str.endsWith("r")); // true
        System.out.println(str.endsWith("dir")); // true
        System.out.println(str.endsWith("Candir")); // true
        System.out.println(str.endsWith("Java Candir")); // true
        System.out.println(str.endsWith("")); //true
    }
}
