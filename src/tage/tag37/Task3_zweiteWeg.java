package tage.tag37;

import java.util.Random;

public class Task3_zweiteWeg {


    public static void main(String[] args) {

        // ohne scanner


        int nummer;
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
