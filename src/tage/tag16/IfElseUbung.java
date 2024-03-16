package tage.tag16;

public class IfElseUbung {
    public static void main(String[] args) {

       double balance = 120;
       int score = 8;

       if (score>=8) { // true 120+50---170
           balance = balance + 50;
       }
        if (score>6) { // true 170 +20 ---190
            balance = balance + 20;
        } else {
            balance = balance -10;
        }
        System.out.println(balance);
    }
}
