package tage.tag19;

public class Switch1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        boolean result = a>b;

        if (result){ // boolean datentyp
            System.out.println("a ist größer als b");
        } else {
            System.out.println("b ist größer als a");
        }

        a = 15;

        switch (a){  // char,byte,short,int,string
            case 5 :
                System.out.println("die Zahl ist 5");
                break;
            case 10 :
                System.out.println("die Zahl ist 10");
                break;
            case 15 :
                System.out.println("die Zahl ist 15");
                break;
            case 25 :
                System.out.println("die Zahl ist 25");
                break;
            default: // optional
                System.out.println("keine der Zahlen passt zu meiner Eingabe");
                break;

        }
    }
}
