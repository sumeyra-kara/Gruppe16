package tage.tag67;

import tage.tag33.Student;

public class ReviewGeneric<Type> {
    int number;
    String value;
    Type valueGeneric;

    Student xy; // Komposition "is-a" relationship

    public static <Type> void myMethod(Type anyType){
        //...
    }

    public void myMethod2(){
        System.out.println("... " + valueGeneric);
    }

    public static void main(String[] args) {


        ReviewGeneric rG = new ReviewGeneric();
        rG.valueGeneric = "Text";

        ReviewGeneric rG2 = new ReviewGeneric();
        rG2.valueGeneric = 192.12;

        rG2.valueGeneric = "text...";

    }
}
