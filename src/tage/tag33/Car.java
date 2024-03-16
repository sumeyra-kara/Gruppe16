package tage.tag33;

public class Car {

    // Instanzvariablen:
    String farbe;
    String marke;
    String antrieb;
    String StadtInDerZugelassen;
    int baujahr;
    int türnummer;
    int seriennummer;
    int geschwindigkeit;
    boolean istDefekt;


    // Instanzmethoden:

    public void getInfo(){

        System.out.println("**********************************");
        System.out.println("Marke:           " + marke);
        System.out.println("Antrieb:         " + antrieb);
        System.out.println("Farbe:           " + farbe);
        System.out.println("Baujahr:         " + baujahr);
        System.out.println("Türnummer:       " + türnummer);
        System.out.println("Zugelassen in:   " + StadtInDerZugelassen);
        System.out.println("Seriennummer:    " + seriennummer);
        System.out.println("Ist defekt:      " + istDefekt);
        System.out.println("Geschwindigkeit: " + geschwindigkeit);
    }

    public void beschleunigen()
    {
        geschwindigkeit += 50;
    }

    public void fahren()
    {
        System.out.println("Das Auto fährt " + geschwindigkeit + " km/h");
    }

    public void bremsen()
    {
        if(geschwindigkeit>0) geschwindigkeit -= 25;
    }

    public static void main(String[] args) {

        Car autoNr1 = new Car();
        autoNr1.marke = "Honda";
        autoNr1.farbe = "blau";
        autoNr1.antrieb = "benzin";
        autoNr1.türnummer = 4111320;
        autoNr1.baujahr = 1995;
        autoNr1.seriennummer = 312312;
        autoNr1.StadtInDerZugelassen = "München";

        //autoNr1.getInfo();


        autoNr1.fahren();
        autoNr1.beschleunigen();
        autoNr1.fahren();
        autoNr1.beschleunigen();
        autoNr1.fahren();
        autoNr1.bremsen();
        autoNr1.bremsen();
        autoNr1.bremsen();
        autoNr1.bremsen();
        autoNr1.bremsen();
        autoNr1.bremsen();
        autoNr1.bremsen();
        autoNr1.bremsen();

        autoNr1.fahren();



        //autoNr1.bremsen();


    }
}
