package selbstlernen._02_forLoop;

import java.util.Scanner;

public class NestedForLoop3 {
    public static void main(String[] args) {

        // dikdortgen tarzi icin kural 2 for yapisidir
        /*
        kullanicidan satir ve sutun sayisini alip tabloyu olusturun

        * * * * *
        * * * * *
        * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scanner.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { // satir

            for (int j = 1; j <=sutun; j++) { // sutun
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
