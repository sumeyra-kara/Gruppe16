package tage.tag18;

public class VerschahteteIf2 {
    public static void main(String[] args) {

        //mike hat 2 Schlussel. schkussel 1 fur den Garten. schlussel 2 für den Haus.  TODO
        // wenn mike nicht in garten oder haus gelangt kann er in den park gehen

        boolean gartenSchlüsselVorhanden = true;
        boolean hausSchlüsselVorhanden = false;
        boolean hatSmartphoneDabei = true;


        if (gartenSchlüsselVorhanden) {
            System.out.println("rasen nähen");
            if (hausSchlüsselVorhanden) {
                System.out.println("fern sehen");
            }
        }
        else {
            System.out.println("park gehen");
            if (hatSmartphoneDabei) {
                System.out.println("mit den smartphone spielen");
            }
            else {
                System.out.println("im haus aber ist hat kein smartphone");
            }

        }
    }
}
