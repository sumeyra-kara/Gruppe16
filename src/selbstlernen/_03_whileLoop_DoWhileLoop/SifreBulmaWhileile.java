package selbstlernen._03_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class SifreBulmaWhileile {
    public static void main(String[] args) {

        int password;
        boolean isPasswordSuccess = false;

        Scanner scanner = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.println("Sifre giriniz : ");
            password = scanner.nextInt();

            if (password == 123){
                System.out.println("dogru");
                isPasswordSuccess = true;
            } else {
                System.out.println("yanlis");
            }
        }

    }
}
