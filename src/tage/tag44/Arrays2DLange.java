package tage.tag44;

public class Arrays2DLange {
    public static void main(String[] args) {

        int[][] nummern = {{1,2,3,4},{10,20,30,40,50},{100,200,300}};

        System.out.println(nummern.length);

        /*for (int n = 0; n < nummern.length; n++) {
            System.out.print(nummern[n].length);
        }

         */

arrayAusgeben(nummern);




    }

    public static void arrayAusgeben (int [][] num){

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println(num[i][j]);
            }

        }

    }
}
