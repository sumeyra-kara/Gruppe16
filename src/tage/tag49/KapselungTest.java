package tage.tag49;

public class KapselungTest {

    public static void main(String[] args) {

        Kapselung meinErstesObjekt = new Kapselung();
        Kapselung obj2 = new Kapselung();
        Kapselung obj3 = new Kapselung();

        System.out.println(meinErstesObjekt.getNummer());

        //meinErstesObjekt.setNummer("text xyz");

        System.out.println(meinErstesObjekt.getNummer());

        // Instanzvariablen können nicht gesetzt werden, da Klasse "read-only" ist:
        //obj2.setNummer("asd");
        //obj2.setI(123);
        //obj2.setXy(4444);

        System.out.println(obj2.getI());
        System.out.println(obj2.getNummer());
        System.out.println(obj2.getXy());








    }
}
