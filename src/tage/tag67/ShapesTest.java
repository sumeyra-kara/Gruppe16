package tage.tag67;

import java.util.ArrayList;

public class ShapesTest {
    public static void main(String[] args) {


        Triangle triangle = new Triangle();
        triangle.area();
        Circle circle = new Circle();
        circle.area();
        Shapes referenzXYZblablna = new Shapes();
        referenzXYZblablna.area();


        Shapes shapes1 = new Circle(); // referenz parent = new object aus child
        shapes1.area();
        Shapes shapes2 = new Triangle(); // referenz parent = new object aus child
        shapes2.area();

        System.out.println(shapes1.name);
        System.out.println(circle.name);
        System.out.println(triangle.name);

        // Methoden kommen aus Child Klasse durch Objekt
        // Instanzvariablen kommen aus der Parent Klasse


        ArrayList<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(10);

        ArrayList<Shapes> listOfShapes = new ArrayList<>();
        listOfShapes.add(referenzXYZblablna);

        ArrayList<Circle> listOfCircles = new ArrayList<>();

        System.out.println("getClass():                 " + referenzXYZblablna.getClass());
        System.out.println("getClass().getName():       " + referenzXYZblablna.getClass().getName());
        System.out.println("getClass().getSimpleName(): " + referenzXYZblablna.getClass().getSimpleName());

        System.out.println("getClass(): " + shapes2.getClass());

        String newClass = referenzXYZblablna.getClass().toString();
        System.out.println(newClass+"2");

        boolean shapeInstanceShapes = shapes1 instanceof Shapes; //referenz shapes = object Circle instanceOf Shapes?
        System.out.println("shapeInstanceShapes: " + shapeInstanceShapes);

        shapeInstanceShapes = shapes1 instanceof Circle; // instance of Circle
        System.out.println("shapeInstanceShapes: " + shapeInstanceShapes);

        shapeInstanceShapes = shapes1 instanceof Triangle; // false
        System.out.println("shapeInstanceShapes: " + shapeInstanceShapes);

        Shapes referenz = null;
        shapeInstanceShapes = referenz instanceof Shapes;
        System.out.println("referenz instance of trinangle? " + shapeInstanceShapes);

        if(shapeInstanceShapes)
        {
            //... mache nichts weil initialiert...
        }
        else
        {
            System.out.println("referenz wird initialisiert mit objekt");
            referenz = new Shapes();
        }






    }

}
