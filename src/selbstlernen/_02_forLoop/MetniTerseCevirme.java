package selbstlernen._02_forLoop;

import java.util.Scanner;

public class MetniTerseCevirme {
    public static void main(String[] args) {

        // bu sadece metinler icin degil sayilar icin de gecerli

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();  // Java Candir
        String tersMetin ="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin += metin.charAt(i);
        }
        System.out.println(tersMetin);

        // duzunden de tersinden de okundugunda ayni olan metinler : palindrome metinlerdir
        // kullanicidan girilen metin palindrome metin mi diye bulmak icin?

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("palindrome");
        } else {
            System.out.println("palindrome degil");
        }



    }
}
