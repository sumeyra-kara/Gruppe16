package tage.tag34;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza gemüsePizza = new Pizza();

        gemüsePizza.gemüse = true;
        gemüsePizza.salzig = false;
        gemüsePizza.käse = true;
        gemüsePizza.pizzastücke = 10;

        gemüsePizza.printZutaten();

        Pizza pizza2 = new Pizza();
        pizza2.käse = true;
        pizza2.gemüse = false;
        pizza2.pizzastücke = 5;

        pizza2.printZutaten();
        pizza2.pizzaEssen();
        pizza2.pizzaEssen();
        pizza2.printZutaten();









    }
}
