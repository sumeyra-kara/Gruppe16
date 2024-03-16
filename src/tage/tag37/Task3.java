package tage.tag37;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl zwichen 0 und 100 ein");
        int nummer = scanner.nextInt();
        int versuch=0;


        Random random = new Random();

        while (true){

            nummer = random.nextInt(100);
            versuch++;


            if (nummer<90){
                System.out.println(versuch + ". Randomzahl ist : " + nummer);

            } else {
                System.out.println(versuch+ ". Randomzahl ist " + nummer +  ". Du musst STOP machen");
                break;
            }

        }

    }





}
