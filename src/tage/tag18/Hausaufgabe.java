package tage.tag18;

public class Hausaufgabe {
    public static void main(String[] args) {

        // 0-Sonnntag 1-Montag 2-Dienstag 3-..


        int wochentag =6;
        boolean imUrlaub = false;

        if (!(wochentag>=0 && wochentag<=6)) {
            System.out.println("fehler wochentag");
        } if ((wochentag>=1 && wochentag<=5) && (!imUrlaub)){
            System.out.println("du musst 07:00 aufstehen");
        } else if ((wochentag==0 || wochentag==6) && (!imUrlaub)) {
             System.out.println("du musst 10:00 aufstehen");

        } else if ((wochentag>=1 && wochentag<=5) && (imUrlaub)) {
              System.out.println("du musst 10:000 Uhr aufstehen");
        } else if ((wochentag==0 || wochentag==6) && (imUrlaub)){
               System.out.println("Der Wecker ist aus");
        }
    }


}
