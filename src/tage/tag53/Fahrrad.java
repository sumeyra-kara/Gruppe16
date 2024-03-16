package tage.tag53;

public class Fahrrad {

    //Instanzvariablen:
    private int geschwindigkeit;
    private int gang;
    private int id;

    //Statische Variable
    private static int anzahlFahrräder;

    Fahrrad(){
        this.id = ++anzahlFahrräder + 100;
    }

    public Fahrrad(int geschwindigkeit, int gang) {

        this.geschwindigkeit = geschwindigkeit;
        this.gang = gang;

        this.id = ++anzahlFahrräder + 100;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getGang() {
        return gang;
    }

    public void setGang(int gang) {
        this.gang = gang;
    }

    public int getId() { // ID ist read-only!!!
        return id;
    }

    public static int getAnzahlFahrräder() {

        return anzahlFahrräder;
    }

    public static int getAnzahlFahrräder2() {

        return anzahlFahrräder;
    }

}
