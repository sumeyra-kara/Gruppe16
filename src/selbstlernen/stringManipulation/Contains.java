package selbstlernen.stringManipulation;

public class Contains {
    public static void main(String[] args) {

        String str = "Java Candir";

        // adet gozetmeksizin bir stringte aranan metin var mi yok mu diye bakar
        // true veya false verir sonucu

        System.out.println(str.contains("a")); // true icerisinde a var
        System.out.println(str.contains("b")); // false
        System.out.println(str.contains("java")); // false cunku j buyuk olmaliydi
        System.out.println(str.contains("a C")); // true-- bu sekilde de bakabiluir

        System.out.println(str.contains(" ")); // bosluk var true
        System.out.println(str.contains("")); // true, hiclik her zaman vardir mesela j ie a arasi veya digerleri arasi



    }
}
