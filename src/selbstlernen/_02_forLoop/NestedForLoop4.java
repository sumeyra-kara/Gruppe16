package selbstlernen._02_forLoop;

import java.util.Scanner;

public class NestedForLoop4 {
    public static void main(String[] args) {


        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        kullanicidan satir sayisini sekli cizdirme

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satir sayisi

            for (int j = 1; j <= i; j++) { // sutun sayisi satira bagli
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }





    }
}
