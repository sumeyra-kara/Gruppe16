package tage.tag70;

public class FinallyBlock {
    public static void main(String[] args) {

        System.out.println("TOP of MAIN");

        try{
            System.out.println("Test 1");
            System.out.println("Test 2");

            //DB connection lost
            String expV = "100001ABC, 100021ABC ,100001ABG";

            if(expV.contains("100001ABC")) //exception wurde geworfen
            {
                System.out.println("Test 1 PASSED");
                System.out.println("100021ABC wurde korrekt aus DB ausgelesen.");
            }
            else {
                System.out.println("Test 1 FAILED");
                System.out.println("Der Wert 100021ABC war nicht in der DB vorhanden");
            }

            System.out.println(1/0); // Arithmetische Execption wurde geworfen

            System.out.println("Test 3");
        }
        catch(NullPointerException e){
            System.out.println("DB Connection lost...");
        }

        System.out.println("END of MAIN");



    }
}
