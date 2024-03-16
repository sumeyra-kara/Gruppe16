package tage.tag38;

import java.util.Scanner;

public class Hausaufgabe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte schreiben Sie einen Satz");
        String satz = scanner.nextLine();

        int zahlDerBuchstaben = 0;


        for (int i = 0; i < satz.length(); i++) {
            char characterInChar = satz.charAt(i);

            if((characterInChar>='a' && characterInChar<='z')||(characterInChar>='A' && characterInChar<='Z')){
                zahlDerBuchstaben++;
            }
        }


        System.out.println( "unser Satz  : " + satz);

        System.out.println("die Zahl der Buchstaben von erstem Satz: " + zahlDerBuchstaben);

        System.out.println("**************");

        System.out.println("unser neue Satz : "  + satz.replace('a','#').replace('e','#'));


        zahlDerBuchstaben=0;
        String neuSatz = satz.replace('a','#').replace('e','#');

        for (int i = 0; i < neuSatz.length(); i++) {
            char characterInChar = neuSatz.charAt(i);

            if((characterInChar>='a' && characterInChar<='z')||(characterInChar>='A' && characterInChar<='Z')){
                zahlDerBuchstaben++;
            }

        }


        System.out.println("die zahl der Buchstaben von neuem Satz: " + zahlDerBuchstaben);

    }
}
