package selbstlernen.forLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        //  1 2 3 4 yazdirin loop ile

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // loop ile 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println("");

        // loop ile 3 6 9 12 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
        }
        System.out.println("");

        /* for loop ile  1 2 3 4
                         2 4 6 8
                         3 6 9 12 yazdirin
           Eger yazdirmamiz istenen sekil dikdortgen biciminde ise  ic ice iki loop olusturmaliyiz
           disaridaki looop satirlari kontrol eder(bu soruda 3 satir var)
           icerideki loop ise her satirdaki sutunlari kontrol eder (bu soruda 4 sutun var)


               */

        for (int i = 1; i <= 3; i++) { // satirlari

            for (int j = 1; j <=4 ; j++) { // satirdaki sütunlari
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }






    }
}
