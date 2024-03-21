package tage.tag72;

public class ExceptionHandling2 {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Anfang der MAIN methode");

        pauseCode(10);

        System.out.println("Ende der MAIN methode");
    }


    public static void pauseCode(int second) throws InterruptedException {

        // do some tests..

        Thread.sleep(second * 1000);

        // do some more test...

    }
}
