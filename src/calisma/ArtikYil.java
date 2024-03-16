package calisma;

public class ArtikYil {
    public static void main(String[] args) {
        // artik yil hesabi
        // 4 un tam kati olmali ve 100 e tam bölunmeyecek ama sadece 400 un katiysa o artik yil


        int yil = 1800;

        if ((yil%4==0) &&(yil%100 !=0) || ((yil&400)==0)){
            System.out.println("artik yildir");
        } else {
            System.out.println("artik yil degildir");
        }

    }
}
