package tage.tag68;

public class Klasse_A extends Klasse_B implements Interface_A{

    @Override
    public void methodInterface() {
        System.out.println("Methode aus dem Interface implementiert");

        // testen
    }

    public void methodKlasse_A_1()
    {
        System.out.println("Methode aus der Child Klasse A");
    }

    public void methodKlasse_A_2()
    {
        System.out.println("Methode aus der Child Klasse A");
    }
}
