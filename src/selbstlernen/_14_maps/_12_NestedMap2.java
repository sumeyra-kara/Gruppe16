package selbstlernen._14_maps;

import java.util.HashMap;
import java.util.Map;

public class _12_NestedMap2 {
    /*
    Asagidaki body'i Map olarak olusturun
    {
      "firstname" : "Ahmet",
      "lastname" : "Bulut",
      "totalprice" : 500,
      "depositpaid" : false,
      "bookingdates" : {
            "checkin" : "2021-06-01",
            "checkout" : "2021-06-10"
                },
      "additionalneeds" : "wi-fi" }

     */

    public static void main(String[] args) {

        Map<String, Object> reqBody = new HashMap();
        reqBody.put("firstname","Burcu");
        reqBody.put("lastname","Sever");
        reqBody.put("totalprice",500);
        reqBody.put("depositpaid",false);


        Map<String,String> bookingdatesMap =new HashMap<>();
        bookingdatesMap.put("checkin","2021-06-01");
        bookingdatesMap.put("checkout","2021-06-10");

        reqBody.put("bookingdates",bookingdatesMap);
        reqBody.put("additionalneeds","wi-fi");

        System.out.println(reqBody);
        // {firstname=Burcu, additionalneeds=wi-fi, bookingdates={checkin=2021-06-01, checkout=2021-06-10}, totalprice=500, depositpaid=false, lastname=Sever}
        // hashMap oldugu icin rastgele siraladi

        // kullamicinin bilgilerini yazdirin
        System.out.println("reqBody.get(\"firstname\") = " + reqBody.get("firstname")); // Burcu
        System.out.println("reqBody.get(\"lastname\") = " + reqBody.get("lastname")); // Sever
        System.out.println("reqBody.get(\"totalprice\") = " + reqBody.get("totalprice")); // 5000
        System.out.println("reqBody.get(\"depositpaid\") = " + reqBody.get("depositpaid")); // false

        System.out.println("((Map)reqBody.get(\"bookingdates\")).get(\"checkin\") = " + ((Map) reqBody.get("bookingdates")).get("checkin"));
        System.out.println("((Map) reqBody.get(\"bookingdates\")).get(\"checkout\") = " + ((Map) reqBody.get("bookingdates")).get("checkout"));

    }
}
