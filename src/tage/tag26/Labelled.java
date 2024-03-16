package tage.tag26;

public class Labelled {
    public static void main(String[] args) {
        outer1: for(int j=1; j<=10; j++){ //outer loop

            for(int k=1; k<=5; k++) { //inner loop

                if((j*k)==10)
                {
                    break outer1;
                }
                System.out.println(j + " * " + k + " = " + (j*k));
            }
        }


        System.out.println("****************************");
        System.out.println("Außerhalb der Schleife");

    }
}
