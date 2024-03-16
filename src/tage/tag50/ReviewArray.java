package tage.tag50;

import java.util.ArrayList;

public class ReviewArray {

    public static void main(String[] args) {
        // erstelle eine Liste und speichere 20 Namen in der Liste
        // Erstellle eine methode ,die einen tufälligen Namen ausgibt
        // Erstelle eine Metgode, die die gesmamte Liste ausgibt
        // Erstelle eine Methode die mehrere Namen ausgibt,basierend auf den Ubergabeparametern--5 Namen


       /* ArrayList <String> nameOfPeople = new ArrayList<>(Arrays.asList("Mustafa","Figen","Ersin","Sümeyra","Dominik",
                "Jean","Tobias","Tarik","Ronaldo","Anatonia","Messi","Max","Eda","John","Gül","Mertens","Icardi",
                "Apo","Kazim","Seda"));

        */

        Name names =  new Name();
        //System.out.println(names.nameOfPeople);
        names.oneName();
        System.out.println(names.nameOfPeople);


        //names.wholeNameOfList();
        names.wholeNameOfList();
        System.out.println("*******");

        ArrayList<String> mylist = names.nameList(500);
        System.out.println(mylist);



    }




}
