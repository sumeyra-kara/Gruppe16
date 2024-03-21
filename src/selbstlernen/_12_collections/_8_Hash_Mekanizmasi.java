package selbstlernen._12_collections;

public class _8_Hash_Mekanizmasi {
    /*
    - Hashing teknigi girdi ne olursa olsun belirlenen yapidaki bir output uretme islemidir.
    - Hizli olmasi acisindan kullanilir
    - Universitelerdeki numara algoritmasi hashCode'a  iyi bir ornektir.
    - Bucket yapisi var. depolanir bu hashcode ve ihtiyac olduguna ona ulasilir

    - Bir HashCollection olusturuldugunda Java 16 Bucket olusturur ve elementleri bu Bucketl'lara yerlestirmeye baslar
    - Olusturulan bucket'larin %75 i doldugunda Java yeni 16 Bucket daha olusturur.Buna LOAD FACTOR denir.
    - her Obje icin Java bir HashCode uretir. Eger uretilen bu kod once uretilen bir hash Code ile ayni ise
      buna Hash Collision(Cakisma,Carpisma) denir

      Hash Collision gerceklestiginde cozum icin 2 yol var :
      1- LinkedList kullanmak
      2- Formulle belirlenen yeni bir hash kod üretmek


    **** HashSet, Set'lerin Childi olan bir classtir.
      - Hash mekanizmasindan dolayi hizlidir
      - Set oldugu icin de index yapisi yoktur,siralama yapmaz. elementler yazdirildiginda herhangi bir sirada gelebilir
      - Set oldugu icin bir degeri birden fazla girmemize izin vermez(dublication).
        Eger ayni element girildiyse eskisini silip yenisini yazdirir
        - Element olarak null degeri kabul eder ancak set oldugu icin birden fazla null ekleyemez
        - Index yapisini kullanmadigindan tum elementlere ulasmak icin for-each loop,
          degistirmek icin ise iterator kullanilabilir.







     */
}
