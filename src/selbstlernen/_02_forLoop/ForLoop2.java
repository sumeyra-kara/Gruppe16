package selbstlernen._02_forLoop;

public class ForLoop2 {
    public static void main(String[] args) {

        // 60 ve 23 dahil olmak uzere 7 ile bolunebilen sayilari geriye dogru yazdirin
        for (int i =60; i>=23 ; i--){
            if (i%7==0){
                System.out.print(i + " ");
            }
        }
        System.out.println(""); // araya bosluk olsun diye ekledim

        // 3 basamakli pozitif tum tam sayilari toplayip sonucu yazdirin
        int toplam = 0;
        for (int i= 100; i<1000; i++){
            toplam+=i;
        }
        System.out.print(toplam + ""); // loop bittikten sonra yazdiriyouz
        System.out.println("");

        // -1000 ile +1000 arasindaki tum sayilarin toplamini bulunuz
        toplam=0;
        for (int i=-1000; i<=1000; i++){
            toplam+=i;
        }
        System.out.print(toplam+ ""); // 0 cikar




    }
}
