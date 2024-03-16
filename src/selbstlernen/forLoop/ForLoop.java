package selbstlernen.forLoop;

public class ForLoop {

    public static void main(String[] args) {

        // for loop baslangic ve bitis degerleri bilem veya tekrar sayisi belli olan islemeri yapar
        // println veya print-- yan yana yazdirmak icin print

        //  örnek---10'dan baslayip 30'a kadar olan sayilari yan yana yadiralim

        for (int i= 10 ; i<30; i++ ) {
            System.out.print(i +" ");
        }
        System.out.println(""); // asagi satira insin diye bos yazdirdim

        // 1 den 100"e kadar sayilarin toplami
        int toplam = 0;
        for (int i = 1; i <=100; i++){
            toplam +=i;
        }
        System.out.println(toplam);

        // faktoriyel olarak bulma
        int sayi=6;
        long faktoriyel=1; // 0 degiil baslangic olarak 1 almaliyiz cunku 0 ile carparsak 0 olur
        for (int i =1; i<=sayi; i=i+1 ){
            faktoriyel = faktoriyel *= i;
        }
        System.out.println(faktoriyel); // bu yazdirma islemini foor loopun icine yazrsak yanlis olur.baska sey yazar


        // iki basamakli tek sayilari yan yana yazdiralim
        for (int i = 11; i <= 99 ; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // 2.yol
        // baslangic ve bitis degerlerini bilmiyorsak da once 2 basamakli tum sayilari elden geciririz
        for (int i = 10 ; i <100; i++){
            if (i% 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        // 752 ve 1326 dahil aralarinda 19 ile bölunebilen sayilari bulun
        for (int i = 752; i <=1326 ; i++){
            if (i%19==0){
                System.out.print(i + " ");
            }
        }









    }
}
