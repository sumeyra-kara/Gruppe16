package tage.tag68;

public class Klasse_Test {
    public static void main(String[] args) {

        Klasse_A obj1 = new Klasse_A(); // 4 Methoden aufrufbar

        Klasse_B obj2 = new Klasse_B(); // 1 Methode aufrufbar

        Klasse_B obj3 = new Klasse_A(); // 1 Methode aus Klasse B aufrufbar

        Interface_A obj4 = new Klasse_A(); // 1 Methode aufrufbar --> aus dem implementieren Interface

        Klasse_A obj5 = null;

        //...



    }
}
