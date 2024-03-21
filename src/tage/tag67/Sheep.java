package tage.tag67;

public class Sheep extends Animals2 implements Vegetarian {
    Sheep(String name){
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Sheep is not eating meat");
    }
}
