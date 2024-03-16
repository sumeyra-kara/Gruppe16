package tage.tag30;

public class Tasks3AsalSayi {

    public static void main(String[] args) {
        // prime number

        System.out.println(primeNumber(2));
    }

    public static boolean primeNumber (int number){

        if (number<=1){
            return false;
        }

        for (int i = 2; i < number ; i++) {
            if (number%i == 0){
                return false;
            }
        }
        return true;

    }

}
