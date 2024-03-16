package selbstlernen.ilkKonular;

public class Soru2 {
    public static void main(String[] args) {
        // Given two non-negative int values, return true if they have
        // the same last digit, such as with 27 and 57.
        // Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        // lastDigit(7, 17) → true
        // lastDigit(6, 17) → false
        // lastDigit(3, 113) → true

        int sayi1 = 890;
        int sayi2 = 23;

        if (sayi1 % 10 == sayi2 % 10){
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }
}
