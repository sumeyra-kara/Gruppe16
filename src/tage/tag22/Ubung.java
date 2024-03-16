package tagtag22;

public class Ubung {
    public static void main(String[] args) {

        // wenn Limit von 50 Büchern im Bücherregal erreicht wurde, erstelle eine neue Variable
        // für ein neues Bücherregal und lege die Bücher in das neue Bücherregal

        int bucher =139,i;

        for (i=1; i<=((bucher/50)); i++) { // 200 kez tekrar edecek //  satir
            for (int j = 1; j <=50; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        for (i = 1; i <=(bucher%50) ; i++) {
                System.out.print(i + " ");
            }
        System.out.println(" ");
        }


    }

