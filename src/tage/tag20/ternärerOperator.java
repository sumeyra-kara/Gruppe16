package tage.tag20;

public class ternärerOperator {
    public static void main(String[] args) {


        int punkteZahl = 60;

        String prüfung = punkteZahl>=50 ? ("Deine Punktezahl ist " + punkteZahl + " und du hast bestanden")
                : ("Deine Punktezahl ist " + punkteZahl + ". Du benötigst " + (50-punkteZahl) + " Punkte mehr um zu bestehen");

        System.out.println(prüfung);
    }
}
