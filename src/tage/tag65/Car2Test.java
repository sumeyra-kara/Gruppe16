package tage.tag65;

public class Car2Test {
    public static void main(String[] args) {

        BMW bmw1 = new BMW();
        Honda honda1 = new Honda();

        honda1.washTheCar();
        honda1.sweepTheCar();

        bmw1.washTheCar();
        bmw1.sweepTheCar();

        honda1.changeWheels();
        bmw1.changeWheels();

        Honda honda2 = new Honda();

        Honda.Model model = Honda.Model.ACCORD;
        System.out.println(honda2.model);



    }
}
