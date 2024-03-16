package selbstlernen.stringManipulation;

import java.util.Scanner;

public class ReplaceAll {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin metinden tum karakter ve sayilari silecek
        // sadec harfler kalacak ornek :
        // input : "J1a37 va*12 C87.an d917.ir," output :  Java Candir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metni giriniz");
        String metin = scanner.nextLine();

        // önce sayilardan kurtulalim
        metin = metin.replaceAll("\\d", ""); // \\d digit yani sayi demek.sayi yerine hiclik koy demek

        // space'i koruma altina almak icin herhangi bir rakamla replace yapalim
        metin= metin.replaceAll("\\s","5");

        // özel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W", " ");

        //alt cizgiyi yok edelim ve sayi ekledigimiz yeri geri getirelim

        metin = metin.replaceAll("_","").replaceAll("5"," ");
        System.out.println(metin);








    }
}
