package tage.tag50;

public class KapselungReview {

    public static void main(String[] args) {

        Schüler schüler1= new Schüler();
        Schüler schüler2= new Schüler("Ersin",1980,"Munchen");
        schüler2.printname();

        schüler2.setNamen("Figen");
        schüler2.printname();
        System.out.println(schüler2.getNamen());

        Schüler schüler3 =  new Schüler("Dominik",1989,"München");

        schüler3.setNamen("dom");
        schüler3.setGeburtsjahr(1990);
        schüler3.setWohnort("Frankfurt");



    }
}
