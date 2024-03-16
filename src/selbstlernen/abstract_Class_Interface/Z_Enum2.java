package selbstlernen.abstract_Class_Interface;

public class Z_Enum2 {

    String isim, soyisim;
    int yas;
    Z_Enum3_Color renk;

    public Z_Enum2(String isim, String soyisim, int yas, Z_Enum3_Color renk) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.renk = renk;
        System.out.println("isim : " + isim);
        System.out.println("soyisim : " + soyisim);
        System.out.println("yas : " + yas);
        System.out.println("renk : " + renk);
    }

    static class Test {

        public static void main(String[] args) {
            Z_Enum2 ogrenci1 = new Z_Enum2("Ayse", "Yildiz", 12, Z_Enum3_Color.KIRMIZI);
            Z_Enum2 ogrenci2 = new Z_Enum2("Asli", "Kemal", 15, Z_Enum3_Color.MOR);

            Z_Enum3_Color renk = Z_Enum3_Color.SIYAH;
            System.out.println(renk);

            switch (renk) {
                case MOR:
                    System.out.println("renk dogru");
                    break;
                case KIRMIZI:
                    System.out.println("renk dogru");
                    break;
                case SARI:
                    System.out.println("renk dogru");
                    break;
                default:
                    System.out.println("gecersiz renk");
            }

        }

    }
}

