package tage.tag30;

public class Tasks1 {

    public static void main(String[] args) {
        System.out.println(letzteZahlenParameter(17, 7));
    }

    public static boolean letzteZahlenParameter(int sayi1, int sayi2){

        if ((sayi1 % 10)==(sayi2 % 10)){
            return true;
        }else {
            return false;
        }
    }
}
