package tage.tag47;

import java.util.ArrayList;

public class ThisTest {

    int idNumber;
    String name;
    ThisTest(){ //default constructor
    }
    ThisTest(int idNumber,String name){ // constructor mit Parametern
        this.idNumber=idNumber;
        this.name=name;
    }

    public static void main(String[] args) {

        ThisTest object1 = new ThisTest();
        ThisTest object2 = new ThisTest(1324242,"text");
        ThisTest object3 = new ThisTest(1324,"text2");
        ThisTest object4 = new ThisTest(13,"text3");

        System.out.println(object1.idNumber); //0 --default deger olur eger tanimlamazsak
        System.out.println(object2.idNumber); //1324242
        System.out.println(object3.idNumber); //1324
        System.out.println(object4.idNumber); //1324


        System.out.println("***");
        System.out.println(object1.name); // null
        System.out.println(object2.name); // text
        System.out.println(object3.name); // text2
        System.out.println(object4.name); // text3

    }
}
