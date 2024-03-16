package tage.tag39;

import java.util.Scanner;

public class Hausaufgabe2 {

    public static boolean specialCheck (String name2,String special2){

        for (int i = 0; i < special2.length() ; i++) {
            boolean result2 = name2.contains(special2.charAt(i)+"");

            if (result2){
                System.out.println("Im " + name2 + " gibt es character " + special2.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte schreiben Sie Ihr Name");
        String name2 = scanner.nextLine();

        System.out.println("Bitte schreiben Sie einige speciale Character");
        String special2 = scanner.nextLine();

        System.out.println(specialCheck(name2,special2));






    }

}
