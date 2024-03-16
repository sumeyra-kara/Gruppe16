package tage.tag11;

public class Verkettung {

    public static void main(String[] args) {
        System.out.println(10 + 10);
        //  int + int ----- int

        System.out.println(20.5 + 10);
        // double + int----- String

        System.out.println(100 + "200");
        // int + String ---- String

        System.out.println("200" + 100);
        // String + int ---- String

        System.out.println("Hello World" + (100 * 2 +5));
        // Hello World 205

        System.out.println('A' + 'B');
        // 131

        System.out.println("A" + "B");
        // "AB"


        System.out.println('a' + 'b' + " " + 'a' + 'b');
        // 195 ab
        // Char ist Teilbereich von String








    }
}
