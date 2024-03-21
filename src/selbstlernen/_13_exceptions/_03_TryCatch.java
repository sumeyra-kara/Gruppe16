package selbstlernen._13_exceptions;

public class _03_TryCatch {

    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=0;

        try {

            System.out.println("deneme1");
            System.out.println(sayi1/sayi2); // ArithmeticExceptionvardir--bundan sonrakileri de yazdirmaz catch'e gider
            System.out.println("deneme2");
            System.out.println("deneme3");

        } catch (ArithmeticException e) { // e olan seyin adi e olmak zorunda degildir
            System.out.println("Bolen 0 olmamali");
        }

        // Bir try blogunda exception olusursa o satirdan  catch satirina kadar aradaki tum kodlar ignore edilir
        // Eger try blogunda exception olusmazsa catch devreye girmez (if-else gibi)

    }
}
