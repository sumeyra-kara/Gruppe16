package tage.tag35;

import java.util.Scanner;

public class PinTest {
    public static void main(String[] args) {

        pinEingabe();


    }


    public static void pinEingabe()
    {
        Scanner pinInput = new Scanner(System.in);

        int x = 0;
        System.out.println("Gib 4 PIN Ziffern ein ein");

        int pin1 = pinInput.nextInt();
        int pin2 = pinInput.nextInt();
        int pin3 = pinInput.nextInt();
        int pin4 = pinInput.nextInt();

        System.out.println("Mein PIN IST     : " + pin1 + "" + pin2 + "" + pin3 + "" + pin4);
        System.out.println("Simme der Ziffern: " + (pin1 + pin2 + pin3 + pin4));


        /*while(x<4)
        {
            System.out.println("gib eine neue Zahl ein:");
            //System.out.println(pinInput.nextInt());
            int temp1 = pinInput.nextInt();
            //System.out.println("Die Zahl ist: " + pinInput.nextInt());
           // System.out.println(pinInput.nextInt());
            x++;
        }*/



    }
}
