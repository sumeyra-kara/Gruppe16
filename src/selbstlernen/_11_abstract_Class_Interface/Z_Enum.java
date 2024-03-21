package selbstlernen._11_abstract_Class_Interface;

public class Z_Enum {
    /* Sabit degerlerin oldugu bir grubu temsil eden özel bir siniflardir.
    - Bunlardan obje turetilemez. Baska siniftan mirasalamaz ama bir interface'i implement edebilirler.
    - Bir sinifin icerisinde de enumlar olusturulabilir buradaki gibi
    - Public static ve final olarak olusuyorlar.


     */

    enum Mevsimler {  // ILKBAHAR, YAZ, SONBAHAR, KIS
        ILKBAHAR, // bu sekilde virgulle ayrilmali
        // yanyana da yaziliyor
        YAZ,
        SONBAHAR,
        KIS // sonuna noktali virgul konulabilir eger istersen

    }

    public static void main(String[] args) {
       Mevsimler mevsim = Mevsimler.ILKBAHAR;
        System.out.println("mevsim : " + mevsim);


        for (Mevsimler mevsim1 : Mevsimler.values()){
            System.out.println(mevsim1);
        }
    }

}
