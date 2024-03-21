package calisma2;

import java.util.*;

public class _4_Beispiel {
    /*
    String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000"

                samsung,'Samsung DC97-16991A Assembly Filter', 13000
                samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916,
                samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,
                samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981,
                samsung,'Samsung DC97-17022B Assy Detergent', 32959,
                samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000,
                samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995,
     */

    public static void main(String[] args) {

        //ArrayList<String> aa = new ArrayList<>();

        System.out.println(ornekMap());
        System.out.println("ornekMap().values() = " + ornekMap().values());




    }
    public static Map<String, Integer> ornekMap (){

        Map<String, Integer> washmaschine = new HashMap<>();


        washmaschine.put("samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA' ",  20916);
        washmaschine.put("samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',", 91995);
        washmaschine.put("samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M'", 22970);


        return washmaschine;
    }

    public static void a (Map<String, Integer> washmaschine){

        Set<Map.Entry<String,Integer>> a = washmaschine.entrySet();


        for (Map.Entry<String, Integer> eachEntry : a){

            Integer value = eachEntry.getValue();




        }
    }



}
