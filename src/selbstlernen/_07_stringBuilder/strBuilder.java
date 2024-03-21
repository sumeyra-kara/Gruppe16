package selbstlernen._07_stringBuilder;

public class strBuilder {
    public static void main(String[] args) {

        StringBuilder stb = new StringBuilder();
        stb.append("hallo liebe");
        System.out.println("original : " + stb); // hallo liebe
        System.out.println(stb.toString()); // hallo liebe
        stb.append(1);
        System.out.println(stb); // hallo liebe 1


        stb.reverse(); // stringii tersine ceviriyor
        System.out.println("umgekehrt : " + stb);

        System.out.println("Anzahl der Zeichen : " + stb.length()); // stringin uzunlugunu verir

        StringBuilder stb2 = new StringBuilder("java");
        System.out.println(stb2.toString());  // java
        System.out.println(stb2); //  java
        stb2.append(" güzel"); // append ile stb2 ye ekleme yapar
        System.out.println(stb2);

        StringBuilder stb3 = new StringBuilder("Welcome");
        stb3.insert(3,"java"); // insert methodu ile 3.karakter yerine o araya java kelimesini ekliyoruz
        System.out.println(stb3);


        StringBuilder stb4 = new StringBuilder("Simplilearn");
        stb4.replace(1,4,"java");
        System.out.println(stb4); // 1 ve 4 indeks arasina o harfler yerine javayi koy

        StringBuilder stb5 = new StringBuilder("Welcome");
        stb5.delete(2,5);
        System.out.println(stb5); // 2, 5 indekslerini siliyor

        StringBuilder stb6 = new StringBuilder("Simplilearn");
        System.out.println(stb6.charAt(5)); // indekslerinin ne oldugunu charat methodu ile bulabliriz

        StringBuilder stb7 = new StringBuilder();
        stb7.append("Simplilearn");
        System.out.println(stb7);
        System.out.println(stb7.indexOf("ile")); // indeksof ile o indeksiteki degerini bulabiliriz


        StringBuilder stb8 = new StringBuilder();
        stb8.append("Small String ");
        System.out.println(stb8);
        System.out.println(stb8.capacity()); // 16'dir-. mevcut  kapsite 16 karaktere kadar her zaman 16 dir.STANDART 16
        // 16 dan fazla ise 16*2+2 yani 34 e yukselir
        stb8.append("now becomes large");
        System.out.println(stb8.capacity()); // 34 tur bu sefer
        stb8.ensureCapacity(13); // 34 un ustunde olmadigi iicn degisiklikn olmaz 34 yine
        System.out.println(stb8.capacity()); // 34
        stb8.ensureCapacity(40); // burada artik degisiklik var o yuzden 34*2 +2
        System.out.println(stb8.capacity()); // 70 (34*2 +2)


    }
}
