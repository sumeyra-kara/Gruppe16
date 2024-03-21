package tage.tag71;

import java.util.*;

public class Maps3 {
    public static void main(String[] args) {

        //   Key     Value
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Turkey", "Ankara");

        //   Key      Value
        Map<String, List<String>> cities = new HashMap<>();

        // Integer, String
        // String, Integer
        // String, String
        // String, Liste


        List<String> germanCities = new ArrayList<>();

        germanCities.add("Berlin");
        germanCities.add("München");
        germanCities.add("Frankfurt");
        germanCities.add("Nürnberg");
        germanCities.add("Hamburg");

        cities.put("Germany", germanCities);
        System.out.println("cities: " + cities);


        cities.put("England", Arrays.asList("London", "Leeds", "Newcastle", "Liverpool"));

        System.out.println("ArrayList: " + germanCities);

        System.out.println(cities.get("Germany"));
        System.out.println(cities.get("England"));



        System.out.println("England size: " + cities.get("England").size());
        System.out.println("Germany size: " + cities.get("Germany").size());

        System.out.println("cities: " + cities);


        System.out.println("cities keyset: " + cities.keySet());
        System.out.println("cities values: " + cities.values());

        for(List<String> list : cities.values())
        {
            // System.out.println(list.get(0));
        }



    }
}
