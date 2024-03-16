package tage.tag18;

public class VerschalteteIf {
    public static void main(String[] args) {

        int nummer = 22;

        if (nummer <20) {
            System.out.println("die nummer ist kleiner als 20");
            if (nummer > 15) { // innere Abfrage
                System.out.println("die nummer ist kleiner als 15");
            }
        }

        if (nummer<20 || nummer>15) {

            System.out.println("nummer ist kleiner als 20");
            System.out.println("nummer ist großer als 15");
        }

    }
}
