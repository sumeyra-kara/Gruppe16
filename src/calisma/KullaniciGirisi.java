package calisma;
import java.util.Scanner;
import java.util.SortedMap;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici adiniz : ");
        userName = inp.nextLine();

        System.out.println("Sifreniz : ");
        password = inp.nextLine();

        if (userName.matches("patika") && password.matches("java123")) {
            System.out.println("Giris yaptiniz");
        } else {
            System.out.println("bilgileriniz yanlis");
        }



    }
}
