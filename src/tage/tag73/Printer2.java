package tage.tag73;

public class Printer2 {
    public static void main(String[] args) {

        Printer print = new Printer();
        print.greeting();

        Print printer = () -> System.out.println("hello everyone");
        printer.greeting();


        //Addition addition = (a, b) -> System.out.println(a+b);



    }
}
