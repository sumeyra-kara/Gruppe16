package selbstlernen.forLoop;

public class SoruLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        int baslangic = 17;
        int bitis = 987;
        int i, toplam = 0;


        for (i = baslangic; i <= bitis; i++) {
            toplam += i;
        }

        System.out.println(toplam + "");

    }

}