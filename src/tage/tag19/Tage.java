package tage.tag19;

public class Tage {
    public static void main(String[] args) {

        int tage = 7;
        String heute ="";


        switch (tage) {


            case 7:
                heute = "Sonntag";

                break;
            case 6:
                System.out.println("heute ist Samstag"); // bunun yerine heute = "samstag" yazabiliriz
                break;
            case 5:
                System.out.println("heute ist Freitag");
                break;
            case 4:
                System.out.println("heute ist Donnerstag");
                break;
            case 3:
                System.out.println("heute ist Mittwoch");
                break;
            case 2:
                System.out.println("heute ist Dienstag");
                break;
            case 1:
                System.out.println("heute ist Montag");
                break;
        }

        System.out.println(heute);

    }
}
