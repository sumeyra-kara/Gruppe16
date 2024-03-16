package tage.tag63;

public class Person {

    private String vorname;
    private String nachname;
    private String geburtsDatum;

    // "has-a"-relationship:
    private Arbeit arbeit; // "Composition"


    public Person(){
        this.arbeit = new Arbeit();
        arbeit.setGehalt(60000);
    }

    public double getGehalt(){
        return arbeit.getGehalt();
    }

}
