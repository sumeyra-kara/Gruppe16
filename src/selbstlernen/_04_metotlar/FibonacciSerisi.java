package selbstlernen._04_metotlar;

public class FibonacciSerisi {
    public static void main(String[] args) {

         // 1 1 2 3 5 8 13 21  bu gibi serilere denir
        // sayinin kendisi ile kendinden önceki sayinin toplamu bir sonraki sayi ise..
        //  f(n) = f(n-1) + f(n-2) formulu verilebilir

        System.out.println(fib(4));
    }
    static int fib (int n){

        if (n==1 || n==2) {
            return 1;
        }


       return fib(n-1) + fib(n-2);
    }


}
