package tage.tag48;

public class ConstructorChaining {

    int number;
    int number2;

    ConstructorChaining(){
        System.out.println("default constructor");
    }

    ConstructorChaining(int number)
    {
        this();
        System.out.println("number: " + number);
        this.number = number;
    }

    ConstructorChaining(int number1, int number2)
    {
        this(number1);
        this.number2 = number2;

        System.out.println("number1: " + number);
        System.out.println("number2: " + number2);

        System.out.println(number1 + number2);
    }

    public static void main(String[] args) {

        //ConstructorChaining obj1 = new ConstructorChaining();
        //ConstructorChaining obj2 = new ConstructorChaining(5050);
        //System.out.println(obj2.number);

        ConstructorChaining obj3 = new ConstructorChaining(20, 90);


    }
}
