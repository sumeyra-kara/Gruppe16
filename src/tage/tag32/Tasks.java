package tage.tag32;

public class Tasks {

    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
      stern(5);
      System.out.println("------------");
      stern2(5);
    }

    public static void stern (int wieVielMal){

        for (int i = 1; i <= wieVielMal ; i++) {
            for (int j =1; j <= i ; j++) {
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }

    /*
    frage2:

     * * * * *
     * * * *
     * * *
     * *
     *

     */

    public static void stern2 (int wieVielMal2){

        for (int i = wieVielMal2; i >=1 ; i--) {
            for (int j = 1; j < i+1 ; j++) {
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }
}
