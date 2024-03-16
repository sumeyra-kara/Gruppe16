package calisma;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {

        int month,day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner (System.in);
        System.out.println("Dogdugunuz ay : ");
        month = input.nextInt();

        System.out.println("Dogdugunuz gün : ");
        day = input.nextInt();


        switch (month) {
            case 1:
                if (day >= 1 && day<=31) {
                    if (day < 22) {
                        burc = "Oglak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true ;
                }
                break;


            case 2 :
                if (day >= 1 && day<=28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balik";
                    }
                } else {
                    isError = true ;
                }
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.println("Hatali giris yaptiniz, tekrar deneyiniz");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
