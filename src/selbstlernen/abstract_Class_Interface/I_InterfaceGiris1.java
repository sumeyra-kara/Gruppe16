package selbstlernen.abstract_Class_Interface;

public interface I_InterfaceGiris1 {

    /*
    Interface'de tum variable'ler yazilmasa bile public,static ve final'dir.
    - Final oldugu icin sonradan degistirme imkani yoktur. Olusturulurken deger atanmalidir.
    Bu özellikler standart olarak tüm variabla'lere tanimlandiginden,bu tanimlamalari yapmak gerekli degildir
    (Intellij gri yapar)

    -Tum methodlar da public ve abstract'tir.(Yazilmasa bile)


     */

    static int sayi =10;
    final String str="Java Candir";
    public static final boolean b =true;

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoriyel();

    // tum methodlar yazilmasa bile public ve abstract'tir.


}
