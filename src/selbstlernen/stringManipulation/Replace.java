package selbstlernen.stringManipulation;

public class Replace {
    public static void main(String[] args) {

        // metin veya char icin degistirme islemi yapiyoruz
        // degisecek veya degistirecek string ayni uzunlukta olmak zorunda degil
        // degisecek string'i  tamamen silmek istoyorsak yeni degeri hiclik "" secmelyiz

        String str = "Hava Candir.";
        System.out.println(str.replace("H","J")); // H buyuk harf degil de kucuk olsaydi degismezdi
        // H yerine J yapmasini istiyorum yani

        System.out.println(str); // bu her zaman ayni hava candir olarak kalir

        System.out.println(str.replace("Hava", "Java").replace(".",""));
        // bu sekilde art arda da replace yapilabilir

        System.out.println(str.replace("a","A")); // butun kucuk a lari buyuk a yapiyor
        System.out.println(str.replaceFirst("a","A")); // sadece ilk a harfini buyuk a yapiyor

        // boslugu yok etmek ne yapilir?
        System.out.println(str.replace(" ",""));

        String str2 = "Ali Uzunkavaklioglu";

        System.out.println(str2.replace('a', 'A')); // bu sekilde char olarak da kullanilabilir
        System.out.println(str2.replace("a","ask")); // tek harf yerine uc harf de konulabilir

        // REPLACEALL - tek harfleri rakamlari degil, tum harfler veya tum rakamlarda islem yapacagimizda kullanilir

        String str3= "Ja13 va627 Ca782n dir12"; // mesela biz sadece harfleri gormek istersek ne yapacagiz

        /*
        Regex yani Regular Expressions kurallari vardir
        \\s : space istemiyorsak             \\S : space disindakileri istemiyorsak
        \\s+ : birden fazla spacei yok eder
        \\d : digit yani sayi istemiyorsak   \\D : sayi disindakileri istemiyorsak
        \\w : harf,rakam ve _ istemiyorsak   \\W : harf,rakam ve _ disindakileri istemiyorsak
         */




    }
}
