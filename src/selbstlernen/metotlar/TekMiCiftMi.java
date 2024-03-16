package selbstlernen.metotlar;

public class TekMiCiftMi {
    public static void main(String[] args) {

        System.out.println(SayiBulma(22));
    }
    public static String SayiBulma (int sayi){

        if (sayi%2 == 0){
            return "Cift";
        } else {
            return "tek";
        }
    }
}
