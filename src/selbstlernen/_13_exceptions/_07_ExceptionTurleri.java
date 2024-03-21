package selbstlernen._13_exceptions;

public class _07_ExceptionTurleri {
    /*
    Asagidaki 5 taneyi bilmek yeterli:
    1. NullPointerException -- null olarak isaretlenmis bir String`i string methodlari ile kullanmak istersek ortaya cikar
    2. StringIndexOutOfBoundsException ------String'de olmayan bir index kullanmak istedigimizde ortaya cikar
    3. ArrayIndexOutOfBoundsException ------- Array'de olmayan bir index'i kullanmk istedigimizde ortaya cikar
    4. NumberFormatException --------  Integer formatina uymayan durumlarda
    5. ClassCastException  ------  Uygun olmayan bir cast islemi yapmaya calistigimizda ortaya cikar

    6. FileNotFoundException : bir dosyayi okumaya calisirken dosya bulunamazsa olusur.IOException'un subclassidir.
    7.IOException :  Programimizda bir dosyaya input/output yapiliyorsa program calisirken bir problem cikarsa olusur.
    Checked exceptiondur ve kod yazilirken mutlaka handle edilmelidir.
    8.ArithmeticException


     */

    public static void main(String[] args) {

        String str= null;
        System.out.println(str); // null
        //System.out.println(str.concat("Java")); --- NullPointerException
        // null olarak isaretlenmis bir String`i string methodlari ile kullanmak istersek ortaya cikar


        String str2 = "java";
        // System.out.println(str2.charAt(6)); ---- StringIndexOutOfBoundsException
        // String'de olmayan bir index kullanmak istedigimizde ortaya cikar


        int[] arr = {1,2,2,3};
        // System.out.println(arr[8]); --- ArrayIndexOutOfBoundsException
        // Array'de olmayan bir index'i kullanmk istedigimizde ortaya cikar



        String str3 = "34";
        String str4 = "35a";
        // String olarak verilen sayilarin toplamini yazdiralim

        // Str4=35 olsaydi --- System.out.println(Integer.parseInt(str3)+Integer.parseInt(str4)); //69

        // Eger yanlislikla str4 ="35a"; olsa;
        // System.out.println(Integer.parseInt(str3)+Integer.parseInt(str4));---- NumberFormatException



        String str5 = "Java Zordur";
        Object obj = str5;
        // Integer a = str5; bunu kabul etmiyor
        // Integer a = (Integer) obj; ---- ClassCastException
        // ClassCastException : Uygun olmayan bir cast islemi yapmaya calistigimizda ortaya cikar


    }
}
