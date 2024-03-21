package tage.tag64;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.name = "Katze Nr.1";
        cat.makeSound();

        Dog dog = new Dog();
        //dog.name = "HUND Nr.1";
        dog.makeSound();

        Animal animal1 = new Cat();
        animal1.name = "Katze Nr.2";
        animal1.makeSound();

        Animal animal2 = new Dog();
        animal2.makeSound();

        System.out.println("cat.city: " + cat.city);
        System.out.println("animal.city: " + animal.city);
        System.out.println("animal1.city: " + animal1.city);

        //printCatName(cat);
        //printDogName(dog);
        printName(animal1);


        ArrayList<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(cat);
        Cat cat2 = new Cat();
        cat.name = "Lion";
        listOfCats.add(cat2);

        ArrayList<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(dog);

        ArrayList<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(animal);
        listOfAnimal.add(cat2); // cat is a animal
        listOfAnimal.add(dog); // dog is a animal
        // polymorphismus

        System.out.println("name hund: " + listOfAnimal.get(2).name);

        for(int i = 0; i < listOfAnimal.size(); i++){
            System.out.println("------------");
            System.out.println(listOfAnimal.get(i).name);
        }




    }

    /*
    public static void printCatName(Cat cat){
        System.out.println("****************************");
        System.out.println("cat.name: " + cat.name);
    }

    public static void printDogName(Dog dog){
        System.out.println("****************************");
        System.out.println("dog.name: " + dog.name);
    }*/

    public static void printName(Animal animal){
        System.out.println("****************************");
        System.out.println("animal.name: " + animal.name);
        System.out.println("*****************************");
        animal.makeSound();
    }


}
