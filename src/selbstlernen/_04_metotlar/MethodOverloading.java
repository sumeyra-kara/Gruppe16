package selbstlernen._04_metotlar;

public class MethodOverloading {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayip sonucu yazdiran method olusturun
        // yazdiracagi icin void kullaniriz

        toplaYazdir(5,7);
        toplaYazdir(10.4,6);
        toplaYazdir("asli", 6);
        toplaYazdir(5,9);// ilki double ama int yazsak da kabul ediyor
        toplaYazdir('4','a'); // char sayiya donusecek cunku
        toplaYazdir(3.5f,5); // float olsa da double gibi gorur cevirir ve calisir
                                // float double degildir ma casting yapilarak olur
    }

    public static void toplaYazdir (int sayi1, int sayi2){
        System.out.println("iki in toplami : " + (sayi1+sayi2));
    }

    // parametre isimlerini degistirerek ayni methodu iki kere olusturabilir miyim? hayir olmaz
    //java parametrelerin adina degil,data turune bakiyor.
    // yukaridakinde toplayazdir int,int varken yenisini olusturmaz
    // int int yerine double int yapariz mesela


    /*
    java'da method ismi ve parametelerin data turleri birlikte düsünüldugunde
    ortaya cikan metne METHOD SIGNATURE denir ( toplayazdir int int gibi)

    Java methodlardaki parametre isimlerine degil method signature'ina bakar.ayni method
    signature'na sahip birden fazla method olusturmaniza IZIN VERMEZ
     */

    public static void toplaYazdir (double a, int b){
        System.out.println("iki in toplami : " + (a+b));
    }

    public static void toplaYazdir (String a, int b){
        System.out.println("toplami : " + (a+b));
    }


}
