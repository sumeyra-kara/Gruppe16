package selbstlernen._02_forLoop;

public class AsalSayiBulma {
    public static void main(String[] args) {

            // Eine Primzahl ist nur durch sich selbst und durch 1 teilbar

            int nummerZuPrüfen = 15;
            boolean istPrimzahl = true;
            int restwert = 0;

            for(int i = 2; i <= nummerZuPrüfen/2; i++){

                restwert = nummerZuPrüfen % i;
                System.out.println(nummerZuPrüfen + " geteilt durch " + i +  " ergibt Restwert: " + restwert);

                if(restwert == 0) // ist teilbar
                {
                    // es ist keine Primzahl
                    istPrimzahl = false;
                    break;
                }
            }

            System.out.println("**********************");

            if(istPrimzahl){ // true
                System.out.println(nummerZuPrüfen + " ist eine Primzahl");
            }
            else {  // false
                System.out.println(nummerZuPrüfen + " ist kein Primzahl");
            }



        }

}