package tage.tag72;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(String text) {

        boolean result = true;
        String textToCheck = text.toLowerCase();

        for(int i=0; i<textToCheck.length()/2; i++) {

            System.out.println("neben / 2 :" + textToCheck.length()/2);

            if(textToCheck.charAt(i) != textToCheck.charAt(textToCheck.length()-1-i)) {
                result = false;
            }
        }
        return result;
    }




    public static void main(String[] args){

        //pauseCode(10);

        Scanner scan = new Scanner(System.in);
        System.out.print("Wort zu prüfen:: ");

        String text = scan.nextLine();
        if(isPalindrom(text)) {
            System.out.println(text+ " ist ein Palindrom");
        }else {
            System.out.println(text+ " ist kein Palindrom");
        }


    }
}
