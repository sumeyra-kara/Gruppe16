package calisma2;

public class _3_Beispiel {


    public static void main(String[] args) {
        long sayi = 992l;
        System.out.println("sayimiz = " + sayi);
        System.out.println(topla(sayi));

    }

    public static long topla (long number){

        while (number>=10){

            int summe = 0;
            while (number>0){

                summe+=number%10;
                number/=10;
            }
            number=summe;
        }

        return number;
    }
}
