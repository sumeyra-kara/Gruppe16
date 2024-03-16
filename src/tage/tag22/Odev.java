package tage.tag22;

public class Odev {
    public static void main(String[] args) {


            // Ein Bücherregal ist Platz für 50
            // Lege nach und nach 1 Buch in das Bücherregal.
            // Wenn 50 Bücher im Bücherregal sind, gib eine Warnung aus

            int bücher1 = 0;
            int bücher2 = 0;
            int anzahlAnBüchern = 200;
            boolean neuesRegel = false; // false --> noch kein neues Regal wurde angefangen
            // true  --> neues Regal wurde angefangen


            // i = 0,1,2,3,4,5,6, .. 200
            for(int i = 0; i <= anzahlAnBüchern; i++) // 49
            {
                //100 mal wird durch die Schleife iteriert

                if(bücher1 < 49 && !(neuesRegel)) //
                {
                    // Wir legen Bücher in unser Bücherregal
                    bücher1 = bücher1 + 1; // 48 + 1 = 49
                    System.out.println("Bücherregal 1 wird erhöht: " + bücher1); // 49
                }
                else if(bücher1 == 49) // 49 + 1 = 50
                {
                    System.out.println("Mein Bücherregal ist fast voll!");
                    System.out.println("Neues Regal");
                    neuesRegel = true;

                    bücher1 += 1; // 49 + 1 --> 50
                    System.out.println("Bücherregal 1 wird erhöht: " + bücher1);
                    System.out.println("*******************************************");
                }
                else if(neuesRegel) // true
                {
                    // Szenario für meines neues Regal
                    bücher2 += 1;
                    System.out.println("Bücherregal 2 wird erhöht: " + bücher2);
                }


            }

            System.out.println("Bücher im Bücherregal 1: " + bücher1);
            System.out.println("Bücher im Bücherregal 2: " + bücher2);


        }
    }


