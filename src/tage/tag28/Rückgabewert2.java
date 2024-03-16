package tage.tag28;

public class Rückgabewert2 {
    public static void main(String[] args) { // void= kein Ruckgabewert


        int result = 0;


       result = ageCalculation(1993);


        System.out.println("das alter ist : " + result);

        System.out.println(ageCalculation(1990));



    }

    public static int ageCalculation (int geburtsjahr){ // rückgabewert ist typ int

        int alter = 2024 - geburtsjahr;

        // System.out.println("alter ist : " +  alter);

        return alter; // methodun sonuna ekliyoruz. rückgabewert ist alter..
        // System.out.println("hello"); // returndan sonra oldugu icin hata verir

    }
}
