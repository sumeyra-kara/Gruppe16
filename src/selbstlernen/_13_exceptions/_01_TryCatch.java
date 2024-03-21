package selbstlernen._13_exceptions;

public class _01_TryCatch {
    /*
    Kodlarimizi yazarken sorun olusma ihtimali gördügümüzde sorun cikma potansiyeli olan kodlari
    try- catch - (finally) bloklari ile cevreleriz

    (Code -Surround With kisayolunu kullanarak intellij otomatik yapar)

    try blogu mutlaka catch blogu ile kullanilmak zorunda degil, finally ile de kullanilabilir
     */


    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 0;

        try {

            System.out.println(sayi1/sayi2);

        } catch (ArithmeticException e) {

            // e.printStackTrace(); --- exception'da gördugumuz tum hata aciklamalarini yazdir demek-(en altta yazar)
            // System.out.println("Bölen sayi 0 olamaz"); --- bunu istersek yazdirabiliriz
            // System.out.println(e.getMessage()); --- hatanin kaynagini gosterir
            // System.out.println(e.getCause()); // --null
        }

        /*
        Bir try catch blogu 3 bölümden olusur;

        1- try Blogu : 17-21(21.satir haric)
           - exception olusturma potansiyeli olan kodlar yazilir
           - Bunlar aslinda calistirmak istedigimiz kodlarimizdir
        2- catch (ArithmeticException e )
            catch keyword  ve () :
            ArithmeticException :  olusma ihtimali olan Exception turudur
            e : karsilastigi exceptionu kaydedecegimiz objedir.(ArithmeticException classindan bir objedir)

        3- catch blogu 21-24 (21 haric)
           öngörülen exception gerceklestiginde calismasini istedigimiz kodlar



         */
    }
}
