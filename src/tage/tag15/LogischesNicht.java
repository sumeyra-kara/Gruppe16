package tage.tag15;

public class LogischesNicht {
    public static void main(String[] args) {


        boolean myBoolean = true;

        System.out.println(myBoolean);
        System.out.println(!myBoolean); // negiert

        int a = 20;
        System.out.println(a ==20); // ist a gleich 20?
        System.out.println(!(a==20)); // ist a nicht gelich 20?

        boolean istGerade;
        istGerade = a%2 != 1;
        System.out.println(istGerade);




    }
}
