package tage.tag53;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

public class StaticImport {

    public static void main(String[] args) {

        String text = "A^*()KLJLKASJD1231233234asdAVD";


        for(int i=0; i < text.length(); i++ ){

            char c = text.charAt(i);
            //System.out.println(text.charAt(i));

            if(isAlphabetic(c))
            {
                System.out.println(c + " ist Buchstabe!");
            }
            else if(isDigit(c))
            {
                System.out.println(c + " ist Zahl!");
            }
            else {
                System.out.println(c + " ist Character");
            }

        }

    }
}
