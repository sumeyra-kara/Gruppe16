package tage.tag50;

public class LetterCount {

    public static void main(String[] args) {

        String str = "shffwkfjdsjgdshgdkjajjkajf"; // String is a sequence of Char

        System.out.println(str.charAt(10));
        System.out.println(str.length()); //26
        System.out.println("*****");

        int zähler=0;
        char buschtabe= 'a';

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==buschtabe){
                zähler++;
            }

            System.out.println(str.charAt(i)+" "+ zähler + " mal");
        }





    }
}
