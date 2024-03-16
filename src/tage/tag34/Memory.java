package tage.tag34;

public class Memory {
    public static void main(String[] args) {

        String city = "München";
        String town = "München";

        System.out.println(city == town); // true

        String secondCity = new String("München");
        System.out.println("secondCity = " + secondCity);
        System.out.println("city       = " + city);
        System.out.println("town       = " + town);

        System.out.println(secondCity == town); // false



    }
}
