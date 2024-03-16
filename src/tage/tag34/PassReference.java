package tage.tag34;

public class PassReference {

    int id;

    public static void main(String[] args) {

        int number = 100;
        printNumberS(number);

        Schüler messi = new Schüler();
        PassReference passRefernce = new PassReference();

        passRefernce.printNumber(messi);

        System.out.println("messi.name: :" + messi.name);
        System.out.println("messi.nummer:" + messi.nummer);

        Schüler ronaldo = new Schüler();
        ronaldo = messi;





    }

    public static void printNumberS(int n){ // Statische Methode
        System.out.println("n = " + n);
        n = 500;
        System.out.println("n = " + n);
    }

    public void printNumber(Schüler mySchüler) // Referenzmethode (nicht-statische Methode)
    {
        System.out.println("Schüler.name  :  " + mySchüler.name);
        System.out.println("Schüler.nummer:  " + mySchüler.nummer);
        mySchüler.name = "Messi";
        mySchüler.nummer = 300;
    }
}
