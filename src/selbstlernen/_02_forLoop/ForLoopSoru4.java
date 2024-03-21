package selbstlernen._02_forLoop;

import java.util.Scanner;

public class ForLoopSoru4 {

    public static void main(String[] args) {

        // kullanicidan sayi alalim. 1 den baslayarak o sayiya kadar tum sayilari yazdiralim
        // 3 ile bölunebilen sayi gelirse, sayi yerine fizz
        // 5 ile bölunebilen sayi gelirse, sayi yerine buzz
        // hem 3 hem de 5  ile bölunebilen sayi gelirse, sayi yerine fizzBuzz yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int sayi = scanner.nextInt();

        for (int i = 1; i <=sayi; i++) {

            if (i%3 == 0 && i % 5 ==0 ) {
                System.out.println("FizzBuzz");
            } else if (i%3==0){
                System.out.print("Fizz ");
            } else if (i%5==0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }



        }


    }
}
