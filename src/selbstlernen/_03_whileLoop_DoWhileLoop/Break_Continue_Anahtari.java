package selbstlernen._03_whileLoop_DoWhileLoop;

public class Break_Continue_Anahtari {
    public static void main(String[] args) {
        // Break anahtari--fazla olarak dönmeden kurtarir gerektigi yerde

        int sayiyiBuldunMu;

        for (int i = 1; i <= 10 ; i++) {
           if (i == 5) {
               sayiyiBuldunMu = i;
               System.out.println(sayiyiBuldunMu);
               break; // donguyu kir. donguden cik
           }
        }
        System.out.println("hsgdsh");

        // continue anahtari--dönguyu sadece 1 kerye mahsus kirar.
        // 1 2 3 4 5 6 9 10 ( 7 8 yok) mesela ne yapilir?

        for (int i = 1; i <= 10 ; i++) {
            if (i == 7 || i == 8) {
                continue; // bu anahtar sadece bir kereye mahsus kirar.break hepsini calistrimazdi
            }
            System.out.println(i);
        }

        int k=1;
        while (k<=10) {
            k++;
            if (k%2==0){
                continue;
            }
            System.out.println(k);

        }




    }
}
