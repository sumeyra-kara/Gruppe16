package selbstlernen._04_metotlar;

public class Method_voidOlusturma {

    public static void main(String[] args) {

     //input olrak verilen isim,soyisim ve kredi karti bilgilerini belirten formatta yazdiran method olusturun
     // isim: Fur*** Bah**
     // kart no = **** **** **** 5643
    krediKartiBilgisiYazdir("ALI CAN", "KAVAKLIGIL", "123456787895643");

    }

    public static void krediKartiBilgisiYazdir (String isim, String soyisim, String krediKartNo) {

        System.out.println(
                "isim : " +
                isim.substring(0,1).toUpperCase() + isim.substring(1,3).toLowerCase()
                        +isim.substring(3)     .replaceAll("\\w","*")  +
                        " " +
                soyisim.substring(0,1).toUpperCase() + soyisim.substring(1,3).toLowerCase()
                        +soyisim.substring(3).replaceAll("\\w","*") +

                        "\nkart no : " +
                        "**** **** **** " + krediKartNo.substring(krediKartNo.length()-4)
        );
    }


}
