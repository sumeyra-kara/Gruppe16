package selbstlernen.whileLoop_DoWhileLoop;

public class UsluSayi {
    public static void main(String[] args) {

        // üslü sayi sorusu--girilen sayiya kadar olan 2 nin kuvvetlerini yazdirin
        // baslangic olarak 1 den baslatilir kosul i<n n(girilecek sayi)
        // i = i*2 seklinde
        // for ile

        int i=1;
        int sayi=200;

        for (i=1; i <= sayi; i*=2){
            System.out.println(i);
        }

        System.out.println("-----");

        // while ile

        i=1; sayi=200;

        while (i<=sayi){

            System.out.println(i);
            i=i*2;

        }

    }
}
