package selbstlernen._05_class_Objekte;

public class YeniCircle {

    // önce variable atadik
    public double r;
    final public double PI = Math.PI;

    // methodlar yazdik
    public double area(){
        return r*r*PI;
    } // method olusturduk alan icin
    public double perimeter(){
        return 2*PI*r;
    } // cevre icin

    public static void main(String[] args) {

        // simdi artik mAIN METHODUNDAYIZ: NESNE OLUSTURMALIYIZ

        Circle circle1= new Circle(); // nesne olusturuyoruz sonra----(circle daire demek)
        circle1.r=6; // ve deger atiyoruz r si 6 demek

        Circle circle2 = new Circle(); // ikincici icin nesne olusturduk
        circle2.r=8; // ve deger atiyoruz r si 8 demek

        double area1 = circle1.area(); // yazdirma islemi
        double area2 = circle2.area(); // veya (nesne adi.method adi) bunu double degiskenine atayip degiskeni yazdir altta sout ile
        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);


        System.out.println("circle1.area() = " + circle1.area()); // baska bir yazdirma  sekli
        // nesne adi.method adi dersek yazdiririz sout ile

        Circle circle3 = new Circle(); // baska yeni bir nesne olusturulduucuncu bir daire
        circle3.r=10; // dairenin r si 19o mesela
        System.out.println("circle3.area() = " + circle3.area()); // nesne adi.method adi sout ile

    }
}
