package selbstlernen.metotlar;

import java.util.Scanner;

public class MetniTersineCevirme {
    public static void main(String[] args) {
        // verilen bir metni tersine cevirip bize döndüren bir method olusturalim

        System.out.println(metniTerseCevir("seni seviyorum"));

        // Madam kelimesinin palindrome olup olmadigini yazdirin (tersten duzden okunusu ayni)
        if ("madam".equalsIgnoreCase(metniTerseCevir("madam"))){
            System.out.println("madam polindrome");

            // kullanici ile

            Scanner scanner= new Scanner(System.in);
            System.out.println("lütfen bir metin giriniz");
            String str = scanner.nextLine();

            if (str.equalsIgnoreCase(metniTerseCevir(str))){
                System.out.println("verilen mtin palindrom");
            } else {
                System.out.println("palindrom degil");
            }
        }
    }

    public static String metniTerseCevir (String metin) { // Bu is bu kadar.
       String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.substring(i,i+1);
        }
        return tersMetin;
    }
}
