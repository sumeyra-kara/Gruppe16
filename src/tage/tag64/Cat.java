package tage.tag64;

public class Cat extends Animal{
    String city = "Istanbul";
    String name = "random cat";


    @Override
    void makeSound() {
        System.out.println("cats are meowing");
    }
}
