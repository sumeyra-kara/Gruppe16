package tage.tag19;

public class Hausaufgabe {
    public static void main(String[] args) {


        double eintrittKosten = 0;
        double rabatteKosten = eintrittKosten * 0.8;
        int tage = 4;



        switch (tage) {
            case 1:
            case 2:
                eintrittKosten = 2;
                rabatteKosten = eintrittKosten * 0.8;
                System.out.println("der Eintritt ist 2 Euro");
                System.out.println("Mit Rabattekarte ist : "+ rabatteKosten);
                break;
            case 3:
            case 4:
            case 5:
                eintrittKosten = 3;
                rabatteKosten = eintrittKosten * 0.8;
                System.out.println("der Eintritt ist 3 Euro");
                System.out.println("Mit Rabattekarte ist : "+ rabatteKosten);
                break;
            case 6:
            case 7:
                eintrittKosten = 10;
                rabatteKosten = eintrittKosten * 0.8;
                System.out.println("der Eintritt ist 10 Euro");
                System.out.println("Mit Rabattekarte ist : "+ rabatteKosten);
                break;
            default:
                System.out.println("Fehler");
            }

        System.out.println();

        }

    }

