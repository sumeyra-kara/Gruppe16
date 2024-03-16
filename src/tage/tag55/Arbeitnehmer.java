package tage.tag55;

public class Arbeitnehmer {

    String name;
    double gehalt;
    int arbeitnehmerID;
    int urlaubstage;
    char geschlecht;

    public void erhöheGehalt(){
        gehalt+=2000;
        System.out.println("Gehalt wird erhöht");
    }
    public void geheInDenUrlaub (){
        System.out.println("Gehe in den Urlaub");
    }

    Arbeitnehmer(){
        System.out.println("ein Objeckt wurde generiert");
    }

    Arbeitnehmer(String name){
        this.name=name;
        System.out.println("ein Object wurde generiert.die Methoden Überladen");
    }

    public Arbeitnehmer(String name, double gehalt, int arbeitnehmerID, int urlaubstage, char geschlecht) {
        this.name = name;
        this.gehalt = gehalt;
        this.arbeitnehmerID = arbeitnehmerID;
        this.urlaubstage = urlaubstage;
        this.geschlecht = geschlecht;
    }

    public static void main(String[] args) {

        Lehrer lehrer  =new Lehrer("name Lehrer"); // ein Object wurde generiert.die Methoden Überladen
        Anwalt anwalt = new Anwalt("name Anwalt");// ein Object wurde generiert.die Methoden Überladen
        SDET sdet = new SDET("name SDET");// ein Object wurde generiert.die Methoden Überladen
        //Arbeitnehmer arbeitnehmer = new Arbeitnehmer();

        Lehrer lehrer2 = new Lehrer(); //ein Objeckt wurde generiert---default const. geliyor

        lehrer.geheInDenUrlaub();
        lehrer.erhöheGehalt();

        anwalt.geheInDenUrlaub();
        sdet.erhöheGehalt();

        System.out.println(sdet.name);
        System.out.println(lehrer.name);
        System.out.println(anwalt.name);

        sdet.working();// ein Objeckt wurde generiert
        System.out.println(sdet.bonus);
        System.out.println(sdet.java);


        lehrer.gehalt=50000;
        System.out.println(lehrer.arbeitnehmerID);
        System.out.println(lehrer.gehalt);


    }
}
