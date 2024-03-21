package tage.tag71;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps2 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> capitals = new LinkedHashMap<>();

        capitals.put("England", "London");
        capitals.put("Germany", "Berlin");
        capitals.put("Austria", "Vienna");
        capitals.put("Turkey", "Ankara");
        capitals.put("Spain", "Madrid");

        System.out.println("capitals: " + capitals); //sortiert

        System.out.println("capials mit key spain: " + capitals.get("Spain"));

        System.out.println("Keys  : " + capitals.keySet());
        System.out.println("Values: " + capitals.values());

        System.out.println("****************************");


        for(Map.Entry<String, String> cities : capitals.entrySet()){

            System.out.println("cities.getKey() : " + cities.getKey());
            System.out.println("cites.getValue(): " + cities.getValue());
            System.out.println("_________________________________");
        }


        LinkedHashMap<String, String> capitals2 = new LinkedHashMap<>();

        //Treemap
        Map<Integer, String> numberOfPerson = new TreeMap<>();

        numberOfPerson.put(5, "Sümeyra"); // Key = 5 , Value = Sümeyra
        numberOfPerson.put(2, "Mustafa");
        numberOfPerson.put(3, "Figen");
        numberOfPerson.put(4, "Ersin");
        numberOfPerson.put(1, "Dominik");

        System.out.println("numberOfPerson: " + numberOfPerson);

        System.out.println("numberOfPerson: " + numberOfPerson.size());

        for(int i : numberOfPerson.keySet())
        {
            System.out.println("key: " + i);
            System.out.println("get: " + numberOfPerson.get(i));
        }




    }
}
