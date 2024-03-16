package selbstlernen.class_Objekte;

public class Test {

    public static void main(String[] args) {
        Car car1 = new Car(); // nesne olusturuyoruz
        car1.marka="Toyota"; // nesnelere deger atiyoruz
        car1.model="Corolla";
        car1.renk="Beyaz";
        car1.yas=3;
        car1.elektrikliMi=false;

        car1.calistir(); // yazdirabiliriz
        car1.hizlan();
        car1.dur();
        System.out.println("---------------");

        Car car2= new Car(); // nesne olusturuyoruz
        car2.marka="Opel"; // nesnelere deger atiyoruz
        car2.model="Astra";
        car2.yas=8;
        car2.elektrikliMi=true;

        car2.calistir(); // yazdirabiliriz
        car2.hizlan();
        car2.dur();

        System.out.println(car1.marka); // bu sekilde de yazdirabilirz
        System.out.println(car2.marka);

        System.out.println("car1 = " + car1);


        System.out.println("--------------------");

        // bu asagidakiler daire örnekleri icin

        Circle circle1= new Circle(); // nesne olusturuyouz
        circle1.r=6; // ve deger atiyoruz

        Circle circle2 = new Circle(); // ikincici icin nesne olusturduk
        circle2.r=8; // ve deger atiyoruz

        double area1 = circle1.area(); // yazdirma islemi
        double area2 = circle2.area();

        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);

        System.out.println("circle1.area() = " + circle1.area()); // baska bir yazdirma  sekli

        Circle circle3 = new Circle(); // baska bir nesne olusturuldu
        circle3.r=10;
        System.out.println("circle3.area() = " + circle3.area());

        String str =  "Adnan";

        System.out.println("str = " + str);

    }
}
