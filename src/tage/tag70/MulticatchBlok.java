package tage.tag70;

public class MulticatchBlok {
    public static void main(String[] args) {

        System.out.println("Before Try");

        try{
            System.out.println("TOP Try block");
            System.out.println("abcTest().contains: " + abcTest().equals("100"));
            System.out.println(1/0);
            System.out.println("END Try block");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array size has changed...");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Imput value ist 0, test failed");
        }
        catch (NullPointerException e)
        {
            System.out.println("DB connection lost... Reset DB");
        }
        catch (Exception e)
        {
            System.out.println("allgemeiner fehler.. prüfe bitte testfall");
        }

        System.out.println("Nach Try");

        //...

    }



    public static String abcTest(){

        // do test automation...
        // do test automation...

        // reads from DB

        //int value = 10;
        //int totalValue = 100 + value;

        return "100";
    }
}
