package tage.tag28;

public class MethodenMitParametern {
    public static void main(String[] args) {

        // call of method

        sumNumbers(2,56);

    }

    public static void sumNumbers (int start, int ende){
        System.out.println("ich summiere die Zahlen " + start + " bis " + ende + " auf ");
        int sum=0;
        for (int i = start; i < ende; i++) {
            sum+=i;
        }
        System.out.println("summe : " + sum);

    }
}
