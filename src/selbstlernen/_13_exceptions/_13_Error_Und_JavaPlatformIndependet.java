package selbstlernen._13_exceptions;

public class _13_Error_Und_JavaPlatformIndependet {

    /*
    - Error class’i Throwable class;inin child class’idir.
    - Error sistemsel sebeplerle ortaya cikan beklenmedik durumdur ve handle edilemez.

    - Error’lar onceden ongorulemezler, RunTime’da olusurlar yani Unchecked’dirler.
    - Error olustugunda program durdurulur, exception gibi handle edilemediginden
      data kayiplari olmasinin onune gecilemez.

    - Error’lara ornek olarak OutOfMemoryError, StackOverFlowError veya SystemCrashError hatalarini verebiliriz.
    OutOfMemoryError : hafiza bitti
    StackOverFlowError :
    SystemCrashError : sistem coktu

    - Bir hata düzeltilemez. Cözüm yolu yoktur.
    - Hata, sistem kaynaklarinin eksikliginden kaynaklanir.
    - Error olusursa hata umulmadik sekilde sonlandirilir.
    - denetlenemeyen yani unchecked tur olarak siniflandirilir
    - java.lan.Error paketi altindadir( Exceptionlar :  java.lang.Exception altindadir)

     */

    /*  ++++++++  Java - Platform Independent  *++++++++++++++

    Platform independent (platformdan bagimsiz) calisma, yazilan kodun her platformda calismasi demektir.

    Hangi programlama dilini kullanirsak kullanalim, bizim icin anlamli for-loop, if-else, method,class.. gibi
    kelimeler kullaniriz

    Bu kelimelerin bilgisayar tarafindan anlasilabilmesi icin bir compiler tarafindan makine diline(byte code)
    cevrilmesi gerekir.

    Java’da, Javac (Java programming language compiler)yazdigimiz kodlari .class uzantili byte kodlara cevirir.

    Javac tarafindan byte kodlara cevrilen bu kodlar JVM ( Java Virtual Machine) tarafindan her turlu platformda calistirilir.

    Boylece Java’da herhangi bir platformda yazilan kodlar tum platforlarda calistirilabilir.


     */
}
