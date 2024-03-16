package tage.tag11;

public class Geschwindigkeit {

    public static void main(String[] args) {

        // Zwei PKWs fahren unterschiedlich schnell

        int pkwB = 45;
        int pkwA = 40;
        int toplamDistanz = 100;

        int distanz= pkwB - pkwA;
        int result = toplamDistanz / (pkwB - pkwA);

        System.out.println(result);
    }
}
