package tage.tag50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Name {

   ArrayList<String > nameOfPeople  =new ArrayList<>(Arrays.asList("Mustafa","Figen","Ersin","Sümeyra","Dominik",
            "Jean","Tobias","Tarik","Ronaldo","Anatonia","Messi","Max","Eda","John","Gül","Mertens","Icardi",
            "Apo","Kazim","Seda"));

   public String oneName (){

       Random random = new Random();
       int index= random.nextInt(nameOfPeople.size());
       System.out.println("Random name : " + nameOfPeople.get(index));
       return nameOfPeople.get(index);
   }

   public ArrayList<String> wholeNameOfList (){
       System.out.println(nameOfPeople);
       return nameOfPeople;
   }

   public ArrayList<String> nameList (int number){
       ArrayList<String> numberNames =  new ArrayList<>();
       if (number>nameOfPeople.size()){
           number=nameOfPeople.size();
       }


       for (int i=0; i< number; i++){

           numberNames.add(oneName());
       }


       return numberNames;
   }


   public static void main(String[] args) {



   }
}
