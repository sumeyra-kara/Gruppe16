package tage.tag53;

public class InsBlock {

    int value;
    static String text;

    { //non-static block [Instanz-Block] wird ausgeführt wenn eine Instanz aus dieser Klasse erstellt wird
        System.out.println(" ----- INSTANZ BLOCK der Klasse InsBlock -----");
    }


    public static void main(String[] args) {

        System.out.println("Erste Zeile in meiner Main Methode");

        InsBlock object1 = new InsBlock();
        InsBlock object2 = new InsBlock();
        InsBlock object3 = new InsBlock();

        Blocks block1 = new Blocks();
        Blocks block2 = new Blocks();
        Blocks block3 = new Blocks();
        Blocks block4 = new Blocks();
        Blocks block5 = new Blocks();

        System.out.println("Letzte Zeile in meiner Main Methode");
    }

    static {
        System.out.println("***** STATIC BLOCK *****");
    }
}
