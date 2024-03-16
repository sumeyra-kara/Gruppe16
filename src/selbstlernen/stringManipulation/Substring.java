package selbstlernen.stringManipulation;

public class Substring {
    public static void main(String[] args) {
        // alt metin demek. iki farkli yontemle substring elde edilebilir

        String str ="Java Candir";
        // 1- tek parametre yazarsak

        System.out.println(str.substring(3)); // a Candir
        System.out.println(str.substring(0)); // metnin aynisi demektir
        System.out.println(str.substring(9)); // ir

        // son 3 karakteri yazdirin
        System.out.println(str.substring(8)); // ama dinamik degil cunku degisim olursa yanlis kod yazdirir
        // dinamik olmasi icin length kullanmaliyiz yani degisiklik oldugunda dogru degeri verir
        System.out.println(str.substring(str.length()-3));

        // System.out.println(str.substring(20)); boyle hata verir cunku o kadar karakter yok

        System.out.println(str.substring(str.length())); // bu sefer de bosluk verir ciktida
        // charAt de problem oluyor hata verir ama burada  bosluk cikar
        // System.out.println(str.substring(str.length()+1)); bu da hata verir

        // 2- iki parametre yazarsak ??

        System.out.println(str.substring(1,6)); // 1 den baslar 5 e kadar gider ama 6i almaz
        // ilk indeks dahil ikinci indeks dahil degildir
        System.out.println(str.substring(0,7));

        System.out.println(str.substring(1,2)); // a

        // 7.indeksteki karakteri yazdirin
        System.out.println(str.charAt(7)); // char ile bulabiliriz-- n
        System.out.println(str.substring(7,8)); // ayni sekilde substring ile bulabilirim --- n
        // aradaki fark char oldugu zaman yeni methot kullanilmaz. substringte string old.icin kullanilabilir

        System.out.println(str.substring(2,2)); // hiclik yani bosluk olur

        // System.out.println(str.substring(6,4)); ---- bu hata verir

        System.out.println(str.substring(0,str.length()-3)); // Java Can



    }
}
