package tage.tag58;

public class E_3_Programmer extends E_1_Manager{

    String name = "Alex Sam";
    static int gehalt = 5200;
    String berufsbezeichnung="Junior";
    static int wieVielJahr = 4;

    public static void berechnungBoni (){
        System.out.println(gehalt*wieVielJahr);
    }
    public static void bericht (){
        System.out.println("Gut");
    }

    public void verwaltung (){
        System.out.println("Programmer können Projkten verwalten");
    }



}
