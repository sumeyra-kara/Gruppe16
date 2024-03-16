package tage.tag33;

public class Person {

    String name;
    char geschlecht;
    String beruf;

    public void getInfo() //Instanzmethode
    {
        System.out.println("****************************");
        System.out.println("Name      : " + name);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Beruf     : " + beruf);
    }


    public static void main(String[] args) {

        Person Dominik = new Person();

        Dominik.name = "Dominik";
        Dominik.beruf = "Lehrer";
        Dominik.geschlecht = 'm';

        Dominik.getInfo();


        Person HansRossling = new Person();

        HansRossling.name = "Hans Rossling";
        HansRossling.beruf = "Arzt und Buchautor";
        HansRossling.geschlecht =  'm';

        HansRossling.getInfo();

        Person Figen = new Person();

        Figen.name = "Figen";
        Figen.beruf = "Anwältin";
        Figen.geschlecht = 'f';

        Figen.getInfo();







    }
}
