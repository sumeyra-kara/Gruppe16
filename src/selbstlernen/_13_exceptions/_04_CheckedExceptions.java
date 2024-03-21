package selbstlernen._13_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         - Checked exceptions kod yazilir yazilmaz , daha run etmeden javanin riskli kodlari tanimlayaip
           calistirmadan önce bana bir yol göstermelisin deidigi exception turleridir.

         - Checked Exceptions genelde dosya okuma ve yazma IO islemlerinde olusur

         - IO exception olusma ihtimaline karsi kodu yazar yazmaz Java altini kirmizi cizer

         - Checked exception kodun altini kirmizi cizdiginden kodumuzu calisir hale gelmesi icin
           kirmizi cizgiyi kaldirmmaiz lazim:

         1. try-catch blogu kullanarak exception handle edilebilir ve
            Java'ya exception olustugunda ne yapmasini istedigimiz gosterilebilir

         2. Eger Exception'i handel etmek istemiyorsak sadece kodun calismasini istiyorsak
            method deklarasyonuna bu exception ihtimalini yazarak kodu calisir hale getirebiliriz
            method signatura'na throws keywordu ile beklenen exception turunu yazarsak kod calisir hale gelir
            ancak Exception olusursa javaya cözüm yolu sunmadigimizdan kod durur yani Exception verir hala.

            (Unchecked exceptionlar icin sadece try-catch cozumu vardir, throws yoktur bunlarda)


         */


        String dosyaYolu = "src/selbstlernen/exceptions/text.txt";

        FileInputStream fis =  new FileInputStream(dosyaYolu);


    }
}
