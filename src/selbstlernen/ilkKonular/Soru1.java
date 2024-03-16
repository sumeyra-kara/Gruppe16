package selbstlernen.ilkKonular;

public class Soru1 {
    public static void main(String[] args) {

        /* Given 2 positive int values, return the larger value that is
        in the range 10..20 inclusive, or return 0 if neither is in that range.
        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11
         */
        int sayi1=100;
        int sayi2=8;

        if (((sayi1>=10) && (sayi1<=20)) && ((sayi2>=10) && (sayi2<=20))){
            if (sayi1>sayi2){
                System.out.println(sayi1);
            } else {
                System.out.println(sayi2);
            }
        } else if (((sayi1>=10) && (sayi1<=20)) || ((sayi2>=10) && (sayi2<=20))){
            if ((sayi1>=10) && (sayi1<=20)){
                System.out.println(sayi1);
            } else {
                System.out.println(sayi2);
            }
        } else {
            System.out.println("null");
        }

    }
}
