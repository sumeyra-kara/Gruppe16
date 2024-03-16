package tage.tag44;

import java.util.Scanner;

public class Hausaufgabe3 {
    public static void main(String[] args) {


/*
        StringBuilder str = new StringBuilder("hallo liebe ferunde");
       // str.append("hallo liebe ferunde");
        System.out.println("original : " + str);

        // str.reverse();
        System.out.println("umgekehrt : " + str.reverse());

        System.out.println("Anzahl der Zeichen : " +str.length());

 */



        Scanner scanner =  new Scanner(System.in);
        System.out.println("gibt eine Zeichenkette ein : ");
        String inpStr = scanner.nextLine();

        StringBuilder anlyResult = new StringBuilder();
        System.out.println(anlyResult.append("original : ").append(inpStr));


        StringBuilder inp = new StringBuilder();
        System.out.println("umgekehrt :" + inp.append(inpStr).reverse());


        System.out.println("länge : "+ inpStr.length());







    }


}
