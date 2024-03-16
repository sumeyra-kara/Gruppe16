package tage.tag23;

public class NestedForLoop {
    public static void main(String[] args) {

        int n;
        for (int i = 0; i <4 ; i++) {
            System.out.println("Außere Schleife " + i);
            for (n = 0; n <3 ; n++) {
                System.out.println("    innere Schleife " + n);
            }


        }
    }
}
