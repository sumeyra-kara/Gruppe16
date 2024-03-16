package tage.tag26;

public class Break_Continue {
    public static void main(String[] args) {

        // break olunca o sayi ve o sayidan sonrakileri almiyor
        for (int i = 1; i <= 50; i++) {
            if (i==13){
                break;
            }
            System.out.println(i);
        }

        System.out.println("---");
        // continue olunca sadece o sayiya mahsus yazdirmiyor kiriyor.bir kerelik,
        // continue unterbricht die derzeitige Iteration wahrend break aus der loop spring

        for (int i = 1; i <= 50; i++) {
            if (i==13){
                continue;
            }
            System.out.println(i);
        }

    }
}
