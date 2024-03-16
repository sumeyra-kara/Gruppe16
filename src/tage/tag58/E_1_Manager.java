package tage.tag58;

public class E_1_Manager extends Employee {

    String name = "Dreick Köhn";
    static int gehalt = 6500;
    String berufsbezeichnung="Expert";
    static int wieVielJahr = 10;

   public static void berechnungBoni (){
        System.out.println(gehalt*wieVielJahr);
   }

    public static void bericht (){
        System.out.println("Natürlich gut");
    }

    public void verwaltung (){
        System.out.println("Manager verwaltet die Projekte nicht");
    }

}
