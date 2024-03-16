package selbstlernen.metotlar;

public class ReturnType_MethodOlusturma {
    public static void main(String[] args) {

       // verilen isim ve soyismi istenen formata cevirip bize döndüren bir method olusturun
        // örnek output : A***** B********
        // döndurmek olunca return oluyor

        System.out.println(ismiIstenenFormataCevir("sümeyra", "kara"));

        // isim ve soyisim degerini main methodttan alip method a gönderiyoruz. sonra onlar calisiyor
        //sonuc olarak bir seye dönusup donusmus ismi tekrar geri main methoduna gönderiyor
        // yazdirin deseydi void kullanacaktik

    }

    public static String ismiIstenenFormataCevir (String isim, String soyisim) {

        String donusmusIsim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*") + " " +
                soyisim.substring(0, 1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");

        return donusmusIsim; // buradan snrasini java görmez.break gibidir.
        //returndan sonra bir sey yazarsa okumaz cunku burya gelmez basa döner
    }
}
