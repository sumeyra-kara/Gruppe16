package tage.tag67;

public class Cow extends Animals2 implements Vegetarian{
    Cow(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cows are eating vegetarian");
    }
}
