package tage.tag49;

public class Kapselung {

    private int i;
    private int xy;
    private String nummer;

    public Kapselung(){

    }

    public Kapselung(String nummer)
    {
        this.nummer = nummer;
    }

    public Kapselung(String nummer, int i, int xy)
    {
        this.nummer = nummer;
        this.i = i;
        this.xy = xy;
    }

    // READ-ONLY, da keine setter-Methoden:

    public int getI() {
        return i;
    }

    public int getXy() {
        return xy;
    }

    public String getNummer() {
        return nummer;
    }

    /*
    public void setI(int i) {
        this.i = i;
    }

    public void setXy(int xy) {
        this.xy = xy;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }*/

}
