package tage.tag33;

public class VariablenTypen {

    int nummer; // Instanzvariabla. ohne static ve classs icinde--einen onjekt zugehörig--
    String name; // instanzvariable--- einem objekt zugewießen--einen onjekt zugehörig--

    public  static String name1; // globale variable oder klassenvariable--keinem Objekt zugehörig--
    public static int nummer1;// globale variable oder klassenvariable-keinem Objekt zugehörig--


    public static void main(String[] args) {
        int nummer = 1; // lokale variable
        String name = "xyz"; // lokale variable

        VariablenTypen meinObjekt1 = new VariablenTypen();
        meinObjekt1.name = "asdf";
        meinObjekt1.nummer= 123;

        VariablenTypen meinObjekt2 = new VariablenTypen();
        meinObjekt2.name = "tzu";
        meinObjekt2.nummer= 789 ;

    }
}
