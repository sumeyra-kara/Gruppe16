package selbstlernen._06_stringManipulation;

public class Soru_Replaceall {

    // String fiyatta verilen fiyatlari toplayip sonucu yazdirin
    // input1: "15.30 €"   input2 : "11.40 €" output : "26.70 €"

    public static void main(String[] args) {
        String fiyat1 = "15.35 €";
        String fiyat2 = "11.40 €";

        fiyat1 = fiyat1.replaceAll("\\D", ""); // sayi haricindekileri temizledik iki fiyat icin de
        fiyat2 = fiyat2.replaceAll("\\D", ""); // 1140 yapar bu digeri de 1535 olur


        Double fyt1= Double.parseDouble(fiyat1);
        Double fyt2= Double.parseDouble(fiyat2);

        System.out.println((fyt2+fyt1)/100 + " €" );

    }



}
