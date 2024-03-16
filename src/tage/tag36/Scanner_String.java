package tage.tag36;

import java.util.Scanner;

public class Scanner_String {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Gib einen Text ein");
        String myText = sc.nextLine();

        System.out.println("Gib deninen Namen ein");
        String name = sc.next();

        System.out.println("Gib deinen Alter ein");
        int alter = sc.nextInt();


      // System.out.println(myText + " " + name + " " +  alter);
        System.out.println(myText);
        System.out.println(name);
        System.out.println(alter);


    }
}
