package tage.tag58;

public class E_2_Developer extends E_1_Manager{


    String name = "John Frank";
    static int gehalt = 5000;
    String berufsbezeichnung="Junior";
    static int wieVielJahr = 2;
    public static void berechnungBoni (){
        System.out.println(gehalt*wieVielJahr);
    }

    public static void bericht (){
        System.out.println("Gut!");
    }

    public void verwaltung (){
        System.out.println("Developer verwaltet Projekten");
    }

}
