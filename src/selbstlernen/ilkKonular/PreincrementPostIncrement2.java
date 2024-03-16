package selbstlernen.ilkKonular;

public class PreincrementPostIncrement2 {

    public static void main(String[] args) {

        int sayi =10;
        sayi++;
        System.out.println(sayi); //11

        ++sayi;
        System.out.println(sayi); //12


        System.out.println(sayi++);// 12 (once sayiyi atiyoruz sonuc bu yani 12 yi)
                                    // sonra sayiyi 1 arttiriyoruz
        System.out.println(sayi); //13 (arttirdik 13 oldu)


        System.out.println(++sayi); // sayimiz yukarida 13tu. once arttir sonra ata.14u atiyoruz
        System.out.println(sayi); // 14 sayiyi arttirmistik



    }
}
