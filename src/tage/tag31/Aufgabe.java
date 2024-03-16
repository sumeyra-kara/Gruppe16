package tage.tag31;

public class Aufgabe {

    public static void main(String[] args) {
        // String name = nameStudentin(100);
        //System.out.println(name);

       // System.out.println(note(-140));

        result(100,85);
    }

    public static String findeNameStudent(int nummer){

        switch (nummer) {
            case 100:
                return "Sümeyra";
            case 200:
                return "Figen";
            case 300:
                return "Mustafa";
            case 500:
                return "Ersin";
            default:
                   return "keine";
        }
    }
    public static char berechneNote(int punkteZahl){

        if (punkteZahl>100 || punkteZahl<0){
            System.out.println("keine gültige Note");
            return ' ' ;
        }if (punkteZahl>=80){
            return 'A';
        } else if (punkteZahl>=60) {
            return 'B';
        } else if (punkteZahl>=40) {
            return 'C';
        } else if (punkteZahl>=20){
            return 'D';
        } else {
            return 'E';
        }

    }

    public static void result (int nummer, int punkteZahl){

       //String name = nameStudentin(nummer);
       //System.out.println(name);
       //System.out.println(nameStudentin(nummer));

       //char not = note(punkteZahl);
       // System.out.println(not);

       System.out.println(findeNameStudent(nummer) + " " + berechneNote(punkteZahl));


    }

}
