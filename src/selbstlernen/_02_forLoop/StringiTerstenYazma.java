package selbstlernen._02_forLoop;

import java.util.Scanner;

public class StringiTerstenYazma {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();  // Java Candir

        for (int i = metin.length()-1; i >=0 ; i--) { // sonuncu sayidan basa dogru
            // sonra da char ile son karakterden ilk karaktere dogru yazdiriyoruz

            System.out.print(metin.charAt(i));

        }


    }
}
