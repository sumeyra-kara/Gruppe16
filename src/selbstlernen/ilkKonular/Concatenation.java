package selbstlernen.ilkKonular;

public class Concatenation {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        System.out.println("verilen iki degerin toplami : " + (a+b));

        System.out.println("girilen " + a + " ve " + b + " sayilarinin toplami : " + (a+b));

        System.out.println("sayilarin toplami : " + a + b);

        int c=2;
        int d=3;
        String e= "Hello";

        System.out.println(e+c+d);
        System.out.println(d+c+e);
        System.out.println(e+(c+d));
        System.out.println(e+c*d);

        String s1="Java";
        int k=3;
        int l=4;
        System.out.println(k+""+l+s1);

    }
}
