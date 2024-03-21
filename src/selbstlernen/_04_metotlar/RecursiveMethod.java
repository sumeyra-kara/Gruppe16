package selbstlernen._04_metotlar;

public class RecursiveMethod {
    /*
    static int f (int x){
        int toplam= 0;
        for (int i = 1; i <=10 ; i++) {
            toplam+=i;
        }
        return toplam;
    }
     */

    static int r (int x) {
        if (x==1){
            return 1;
        }

        return r(x-1) + x;
    }

    public static void main(String[] args) {
        // Recursive yani ozyinelemeli methodlar, kendini bir daha cagiran methodlardir
        // f(1)= 1  f(2)=f(1)+2 ..... f(n)= f(n-1)+n
        //

        System.out.println(r(10));
    }

}
