package tage.tag20;

public class SelbstLernen {
    public static void main(String[] args) {

        int a=15,b=12,c=10;

        int max = (a>b && a>c) ? a : b > c ? b : c;
        System.out.println(max);

        //--------------------------

        char harf = 'C';

        String result = harf == 'P' ? "Pazartesi,Pazar,Persembe" : harf=='S' ? "Sali" : harf=='C' ? "Cuma,Cumartesi,Carsamba" : "Gecersiz harf";

        System.out.println(result);





    }
}
