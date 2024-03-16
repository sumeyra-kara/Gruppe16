package tage.tag47;

public class Kreis {
    double radius =1.0;
    Kreis(){ // Konstruktor 1
    }

    Kreis(double radius){ // Konstruktor 2
        this.radius = radius;
    }
    public void printRadius(){
        System.out.println("radius : " + radius);
    }


    public static void main(String[] args) {

        Kreis kreis1 = new Kreis(); // Default cons. wird aufgerufen
        //Javanin olusturdugu parametresiz cons.
        Kreis kreis2 = new Kreis(30.5); // constructor mit Ubergabeparameter wird aufgerufen
        Kreis kreis3 = new Kreis(3222.5); // constructor mit Ubergabeparameter wird aufgerufen


        kreis1.printRadius(); // radius : 1.0
        kreis2.printRadius(); //radius : 30.5
        kreis3.printRadius(); // radius : 3222.5
    }
}
