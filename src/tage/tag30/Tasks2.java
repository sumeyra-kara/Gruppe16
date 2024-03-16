package tage.tag30;

public class Tasks2 {

    public static void main(String[] args) {
       // System.out.println(yearBirth(1990));
        gehtDieRente("Sümeyra",1990);

    }

    public static int yearBirth (int year){
        return 2024-year;
    }

    public static void gehtDieRente (String name, int jahr){

        System.out.println(name + " geht in " + ( 67- yearBirth(jahr)) + " Jahren in Rente" );



    }

}
