package selbstlernen._06_stringManipulation;

public class LastIndexOf {
    public static void main(String[] args) {

        String str = "Bu Java ogrenilecek";

        // e nin ilk kullaniminin indeksini yazdirin
        System.out.println(str.indexOf("e"));
        // e nin son kullaniminin indeksini yazdirin
        System.out.println(str.lastIndexOf("e"));

        // u'nun ilk kullanim ve son kullanim indeksini bulalim
        System.out.println(str.indexOf("u")); // ilk kullaniminin indeksi 1
        System.out.println(str.lastIndexOf("u")); //  son kullaniminin indeksi 1 yine
        // eger ayni ise demekki tek u harfi verdir

        // j harfinin metinde hic kullanilmadigini veya sadece bir kere kullanildigini yazdirin

        if ((str.indexOf("J") == str.lastIndexOf("J"))) {
            System.out.println("j harfi bir kez kullanildi");
        } else if (str.indexOf('J')== -1){
            System.out.println("j hic yok");
        }

        System.out.println(str.lastIndexOf("e", 15)); // 15 tan sonraki lastindexi istiyor yine 15 olur.
        System.out.println(str.lastIndexOf("e", 14)); // 14 ten geriye geriye ilk e 11.sirada


        // olmayan index yine -1 i verir
        System.out.println(str.lastIndexOf("x"));
    }
}
