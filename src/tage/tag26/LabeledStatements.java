package tage.tag26;

public class LabeledStatements {

    public static void main(String[] args) {
        label: for (int j = 1; j <=10 ; j++) {  // outer loop

            for (int k = 1; k <=5 ; k++) { // innere Loop

                if ((j*k) == 10){

                    break label;
                }
                System.out.println("aaa");
            }

        }
    }
}
