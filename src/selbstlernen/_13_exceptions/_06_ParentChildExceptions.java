package selbstlernen._13_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _06_ParentChildExceptions {

     /*
        Eger kodumuzda birden fazla exception ihtimali varsa ve bu exceptionlar arasinda parent child iliskisi varsa;
        ya sadece parent'i yazariz, Cunku parent Exception,child exceptionlari da kapsar.
        ya da ikisini de yazmak istiyorsak once child exceptionu sonra parent exception'u yazmaliyiz

         */

    public static void main(String[] args) {


        String dosyaYolu = "src/selbstlernen/exceptions/text.txt";

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k = fis.read()) !=(-1)){ // bu .read ile söylenen dosyaya gidiyor ve ilk harfi karakteri alip geliyor
                System.out.println((char) k); // ilk karakter bos degilse yazdiriyor
            }

        } catch (FileNotFoundException e) { // child class von IOException


        } catch (IOException e) { // parent class

        }



    }
}
