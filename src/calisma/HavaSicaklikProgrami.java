package calisma;
import java.util.Scanner;
public class HavaSicaklikProgrami {
    public static void main(String[] args) {

        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsin");
        } else if (sicaklik>5 && sicaklik<=10) {
            System.out.println("sinemaya gidebilirsin");
        } else if (sicaklik>10 && sicaklik<15) {
            System.out.println("sinemaya gidebilirsin ya da piknige gidebilirsin");
        } else if (sicaklik>=15 && sicaklik<25) {
            System.out.println("Piknige gidebilirsin");
        } else if (sicaklik>25) {
            System.out.println("yuzmeye gidebilirsin");

        }

    }
}
