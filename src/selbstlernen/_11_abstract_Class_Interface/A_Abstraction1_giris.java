package selbstlernen._11_abstract_Class_Interface;

public class A_Abstraction1_giris {


    // Abstraction (Soyutluk) parent class'lara child class'lara child classs'lar icin
    // kural koyabilme yetenegi saglar. Bu mecburyet degil, kolaylik icin kullanilir.
    // Eger bir class child class'larinda MUTLAKA OLMASI gereken methodlari belirlemek istiyorsa abstraction kullanilir
    // OBJE OLUSTURMAYACAK class'lar icin Java'nin urettigi bir CÖZÜMDÜR
    // bazi classlar obje olusturmak icin degil, objeleri gruba ayirmak ve genel özelk. belirlemek icin olusturulur

    /*
    Java'da abstraction kullanabilecegimiz 2 yapi vardir :
    1. Abstract Classes (Partial abstraction)--Kismi soyutluk. Mutlaka uyulmasi gerekenler de oluyor
    bize de birakilanlar da oluyor.
    2. Interfaces (Full abstraction) mutlaka uyulmasi gerekenler
     */

    /*
    Abstract Class'lar Abstract methodun olusturulmasina izin verir.
    Abstract Method MUTALAKA child class'lar tarafindan override edileceginden,method bodysine ihtiyac YOKTUR!
    Yani abstract method, ne yapilmasi gerektigini belirler ama nasil yapilmasi gerektigini, child class'da
    override edecek methoda birakir.
    Tüm class'lar icin sabit olan bilgileri static final (mesela sirket ismi gibi),
    opsiyonal bilgileri instance variable yapiyoruz. (calisan gruplar).

    KURALLAR :
    1. Abstract olmayan(concret) bir child class, parent'i olan abstract class'lardaki tüm abstract methodlari
    IMPLEMENT etmelidir yoksa CTE olusur.

    2. Abstract bir class'in abstract bir child class'i olursa burada class'lardaki method'lari  implement
    etmek zorunda degildir.

    3. Bir class'i ya da method'u abstract yapmak icin ABSTRACT yazmak yeterlidir.
    4. Abstract class'lar constructor'a sahiptir,ancak abstract class'lardan OBJE ÜRETILEMEZ!!!
    (can not be instantiaed)

    5. Abstract bir method'un BODY'sine ihtiyac yoktur cunku child class'lar tarafindan mutlaka override edilecektir.
    Abstract bir method'a body yazmaya calisirsak veya concret bir methodu body'siz yazmaya
    calisirsak java CTE verir.

    6. Abstract bir class, abstract olmayan(concret) methodlara sahip olabilir (ama TERSI MUMKUN DEGIL!).
    Bu abstract class icindeki concret methodlar ise override edilmek zorunda degil.(opsiyonel)

    7. Bir method abstract ve static keyword'lere ayni anda sahip olamaz. cunku static demek baska yerlerden de
    kullanilsin demek ama abstract'in body'si yok ki nasil kullanilacak. Bu yuzden birlikte olamaz.

    8. Abstract methodlar override edilmek icin kullanildiklarindan FINAL olarak tanimlanamazlar. Cunku final dersek
    artik degistirilemez ama biz abstract methotlari override icin kullaniyoruz.



     */



}
