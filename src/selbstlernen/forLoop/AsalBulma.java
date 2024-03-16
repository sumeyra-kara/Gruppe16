package selbstlernen.forLoop;

public class AsalBulma {
    public static void main(String[] args) {
        // başlangıç ve bitişi verilen aralıkltaki asal sayıları yazdıralım..

        int baslangic=2;
        int bitis = 57;
        boolean asalMi = true;

        for (int i=baslangic; i <=bitis; i++){              // 10
            for (int j = 1; j <i ; j++) {                   // 2  3  4 5
                if (i % j == 0){
                    asalMi=false;
                }
            }
            if (asalMi){
                System.out.println(i + " asal sayıdır");
            }
            asalMi =true;
        }
    }
}
