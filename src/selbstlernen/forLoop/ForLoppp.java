package selbstlernen.forLoop;

public class ForLoppp {
    public static void main(String[] args) {

        for (int i = 1; i <=6 ; i++) { // satir sayisi

            for (int j = 1; j <=6; j++) { // sutun sayisi satira bagli
                System.out.print(1 +" ");
            }
            System.out.println(" ");
        }
        System.out.println("--");

        for (int i = 1; i <=6 ; i++) { // satir sayisi

            for (int j = 7-i; j >=1; j--) { // sutun sayisi satira bagli
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
