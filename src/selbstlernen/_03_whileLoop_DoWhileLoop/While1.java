package selbstlernen._03_whileLoop_DoWhileLoop;

public class While1 {
    public static void main(String[] args) {

        int left = 100, right=200;

        while (++left < --right); // 100 ile 200 arasindaki tam ortada bulunan sayiyi buluruz
        // while ( ++left < --right) {   }   ile aynidir icinde bir sey yoksa noktali virgul kullanabiliriz
        // döngülerin icerigi olmak zorunda degil yani

        System.out.println(left);
    }
}
