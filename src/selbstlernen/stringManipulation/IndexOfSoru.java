package selbstlernen.stringManipulation;
import java.util.Scanner;
public class IndexOfSoru {
    public static void main(String[] args) {

        // kullanicidan bir cumle ve cumlede aranacak metin isteyin
        // cumle ve metni karsilastirip asagidaki uc durumdan birini yazdirin
        // 1-verilen metin cumlede kullanilmamis
        //2-verilen metin cumlede sadece 1 kere kullanilmis
        // 3-verilen metin cumleden birden fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("lutfen cumlede aranacak metin giriniz");
        String metin = scanner.nextLine();

        if (!cumle.contains(metin)){
            System.out.println("verilen metin cumlede kullanilmamis");
        } else if(cumle.indexOf(metin) == cumle.lastIndexOf(metin)) {
            System.out.println("metin sadece bir kere kullanilmis");
        } else{
            System.out.println("birden cok kullanilmis");
        }


    }





}
