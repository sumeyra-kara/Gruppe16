package selbstlernen.metotlar;

public class DolarKuru {
    public static void main(String[] args) {

        // SORU 1 : Dolar Kuru

        System.out.println(convertDollarToTl(20, 30.15));

        System.out.println(sayiToplami(15, 43));

    }
    public static double convertDollarToTl (double amountOfDollar, double dolarKurOrani){
                                        //         kac dolar var           dolar kuru mesela 30.15 olsun
        return amountOfDollar* dolarKurOrani;
    }

    // SORU 2: belirli aralikta sayi toplami

    public static int sayiToplami (int a, int b){
        int toplam = 0;
        for (int i = a; i <=b ; i++) {
            toplam+=i;

        }


        return toplam;
    }
}
