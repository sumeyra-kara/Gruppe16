package tage.tag53;

import java.util.ArrayList;

public class Blocks {

    // static blok nerede olursa olsun ilk o calisir--sonra main methodu ici--
    // sonra istance blok calisir
    static int staticVar;

    int instanceVar;

    static ArrayList<String> list1; // Instanzvariable

    {
        System.out.println(" ----- INSTANZ BLOCK DER KLASSE BLOCKS -----");
    }

    public void test(){
        System.out.println("Nicht statische Methode");
    }

    public static void test2(){
        System.out.println("Statische Methode");
    }

    public static void main(String[] args) {

        System.out.println("MAIN: Erste Zeile der Main Methode... ");

        Blocks obj1 = new Blocks();
        obj1.test();

        test2();

        Test objectTest1 = new Test();


        System.out.println("MAIN: Letzte Zeile der Main Methode... ");
    }

    static{
        System.out.println("     ----- STATISCHER BLOCK aus Klasse Blocks ----- ");
    }

    /*
    static{
        System.out.println("STATISCHER BLOCK 2");
    }

    static{
        System.out.println("STATISCHER BLOCK 3");
    }

    static{
        System.out.println("STATISCHER BLOCK 4");
    }

    static{
        System.out.println("STATISCHER BLOCK 5");
    }*/

}
