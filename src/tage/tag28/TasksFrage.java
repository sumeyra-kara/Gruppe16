package tage.tag28;

public class TasksFrage {

    public static void main(String[] args) {
        /*
        Schreiben Sie eine Methode, die 2 Zahlen und 1 Operator akzeptiert,
        und führen Sie die entsprechende korrekte Berechnung durch
            1- Nummer 2- Nummer  3-Operator(-,+,*,/)
                        Beispielausgabe:
                        Rechner(10,5, „+“) -> 15
                        Rechner(10,5, „-“) -> 5
                        Rechner(10,5, „*“) -> 50
                        Rechner(10,5, „/“) -> 2
         */
        System.out.println(calculation(15.2,2,'/'));



    }

    public static double calculation (double a, double b, char c){

      double result=0;

        if (c=='+'){
            result= a+b;
        } else if (c=='-') {
            result= a-b;
        } else if (c=='*') {
            result=a*b;
        } else if (c=='/'){
            result=(a/b);
        }
        return result;
    }
}
