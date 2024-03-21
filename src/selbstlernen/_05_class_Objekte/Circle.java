package selbstlernen._05_class_Objekte;

public class Circle {

    //daire alan ve çevre hesaplayan metodları olacak
    // buna göre fields tanımlaması yapalım ve metodları yazalım.

    public double r; // sinif icinde variable olusturduk
    final public double PI = Math.PI;

    public double area(){
        return r*r*PI;
    } // method olusturduk alan icin

    public double perimeter(){
        return 2*PI*r;
    } // cevre icin
}
