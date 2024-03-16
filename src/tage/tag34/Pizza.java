package tage.tag34;

public class Pizza {
    //Instanzvariablen:
    boolean käse;
    public int pizzastücke = 10;
    boolean salzig;
    boolean gemüse;

    public void printZutaten() { //Instanzmethode:

        if(käse){
            System.out.println("Pizza mit Käse");
        }
        if(gemüse)
        {
            System.out.println("Pizza mit Gemüse");
        }
        System.out.println("Pizzastücke: " + pizzastücke);

    }

    public void pizzaEssen()
    {
        pizzastücke -= 1;
    }
}
