package tage.tag66;

public class Dog extends Animal{
    String name = "deault dog name";

    @Override
    void makeSound() { // method overriding / überschreiben --> dynamische polymorphismus
        System.out.println("dogs are barking");
    }
}
