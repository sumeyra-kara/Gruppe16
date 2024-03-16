package tage.tag38;

public class StringClass {

    public static void main(String[] args) {
        System.out.println("Erstellung von String-Objekten in Java");

        // literal
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Mango";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

        // new Keyword

        String str4 = new String("Hallo");
        String str5 = new String("Hallo");

        System.out.println(System.identityHashCode(str4));
        System.out.println(System.identityHashCode(str5));

        //

        String firstWorld = new String("Hello world");
        String secondeWorld = "Hello world";
        String thirdtWorld = "Hello world";
        String fourthWorld = new String("Hello world");


        System.out.println(firstWorld==fourthWorld);
        System.out.println(firstWorld==secondeWorld);
        System.out.println(secondeWorld==thirdtWorld);

        // equals-- str.equals

        System.out.println(firstWorld.equals(secondeWorld));




    }
}
