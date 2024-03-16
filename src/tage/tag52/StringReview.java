package tage.tag52;

public class StringReview {

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(str);

        System.out.println(str.substring(1,5)); // ello

        System.out.println(str.contains("Hello")); // true
        System.out.println(str.contains("Hello world")); // false- w si kucuk cunku


        String Kontonummer = "67872743478";
        String  regex = "[0-8]+"; // nur Zahlen von 0-8 sind erlaubt
        String regex1 = "\\d+"; // nur Zahlen erlauben


        System.out.println(Kontonummer.matches(regex)); // true -- evet sadece o sayilar
        System.out.println(Kontonummer.matches(regex1)); // true -- evet sadece sayilar



    }
}
