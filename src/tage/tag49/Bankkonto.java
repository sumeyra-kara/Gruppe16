package tage.tag49;

public class Bankkonto {

    private int kontonummer; // private: Zugriff aus anderer Klasse nicht möglich
    private String kontoinhaber;

    private double kontostand;

    Bankkonto(){

    }

    Bankkonto(int kontonummer, String kontoinhaber){
        this.kontonummer = kontonummer;
        this.kontoinhaber = kontoinhaber;
    }

    public int getKontonummer() { // getter methode
        return kontonummer; // Zugriff auf private instanzvariable durch Kapselung / encapsulation möglich
    }

    public String getKontoinhaber() { // getter methode
        return kontoinhaber; // Zugriff auf private instanzvariable durch Kapselung / encapsulation möglich
    }

    public double getKontostand() {
        return kontostand;
    }

}


class BankkontoTest{

    public static void main(String[] args) {

        Bankkonto bankKonto1 = new Bankkonto(123123, "Messi");

        System.out.println("Bankkonto1.kontoinhaber : " +  bankKonto1.getKontoinhaber());
        System.out.println("Bankkonto1.kontonummer  : " +  bankKonto1.getKontonummer());

    }
}
