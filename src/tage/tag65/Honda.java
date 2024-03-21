package tage.tag65;

public class Honda extends Car2 implements CleaningTheCar, ModifyTheCar{
    int anzahlSitze;

    public enum Model{
        ACCORD, JAZZ, CIVIC
    }

    Model model;


    @Override
    public void washTheCar() {
        System.out.println("Wash car with Product from Honda");
    }

    @Override
    public void sweepTheCar() {
        System.out.println("Sweep the car inside only dry");
    }

    @Override
    public void changeWheels() {
        System.out.println("Change weels of honda with wheels XY");
    }
}
