package tage.tag66;

public class GenericTest {
    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5};
        String[] colors = {"blue", "yellow", "red", "purple", "green"};
        Character[] chars = {'a', 'b', 'c', 'd', 'e'};

        //printFirstElement(numbers);
        // printFirstElement(colors);

        printFirst(colors);
        printFirst(numbers);
        printFirst(chars);



    }

/*
    public static void printFirstElement(int[] numbers){
        System.out.println("numbers[0]: " + numbers[0]);
    }

    public static void printFirstElement(String[] colors){
        System.out.println("colors[0]: " + colors[0]);
    }*/

    public static <Type> void printFirst(Type[] arrType){ // Java GENERICS
        System.out.println("first element: " + arrType[0]);
    }

    public static <Object> void printFirst2(Object[] arrType){ // Java GENERICS
        System.out.println("first element <object>: " + arrType[0]);
    }
}
