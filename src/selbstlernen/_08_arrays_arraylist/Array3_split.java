package selbstlernen._08_arrays_arraylist;

import java.util.Arrays;

public class Array3_split {
    public static void main(String[] args) {

        // bir String'i array'e nasil cevirebiliriz

        String str = "Java cok guzel"+" 123 786"; // basit bir string

        String [] kelime = str.split(" "); // split ile -- bu sekilde ayirip yeni bir string array'e atayabiliriz
        // bosluklardan kelime kelime ayirabilir
        System.out.println(Arrays.toString(kelime));

        //System.out.println(Arrays.toString(str.split(" "))); veya kisaca

    }
}
