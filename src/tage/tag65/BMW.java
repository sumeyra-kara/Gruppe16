package tage.tag65;

public class BMW extends Car2 implements CleaningTheCar, ModifyTheCar{
    @Override
    public void washTheCar() {
        System.out.println("Wash the car with BMW product");
    }

    @Override
    public void sweepTheCar() {
        System.out.println("Sweep the car inside dry or wet");
    }

    @Override
    public void changeWheels() {
        System.out.println("Change wheels of BMW with wheels ABC");
    }
}
