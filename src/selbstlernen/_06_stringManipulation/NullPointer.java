package selbstlernen._06_stringManipulation;

public class NullPointer {
    public static void main(String[] args) {


        String str;
        // System.out.println(str); bir variable ye deger atamadan kullanamayiz, hata verir
        // null özel bir keywiord
        // deger yok ama varmis gibi gorunuyor. sadece isaretcidir.deger atamasi yoktur

        String str2 =""; // hiclik atadik,konsolda bisey gozukmez   atanir ama bazen sikinti verir.ayrica baska data turlerinde hiclik atama sansi olmaz
        System.out.println("str2'nin degeri :" + str2+ "----");
        System.out.println("str2'nin uzunlugu : " + str2.length()); // o verir
        // bunlar iyi cozum degil

        // null pointer java tarafindan ozel bir gorev ile olusturulmustur
        // bir variable nin deger atanmamis oldugunu isaretler
        // null bir deger degil isaretcidir

        String str3 = null ;
        System.out.println(str3); // null--str3 'e null degeri atanmis cumlesi yanlis
        // str3 null olarak isaretlenmis yani deger atanmamistir
        // variable var, Deger YOK
        // sadece non primitivelerde gecerlidir

        System.out.println(str3 + "java"); //nullJava
        // null olarak isaretlenen variablelar sadece yazdirilabilir
        // deger atamadan baska islem yapmak istersen NullPointerException verir yani bize kirmizili yazi verir ikaz icin

        // System.out.println(str3.length()); // hata nullPointerException--deger atanmadan uzunlugu bulunmaz
        // System.out.println(str3.concat("java")); // olmaz yazdiramayiz nullPointerException
        // concat ile olmaz ama + ile yazilabiliyor

        String str4 = "123";
        System.out.println( Integer.parseInt(str4) + 5); // 128





    }
}
