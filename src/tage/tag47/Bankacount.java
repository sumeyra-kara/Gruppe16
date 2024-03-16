package tage.tag47;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bankacount {

    // instanz variablen
    String accountName;
    String währung;
    String eröffnungsdatum;
    int accountNummer;
    double zinsRate;

    Bankacount(){ //default constructor

    }
    public Bankacount(String accountName,String währung,String eröffnungsdatum,int accountNummer,double zinsRate){ // cons.
        this.accountName= accountName;
        this.accountNummer=accountNummer;
        this.eröffnungsdatum=eröffnungsdatum;
        this.zinsRate=zinsRate;
        this.währung=währung;

    }
    public void print(){
        System.out.println("accountNummer : "+accountNummer);
        System.out.println("accountName : "+accountName);
        System.out.println("wahrung : "+ währung);
        System.out.println("zinsRate : "+zinsRate);
        System.out.println("eröffnungsdatum :" + eröffnungsdatum);
    }

    //Instanzmethoden :
    public void abheben (){
        System.out.println("abheben");
    }
    public void einzahl(){
        System.out.println("einzahlen");
    }

    public static void main(String[] args) {

        Bankacount account1 = new Bankacount();
        Bankacount account2 = new Bankacount();
        Bankacount account3 = new Bankacount("FestgeldKonto","Lira","1.2.1990",123332,2.3);
        Bankacount account4 = new Bankacount("geldKonto","Dolar","1.2.2000",132,6.4);


        account1.accountName = "Cirokonto";
        account1.accountNummer=24354;
        account1.währung="Euro";
        account1.eröffnungsdatum=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        account1.zinsRate=4.5;


        System.out.println(account1.accountName); //Cirokonto
        System.out.println(account1.accountNummer); //24354
        System.out.println(account1.währung);
        System.out.println(account1.eröffnungsdatum);
        System.out.println(account1.zinsRate);
        System.out.println("***********");

        System.out.println(account2.accountName); // null--tanimlamadik cunku default degerlerini göruruz
        System.out.println(account2.zinsRate); //0.0
        System.out.println(account2.accountNummer); //24354
        System.out.println(account2.währung);
        System.out.println(account2.eröffnungsdatum);
        System.out.println("********++");

        account3.print();
        System.out.println("********");
        account4.print();

        //alt + einfugen + fn kisayol constructor icin




    }
}
