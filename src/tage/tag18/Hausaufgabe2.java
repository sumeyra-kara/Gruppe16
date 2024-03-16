package tage.tag18;

public class Hausaufgabe2 {
    public static void main(String[] args) {

        int wochentag =7;
        boolean imUrlaub = false;

        if (!(wochentag>=0 && wochentag<=6)) {
            System.out.println("fehler wochentag");
        }if ((wochentag>=1 && wochentag<=5) && (!imUrlaub)){
            System.out.println("du musst 07:00 aufstehen");
        } else if ((wochentag==0 || wochentag==6) && (!imUrlaub) ||(wochentag>=1 && wochentag<=5) && (imUrlaub)) {
            System.out.println("du musst 10:00 aufstehen");
        } else if ((wochentag==0 || wochentag==6) && (imUrlaub)){
            System.out.println("Der Wecker ist aus");
        }

    }
}
