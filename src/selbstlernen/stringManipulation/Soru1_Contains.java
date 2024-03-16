package selbstlernen.stringManipulation;

import java.util.Scanner;

public class Soru1_Contains {
    public static void main(String[] args) {
        // kullanicidan bir cumle alin
        // cumleden ev geciyorsa,"home home sweet home" yazdirin
        // is geciyorsa "calismak guzeldir" yazdirin
        // ikisi de iceriyorsa "cok calisman lazim"
        // ikiisni de icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("hem ev lazim hem is");
        } else if (cumle.contains("ev")){
            System.out.println("home home sweet home ");
        } else if (cumle.contains("is")) {
            System.out.println("hem ev lazim hem is");
        } else {
            System.out.println("cok calisman lazim");
        }

    }
}
