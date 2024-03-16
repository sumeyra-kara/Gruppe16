package tage.tag34;

public class Schüler {
    String name = "Max Mustermann";
    int nummer = 5; // ist bereits initialisiert
    char note = 'A'; // ist bereits initialisiert
    int punkteTest1;
    int punkteTest2;
    int punkteTest3;

    public void printInfo(){
        System.out.println("*******************");
        System.out.println("name: " + name);
        System.out.println("nummer: " + nummer);
        System.out.println("Note:   " + note);
    }

    public void printDurchschnitt(){

        int durchschnitt =  (punkteTest1 + punkteTest2 + punkteTest3) / 3;
        System.out.println("Die durchschnittliche Punktezahl des Schülers ist: " + durchschnitt);
    }



    public static void main(String[] args) {

        Schüler meinSchüler1 = new Schüler();
        meinSchüler1.printInfo();

        Schüler meinSchüler2 = new Schüler();
        meinSchüler2.printInfo();

        Schüler meinSchüler3 = new Schüler();
        meinSchüler3.name = "name XYZ";
        meinSchüler3.nummer = 123123;
        meinSchüler3.note = 'B';

        meinSchüler3.printInfo();

        meinSchüler1.punkteTest1 = 16;
        meinSchüler1.punkteTest2 = 20;
        meinSchüler1.punkteTest3 = 100;

        meinSchüler1.printDurchschnitt();






    }


}
