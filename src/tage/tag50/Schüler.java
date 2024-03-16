package tage.tag50;

public class Schüler {

    private String namen;
    int geburtsjahr;
    String wohnort;

    // public: herkes istedigi yerden ulasabilir
    // private : bulundugu class icinden sadece ulasilabilir
    // default :  sadece icinde bulundugu pacage icinde
    // protected : kendi paackage ve diger package classlardan

    Schüler(){
    }

    public Schüler (String namen, int geburtsjahr,String wohnort){
        this.namen= namen;
        this.geburtsjahr=geburtsjahr;
        this.wohnort=wohnort;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public Schüler(String namen, int geburtsjahr) {
        this.namen = namen;
        this.geburtsjahr = geburtsjahr;
    }

    public void printname(){
        System.out.println(namen);
    }


    public  String getNamen (){
        return namen;
    }

    public void setNamen(String namen,int geburtsjahr,String wohnort){

        this.namen=namen;
        this.geburtsjahr=geburtsjahr;
        this.wohnort=wohnort;
    }


    public static void main(String[] args) {

    }
}
