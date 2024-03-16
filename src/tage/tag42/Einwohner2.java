package tage.tag42;

import java.util.Arrays;
import java.util.Scanner;

public class Einwohner2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("gib mir den Bevölkerungszahl für die Städte");
        int[] bevölkerungsZahl = new int[8];

        for (int i = 0; i < bevölkerungsZahl.length; i++) {
            bevölkerungsZahl[i]=scanner.nextInt();
        }

        System.out.println("Tag 0 : " + Arrays.toString(bevölkerungsZahl));

        int tag = 1;

        while (!ausgelöscht(bevölkerungsZahl)){
            for (int j = 0; j <bevölkerungsZahl.length ; j++) {
                bevölkerungsZahl[j]/=2;
            }
            System.out.println("Tag " + tag + " :  " + Arrays.toString(bevölkerungsZahl));
            tag++;
        }
        System.out.println("-----Ausgelöscht-------");
    }

    public static boolean ausgelöscht(int[] städte){
        for (int j : städte) {
            if (j > 0) {
                return false;
            }
        }
        return true;
    }
}
