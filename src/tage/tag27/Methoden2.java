package tage.tag27;

public class Methoden2 {

    public static void main(String[] args) {

        printNumber0to10();
        System.out.println("***********");
        printNumber25to50();
        System.out.println("**************+");
        printSumOf50();
    }

    public static void printNumber0to10 (){

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

    } // ende meiner methoden

    public static void printNumber25to50 (){

        for (int i = 25; i <= 50 ; i++) {
            System.out.println(i);
        }

    } // ende meiner methoden

    public static void printSumOf50() {

        int sum = 0;
        for (int i = 0; i <= 50 ; i++) {
            sum+=i;
            System.out.println(sum);
        }
        System.out.println("die aufsummierte Ergebnis ist : " + sum);
    } // ende meiner methoden

} // ende meiner Klasse
