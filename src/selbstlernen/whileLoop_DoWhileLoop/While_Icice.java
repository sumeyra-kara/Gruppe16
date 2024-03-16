package selbstlernen.whileLoop_DoWhileLoop;

public class While_Icice {

    public static void main(String[] args) {

       int i= 1,k;

        System.out.println("program basladi");

        while (i<=5){
            System.out.println(i);
            k =1;
            while (k <= 10){
                System.out.print(k + " ");
                k++;
            }
            i++;
            System.out.println();
        }
        System.out.println("program bitti");

    }
}
