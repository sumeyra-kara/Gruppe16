package selbstlernen.forLoop;

import java.util.Scanner;

public class ForLoopSoru3 {
    public static void main(String[] args) {

        int sayi=10;

        int carpim = 1;
        int i;

        for (i = 1; i<=sayi; i++) {
            carpim*=i;
        }
        System.out.print(i-1+ "!" + " = ");
        for ( i= sayi; i>1; i--){

           System.out.print(i + " * ");
        }
        System.out.print( i);
        System.out.println(" = " + carpim);

    }
}
