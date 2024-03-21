package selbstlernen._06_stringManipulation;

import java.util.Scanner;

public class Soru {

    public static void main(String[] args) {
        // kullanicidan isim soyisim ve kredikarti builgileri iste
        // isim olarak A***** N***** seklinde ilk harfler buyuk digeleri * olarak gorunsun
        // gorunur kart no : **** **** **** 1234 olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();


        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen kredikarti numaranizi bosluksuz 16 karakter giriniz");
        String kkNo = scanner.nextLine();

        String gorunurIsim =  isim.substring(0,1).toUpperCase()
                              + isim.substring(1).replaceAll("\\w","*")
                              + " "
                              +  soyisim.substring(0,1).toUpperCase()
                              + soyisim.substring(1).replaceAll("\\S", "*");

        String gorunurkkNo = "**** **** **** **** " + kkNo.substring(kkNo.length()-4);


        System.out.println(gorunurIsim);
        System.out.println(gorunurkkNo);

    }
}
