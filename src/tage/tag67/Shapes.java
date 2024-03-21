package tage.tag67;

public class Shapes {
    String name = "Shapes";

    public void area() {
        System.out.println("calculation the area of the shape");
    }
}
class Triangle extends Shapes{


    String name = "Triangle";

    public void area(){
        System.out.println("Triangle = 1/2 * basis * height");
    }
}

class Circle extends Shapes{

    String name = "Circle";


    public void area(){
        System.out.println("Circle = 3.14 * radius * radius");
    }
}
