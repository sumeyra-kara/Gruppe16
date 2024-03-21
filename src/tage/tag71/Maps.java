package tage.tag71;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {

        // Key, Value

        HashMap<String, Integer> playersGoals = new HashMap<>();

        playersGoals.put("Ronaldo" , 10);
        playersGoals.put("Messi" , 12);
        playersGoals.put("Robben" , 16);
        playersGoals.put("PlayerXY", 8);

        System.out.println("playerGoals.get(Ronaldo): " + playersGoals.get("Ronaldo"));
        System.out.println("playerGoals.get(Messi):   " + playersGoals.get("messi")); // case sensitive
        System.out.println("playerGoals.get(Robben):  " + playersGoals.get("Robben"));


        System.out.println("***********************************");

        System.out.println(playersGoals); // unsortiert

        //playersGoals.put("ronaldo", 25); // neues Key/Value paar wurde erstellt
        playersGoals.put("Ronaldo", 25); // change value

        System.out.println(playersGoals);

        System.out.println(playersGoals.keySet()); // gibt alles keys in meiner map aus


        Set<String> players = playersGoals.keySet();
        System.out.println("Set: " + players);

        for(String name : playersGoals.keySet()){ // for-each iteriert über Keys
            System.out.println("name: " + name);
        }

        System.out.println(playersGoals.values());

        for(Integer nummer : playersGoals.values()) // for-each iteriert über Values
        {
            System.out.println("nummer: " + nummer);
        }

        System.out.println(playersGoals);

        System.out.println("contains Ronaldo (key): " + playersGoals.containsKey("Ronaldo"));
        System.out.println("contains 12 (value)   : " + playersGoals.containsValue(12));

        playersGoals.put("Ronaldo", 5000); //überschreibt Value
        System.out.println(playersGoals);

        playersGoals.putIfAbsent("ronaldo", 10); // Erstellt key/value paar nur wenn noch nicht vorhanden
        System.out.println(playersGoals);

        playersGoals.put("ronaldo", 20);
        System.out.println(playersGoals);

        printMaps(playersGoals);

        System.out.println(playersGoals.size());


    }


    public static void printMaps(Map<String, Integer> maps){

        System.out.println("_____________________________________");
        System.out.println("maps: " +  maps);
        System.out.println("_____________________________________");
    }

}
