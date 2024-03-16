package tage.tag33;

public class Tier {

    public String gender;
    public int wieVieleFüsseHat;
    public char geschlecht;
    public int geburtsDatum;
    public String name;


    public void gibtInfo (){
        System.out.println("Gender       : " + gender);
        System.out.println("Name         : " + name);
        System.out.println("Geschlecht   : " + geschlecht);
        System.out.println("GeburtsDatum :" + geburtsDatum);
        System.out.println("Es ist " + wieVieleFüsseHat + " füsse ");
    }
    public void familie (){
        System.out.println(name + " hat eine Familie");
    }
    public void istAltOder (){

        if (geburtsDatum>=2019){
            System.out.println(name + " ist sehr jung");
        } else {
            System.out.println(name + " kann alt sein");
        }
    }


    public static void main(String[] args) {

        Tier tier1 = new Tier();
        tier1.gender="Kätzin";
        tier1.name= "Rauch";
        tier1.geburtsDatum= 2022;
        tier1.geschlecht='w';
        tier1.wieVieleFüsseHat=4;


        Tier tier2 = new Tier();
        tier2.gender="Hund";
        tier2.name= "Sugar";
        tier2.geburtsDatum= 2017;
        tier2.geschlecht='m';
        tier2.wieVieleFüsseHat=4;



        tier1.gibtInfo();
        tier1.familie();
        tier1.istAltOder();
        System.out.println("------------");

        tier2.gibtInfo();
        tier2.familie();
        tier2.istAltOder();

    }

}
