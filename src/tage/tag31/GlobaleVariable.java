package tage.tag31;

public class GlobaleVariable {

    // "Globale variable" werden deklariert, müssen aber nicht initialisiert werden:
    static int globaleVariable; // deklaration: reserviere Speicher (allokieren) 32 BIT
    static double globaleVariable2; //deklaration: reserviere Speicher (allokieren) 64 BIT
    static boolean globaleVariable3; // deklaration: reserviere Speicher (allokieren) 1 BIT

    // + über den gesamten Code hinweg gültig
    // + keine Initialisierung nötig

    // - unnötige Allokation von Speicherplatz

    public static void main(String[] args) {

        System.out.println("Meine globale Variable von Typ Integer hat den Wert: " + globaleVariable);
        //System.out.println("Meine globale Variable von Typ Double hat den Wert : " + globaleVariable2);
        System.out.println("Meine globale Variable von Typ Boolean hat den Wert : " + globaleVariable3);


        // "Lokale" Variablen:
        int lokaleVariableInMain;  // Deklaration
        lokaleVariableInMain = 10; // Initialisierung

        System.out.println("Mein integer a hat den value: " + lokaleVariableInMain);

        meineFunktion();

        System.out.println("Globale Variable in der Main Methode hat den Wert: " + globaleVariable);
        globaleVariable = 5;
        System.out.println("Globale Variable in der Main Methode hat den Wert: " + globaleVariable);



    }

    public static void meineFunktion()
    {
        // "Globale" Variable:
        System.out.println("Globale Variable vor Wertezuweisung  : " + globaleVariable + " (default value)");
        globaleVariable = 20;
        System.out.println("Globale Variable nach Initialisierung: " + globaleVariable);
        globaleVariable = 10000;
        System.out.println("Globale Variable nach Wertezuweisung:  " + globaleVariable);




        // "Lokale" Variable:
        int a = 10;


    } // hier wird die lokale Variable zerstört. Speicherplatz (32 Bit) wird wieder freigegeben


}
