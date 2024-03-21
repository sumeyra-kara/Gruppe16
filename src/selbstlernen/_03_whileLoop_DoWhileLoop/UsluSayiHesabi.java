package selbstlernen._03_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class UsluSayiHesabi {

    public static void main(String[] args) {
        //alttaki sayi n,ustteki k..

        int n,k;
        Scanner scanner= new Scanner(System.in);
        System.out.println("ustu alinacak sayi : ");
        n = scanner.nextInt();
        System.out.println("us olacak sayi : ");
        k = scanner.nextInt();

        // while ile yapalim

        int i=1;
        int total = 1;

        while (i<= k){
            total*=n;
            i++;
        }
        System.out.println("cevap :" +  total);
        System.out.println("----");

        // for ile

        i=1;
        total=1;
        for (i = 1; i <=k ; i++) {
            total*=n;
        }

        System.out.println(total);


    }
}
