package tage.tag58;

public class Employee {

    String name;
    String adresse= "Frankfurt";
    static int gehalt;
    String berufsbezeichnung;
    static int wieVielJahr;

    public static void berechnungBoni (){
        System.out.println("keine Angabe");
    }
    public static void bericht (){
        System.out.println("Gut");
    }

    public void verwaltung (){
        System.out.println("Keine Angabe dafür");
    }

    public static void main(String[] args) {

       E_1_Manager e1Manager = new E_1_Manager();
       E_2_Developer e2Developer = new E_2_Developer();
       E_3_Programmer e3Programmer = new E_3_Programmer();
       Employee employee = new Employee();

       employee.verwaltung();

       System.out.println("e1Manager.name = " + e1Manager.name);
       System.out.println("e1Manager.gehalt = " + e1Manager.gehalt);
       System.out.println("e1Manager.adresse = " + e1Manager.adresse);
       System.out.println("e1Manager.berufsbezeichnung = " + e1Manager.berufsbezeichnung);
       System.out.println("e1Manager.wieVielJahr = " + e1Manager.wieVielJahr);

       E_1_Manager.bericht();
       E_1_Manager.berechnungBoni();
       e1Manager.verwaltung();

       System.out.println("***********");

        System.out.println("e2Developer.name = " + e2Developer.name);
        System.out.println("e2Developer.gehalt = " + e2Developer.gehalt);
        System.out.println("e2Developer.adresse = " + e2Developer.adresse);
        System.out.println("e2Developer.berufsbezeichnung = " + e2Developer.berufsbezeichnung);
        System.out.println("e2Developer.wieVielJahr = " + e2Developer.wieVielJahr);
        E_2_Developer.bericht();
        E_2_Developer.berechnungBoni();

        e2Developer.verwaltung();
        System.out.println("***********");

        System.out.println("e3Programmer.name = " + e3Programmer.name);
        System.out.println("e3Programmer.adresse = " + e3Programmer.adresse);
        System.out.println("e3Programmer.gehalt = " + e3Programmer.gehalt);
        System.out.println("e3Programmer.wieVielJahr = " + e3Programmer.wieVielJahr);
        System.out.println("e3Programmer.berufsbezeichnung = " + e3Programmer.berufsbezeichnung);
        E_3_Programmer.bericht();
        E_3_Programmer.berechnungBoni();
        e3Programmer.verwaltung();
        System.out.println("***********");

        System.out.println("employee.name = " + employee.name);
        System.out.println("employee.adresse = " + employee.adresse);
        System.out.println("employee.gehalt = " + employee.gehalt);
        System.out.println("employee.wieVielJahr = " + employee.wieVielJahr);
        System.out.println("employee.berufsbezeichnung = " + employee.berufsbezeichnung);
        Employee.bericht();
        employee.verwaltung();

        Employee.berechnungBoni();


    }


}
