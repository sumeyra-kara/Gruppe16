package tage.tag71;

public class ExceptionHandlin2 {
    public static void main(String[] args) {


        System.out.println("Hello");

        try{

            System.out.println("Erste Zeile des Try blocks");

            Thread.sleep(10000); //10s

            System.out.println("Zweite Zeile des Try blocks");

            // System.out.println(1/0);
            //throw new NullPointerException(); // Manuelles werfen einer Exception

        }
        catch(Exception e)
        {
            System.out.println("catch block 1");
        }


        System.out.println("Ende Main Methode");





    }
}
