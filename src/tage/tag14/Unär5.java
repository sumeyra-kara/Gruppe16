package tage.tag14;

public class Unär5 {

    public static void main(String[] args) {

       int number = 5;
       int number2 = -20000;

       number = number2++;

        System.out.println("number2: " + number2);
        System.out.println("number: " + number);

        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x: " + x);
        System.out.println("y: " + y);



    }
}
