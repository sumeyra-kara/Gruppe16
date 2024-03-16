package tage.tag17;

public class Übung_If {
    public static void main(String[] args) {

        int akuStand = 100;

        if (akuStand<=25 && akuStand>0) {
            System.out.println("rot");

        }
        if (akuStand<50 && akuStand>25) {
            System.out.println("gelb");

        }
        if (akuStand<100 && akuStand>=50) {
            System.out.println("grün");

        }
        if (akuStand==100){
            System.out.println("voll geladen");
        }









    }
}
