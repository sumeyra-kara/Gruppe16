package tage.tag34;

public class StackHeap {
    public static void main(String[] args) {

        int number = 50;
        String city = "Oslo"; // im HEAP wurde der String "Oslo" erzeugt und der Referenz city zugewisen
        System.out.println(number);
        sayHello();
        String town = "Oslo"; // der String der bereits im HEAP existiert wird der Referenz town zugewiesen
        String city5 = "Istanbul";
        System.out.println(town == city);

        String city2 = new String("Oslo");
        System.out.println("city2: " + city2);
        System.out.println(city == city2);

        new String("Oslo");


    }

    public static void sayHello(){
        System.out.println("Hello!");
    }
}
