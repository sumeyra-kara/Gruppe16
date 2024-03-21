package selbstlernen._13_exceptions;

public class _0_Exceptions_1 {

    /*
    - Istisna
    - Exception : Kod calisirken handle edilebilecek sorunlarla karsilasma durumunda java cözüm önerisi bekler.
      handle edilip kod calismya devam eder.
    - Bazi exception durumlarini If else ile cözülebilir ama bazen yeterli olmayabilir

    - handle : ustesinden gelmek
    - ama ongorulmeyen hata olsuursa exception olusur ve kod durur
    - Exception oldugunda buna karsi cözüm nedir? try / catch
    - Exception handle etmek icin genellikle try-catch-finally kullanilir.
    - Try catxh blogu : riskli kodlarin bulundugu ve ne yapilacaginin gosterildigi yer
        try : riskli kodlarin oldugu yer
        catch : icine exception turu ve e
        catch blogu : exception ile karsilastiginda ne yapilacagini ya da hangi kodun calisacagini belirler

     - 2 tur exception var :  Run-Time Exception (Unchecked) -- altini kirmizi cizer
                              Compile Exception (Checked)

    - Eger sorunla karsilastiginda cözüm üretilmemisse kodu,calismayi durdurur(stops execution)
     ve exception verir (throws exception)
     - Eger birden fazla exception ile karsilasiyorsak ;
        1. icice  try catch kullanilabilir
        2. bir tane try'e birden fazla catch baglayarak da kullanabiliriz(MULTIPLE CATCH)
           multiple catch kullanma durumunda parent catch ilisikine dikkat edilmeli.
           Bu durumda once child Exception yazilir, sonra parent yazilir.

     -  Bizim kontrulumuzde exception firlatirsak o zaman ne yapmaliyiz?

     java.lang----Object----Throwable------( 1.Errors 2.Exceptions )
     EXCEPTIONS -----IOExceptions
     1. Runtime Exceptions (Unchecked Exceptions) --- kod calisinca hata ortaya cikar
     2. Other Exceptions (checked Exceptions) ----kod yazarken ortaya cikan exceptionlar

    IOException :  Programimizda bir dosyaya input/output yapiliyorsa program calisirken bir problem cikarsa olusur.
    Checked exceptiondur ve kod yazilirken mutlaka handle edilmelidir.

     Asagidaki 5 taneyi bilmek yeterli:
    1. NullPointerException -- null olarak isaretlenmis bir String`i string methodlari ile kullanmak istersek ortaya cikar
    2. StringIndexOutOfBoundsException ----- String'de olmayan bir index kullanmak istedigimizde ortaya cikar
    3. ArrayIndexOutOfBoundsException ------- Array'de olmayan bir index'i kullanmk istedigimizde ortaya cikar
    4. NumberFormatException ------- Integer formatina uymayan durumlarda
    5. ClassCastException   -------  Uygun olmayan bir cast islemi yapmaya calistigimizda ortaya cikar

    6. FileNotFoundException : bir dosyayi okumaya calisirken dosya bulunamazsa olusur.IOException'un subclassidir.


     */

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 0;

        System.out.println(sayi1/sayi2); // ArithmeticException
        /*
        Bu hata gelir : Exception
        Exception in thread "main" java.lang.ArithmeticException: Create breakpoint : / by zero
	    at selbstlernen.exceptions.Exceptions_1.main(Exceptions_1.java:16)


         */
    }
}
